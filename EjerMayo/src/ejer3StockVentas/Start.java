package ejer3StockVentas;

import java.io.IOException;
import java.util.ArrayList;

public class Start {

	
		public static void main(String[] args) throws IOException {
			Lector lector = new Lector();
			ArrayList<Producto> productos=lector.getDatos1() ;
		
	     FicheroComun fc=new FicheroComun();
	     fc.escribirTodo();
	       
	        for (Producto producto : productos) {
	            System.out.println(producto);
	        }
	}

}
