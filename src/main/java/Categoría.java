import java.util.ArrayList;

public class Categoría {
	private String nombre;
	private String descripción;
	private ArrayList<Libro> libros = new ArrayList<Libro>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripción() {
		return this.descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
}