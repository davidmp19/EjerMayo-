package ejer5DGT;

import java.io.IOException;
import java.util.ArrayList;


public class Start {

	public static void main(String[] args) throws IOException{
		Lector lector=new Lector();
		FicheroComun fc=new FicheroComun();
		fc.escribirTodo();
	/*
		ArrayList<Propietario> pro=lector.getDatosPropi();
		ArrayList<Vehiculo> coche=lector.getDatosCoche();
		lector.getDatosEnlace();
		for(Propietario propi:pro) {
			System.out.println(propi);
			}
		*/
	}

}
