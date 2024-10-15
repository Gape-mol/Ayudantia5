import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	private String direccion;
	private ArrayList<Libro> libros;
	private ArrayList<Empleado> empleados;

	public Biblioteca(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.libros = new ArrayList<Libro>();
		this.empleados = new ArrayList<Empleado>();
	}

	public void agregarLibro(Libro libro) {
		if (!this.libros.contains(libro)) {
			this.libros.add(libro);
			libro.asignarBibliotecas(this);
		}
	}

	public void eliminarLibro(Libro libro){
		libros.remove(libro);
	}

	public void modificarLibro(Libro libro, String titulo, String autor, int ISBN, String anoDePublicacion) {
		if (this.libros.contains(libro)) {
			String tituloAntiguo = libro.getTitulo();
			String autorAntiguo = libro.getAutor();
			int ISBNAntiguo = libro.getISBN();
			String anoDePublicacionAntiguo = libro.getAnoDePublicacion();
			agregarLibro(new Libro(titulo, autor, ISBN, anoDePublicacion));
		}
	}

	public void agregarEmpleado() {
		throw new UnsupportedOperationException();
	}

	public void modificarEmpleado() {
		throw new UnsupportedOperationException();
	}

	public void eliminarEmpleado() {
		throw new UnsupportedOperationException();
	}

	public void crearCategoria() {
		throw new UnsupportedOperationException();
	}

	public void editarCategoria() {
		throw new UnsupportedOperationException();
	}

	public void eliminarCategoria() {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

}