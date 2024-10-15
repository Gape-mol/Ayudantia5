import java.util.ArrayList;

public class Categoria {
	private String nombre;
	private String descripcion;
	private ArrayList<Libro> libros;

	public Categoria(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.libros = new ArrayList<Libro>();
	}

	public void agregarLibro(Libro libro) {
		this.libros.add(libro);
	}
	public void eliminarLibro(Libro libro) {
		this.libros.remove(libro);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripción() {
		return this.descripcion;
	}

	public void setDescripción(String descripcion) {
		this.descripcion = descripcion;
	}
	public ArrayList<Libro> getLibros() {
		return this.libros;
	}
}