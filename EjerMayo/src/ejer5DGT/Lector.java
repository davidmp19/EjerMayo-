package ejer5DGT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lector {
	private static String FPropi ="C:\\Users\\david.DESKTOP-NCFTQIM\\Desktop\\EjerciciosMayo\\Propi.txt";
	private static String FCoche = "C:\\Users\\david.DESKTOP-NCFTQIM\\Desktop\\EjerciciosMayo\\Coche.txt";
	private static String FEnlace = "C:\\Users\\david.DESKTOP-NCFTQIM\\Desktop\\EjerciciosMayo\\Enlace.txt";
	
	ArrayList<Propietario> propi = new ArrayList<>();
	ArrayList<Vehiculo> coches = new ArrayList<>();
	
	public ArrayList<Propietario> getDatosPropi() throws IOException {
		try {
			String linea;
			FileReader fileReader = new FileReader(FPropi);
			BufferedReader bu = new BufferedReader(fileReader);
			
			
			while ((linea = bu.readLine()) != null) {
				String dni=linea;
				linea=bu.readLine();
				String nombreApellidos=linea;
				linea=bu.readLine();
				String fechaNaci=linea;
			
				
				Propietario propie=new Propietario(dni, nombreApellidos, fechaNaci);
				propi.add(propie);
			}
			
			
			bu.close();
			
		
		} catch (IOException e) {
		System.out.println("Problemas: " + e.getMessage());
	} catch (Exception e) {
		e.printStackTrace();
	}
	return propi;

}
	public ArrayList<Vehiculo> getDatosCoche() throws IOException {
		try {
			String linea;
			FileReader fileReader = new FileReader(FCoche);
			BufferedReader bu = new BufferedReader(fileReader);
			
			
			while ((linea = bu.readLine()) != null) {
				String matricula=linea;
				linea=bu.readLine();
				String marca=linea;
				linea=bu.readLine();
				String modelo=linea;
				linea=bu.readLine();
				String color=linea;
			
				Vehiculo coche =new Vehiculo(matricula, marca, modelo, color);
				coches.add(coche);
				
			}
			
			
			bu.close();
			
		
		} catch (IOException e) {
		System.out.println("Problemas: " + e.getMessage());
	} catch (Exception e) {
		e.printStackTrace();
	}
	return coches;

}
	public void getDatosEnlace() throws IOException{
	try {
		String linea;
		FileReader fileReader = new FileReader(FEnlace);
		BufferedReader bu = new BufferedReader(fileReader);
		while ((linea = bu.readLine()) != null) {
			String matricula=linea;
			linea=bu.readLine();
			String dni=linea;
			for(Propietario pro:propi) {
			for(Vehiculo coche:coches) {
				if (coche.getMatricula().equals(matricula)&&pro.getDni().equals(dni)) {
					pro.agregarCoche(coche);
				
				}			
				}
			
		}
		
		}
	linea=bu.readLine();
	bu.close();
		
	} catch (IOException e) {
		System.out.println("Problemas: " + e.getMessage());
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
