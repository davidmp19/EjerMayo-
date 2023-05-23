package ejer5DGT;

import java.util.ArrayList;

public class Propietario {
	private String dni;
	private String nombreApellidos;
	private String fechaNaci;
	private ArrayList<Vehiculo> vehiculos;
	public Propietario(String dni, String nombreApellidos, String fechaNaci) {
		
		this.dni = dni;
		this.nombreApellidos = nombreApellidos;
		this.fechaNaci = fechaNaci;
		 this.vehiculos = new ArrayList<>();
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombreApellidos() {
		return nombreApellidos;
	}
	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}
	public String getFechaNaci() {
		return fechaNaci;
	}
	public void setFechaNaci(String fechaNaci) {
		this.fechaNaci = fechaNaci;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void agregarCoche(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}
	@Override
	public String toString() {
		return "Propietario [dni=" + dni + ", nombreApellidos=" + nombreApellidos + ", fechaNaci=" + fechaNaci
				+ ", vehiculos=" + vehiculos + "]";
	}
	
}
