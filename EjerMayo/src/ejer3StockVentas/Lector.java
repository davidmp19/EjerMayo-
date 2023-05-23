package ejer3StockVentas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lector {
	private static String ST1 = "C:\\Users\\david.DESKTOP-NCFTQIM\\Desktop\\EjerciciosMayo\\ST1.txt";
	private static String ST2 = "C:\\Users\\david.DESKTOP-NCFTQIM\\Desktop\\EjerciciosMayo\\ST2.txt";

	ArrayList<Producto> productos = new ArrayList<Producto>();

	public ArrayList<Producto> getDatos1() throws IOException {

		try {
			String linea;
			FileReader fileReader1 = new FileReader(ST1);
			BufferedReader bu1 = new BufferedReader(fileReader1);

			while ((linea = bu1.readLine()) != null) {

				String id_producto = linea;
				linea = bu1.readLine();

				String nombre = linea;
				linea = bu1.readLine();

				int cantidad = Integer.parseInt(linea);
				linea = bu1.readLine();

				double precio = Double.parseDouble(linea);
				Producto pro = new Producto(id_producto, nombre, cantidad, precio);

				productos.add(pro);

			}
			linea = bu1.readLine();

			bu1.close();

		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		try {
			String linea;
			FileReader fileReader2 = new FileReader(ST2);
			BufferedReader bu2 = new BufferedReader(fileReader2);
			while ((linea = bu2.readLine()) != null) {
				
				
				String id_producto = linea;

				linea = bu2.readLine();
				String nombre = linea;
				linea = bu2.readLine();

				int cantidad = Integer.parseInt(linea);
				linea = bu2.readLine();

				double precio = Double.parseDouble(linea);
				boolean productoExistente=false;
			for(Producto pro: productos) {
			if (pro.getId_producto().equals(id_producto)) {
				productoExistente=true;
				if (pro.getPrecio()!=precio) {
					throw new Exception("El precio no coincide");
				}
				int cantidadNueva=pro.getCantidad() +cantidad;
				pro.setCantidad(cantidadNueva);
				
			}
			}
			if (!productoExistente) {
				Producto pro2 = new Producto(id_producto, nombre, cantidad, precio);
				productos.add(pro2);
			}
						
			
			
			}
			
			
			linea = bu2.readLine();	

			bu2.close();
			

		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return productos;
	}

}
