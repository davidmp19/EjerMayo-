package ejer4Cines;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lector {
	private static String FCine = "C:\\Users\\david.DESKTOP-NCFTQIM\\Desktop\\EjerciciosMayo\\Cine.txt";
	private static String FPeliculas = "C:\\Users\\david.DESKTOP-NCFTQIM\\Desktop\\EjerciciosMayo\\Peliculas.txt";

	ArrayList<Cine> cines = new ArrayList<>();
	ArrayList<Peliculas> pelis = new ArrayList<>();

	public ArrayList<Cine> getDatosCine() throws IOException {

		try {
			String linea;
			FileReader fileReader = new FileReader(FCine);
			BufferedReader bu = new BufferedReader(fileReader);

			while ((linea = bu.readLine()) != null) {
				String codigo = linea;
				linea = bu.readLine();
				String nombre = linea;
				linea = bu.readLine();
				int numSalas = Integer.parseInt(linea);
				linea = bu.readLine();
				String localidad = linea;

				Cine cine = new Cine(codigo, nombre, numSalas, localidad);
				cines.add(cine);

			}
			linea = bu.readLine();
			bu.close();

		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cines;

	}

	public ArrayList<Peliculas> getDatosPeliculas() throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(FPeliculas))) {

			ArrayList<String> codigos = new ArrayList<>();

			String linea;
			while ((linea = br.readLine()) != null) {
				String titulo = linea.trim();
				linea = br.readLine().trim();
				String director = linea.trim();
				linea = br.readLine().trim();
				int ano = Integer.parseInt(linea.trim());
				linea = br.readLine().trim();
				String[] codigosPelicula = linea.split("\\*");
				for (String codigo : codigosPelicula) {
					codigos.add(codigo);
					for (Cine cine : cines) {
						if (cine.getCodigo().equals(codigo)) {
							Peliculas pelicula = new Peliculas(titulo, director, ano, codigo);
							pelis.add(pelicula);
							cine.agregarPelicula(pelicula);
						}
					}
				}

			}
		}

		return pelis;

		
	}
}
