package ejer5DGT;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FicheroComun {
	private static String DatosDGT = "C:\\Users\\david.DESKTOP-NCFTQIM\\Desktop\\EjerciciosMayo\\DatosDGT.txt";
	Lector lector = new Lector();

	public void escribirTodo() throws IOException {

		FileWriter fw = new FileWriter(DatosDGT);
		BufferedWriter bw = new BufferedWriter(fw);
		ArrayList<Propietario> propi = lector.getDatosPropi();
		ArrayList<Vehiculo> coche = lector.getDatosCoche();
		lector.getDatosEnlace();
		try {
			for (Propietario pro : propi) {
				for (Vehiculo co : pro.getVehiculos()) {
					bw.write(pro.getDni());
					bw.newLine();
					bw.write(pro.getNombreApellidos());
					bw.newLine();
					bw.write(pro.getFechaNaci());
					bw.newLine();
					bw.write(co.getMatricula());
					bw.newLine();
					bw.write(co.getMarca());
					bw.newLine();
					bw.write(co.getModelo());
					bw.newLine();
					bw.write(co.getColor());
					bw.newLine();
				}
			}

			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}