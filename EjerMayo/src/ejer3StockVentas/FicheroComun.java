package ejer3StockVentas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FicheroComun {
	private static String STComun = "C:\\Users\\david.DESKTOP-NCFTQIM\\Desktop\\EjerciciosMayo\\FicheroComun.txt";
	Lector lector = new Lector();
	
	public void escribirTodo()throws IOException {
		FileWriter fw=new FileWriter(STComun);
		BufferedWriter bw=new BufferedWriter(fw);
		ArrayList<Producto> productos=lector.getDatos1() ;
		try {
			for(Producto pro:productos) {
				bw.write(pro.getId_producto());
				bw.newLine();
				bw.write(pro.getNombre());
				bw.newLine();
				bw.write(String.valueOf(pro.getCantidad()));
				bw.newLine();
				bw.write(String.valueOf( pro.getPrecio()));
				bw.newLine();
			}
			bw.close();
		}  catch (Exception e) {
			e.printStackTrace();
		}
		}
}
