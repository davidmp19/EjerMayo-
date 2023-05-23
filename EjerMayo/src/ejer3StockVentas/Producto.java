package ejer3StockVentas;

public class Producto {
	private String id_producto;
	private String nombre;
	private int cantidad;
	private double precio;


	public Producto(String id_producto, String nombre, int cantidad, double precio) {
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getId_producto() {
		return id_producto;
	}
	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}

}
