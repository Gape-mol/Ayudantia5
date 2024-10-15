import java.util.ArrayList;

public class Libro {
	private String título;
	private String autor;
	private int ISBN;
	private String año_de_publicacion;
	private ArrayList<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
	public Categoría Categoría;

	public void asignarCategoria() {
		throw new UnsupportedOperationException();
	}

	public String getTítulo() {
		return this.título;
	}

	public void setTítulo(String título) {
		this.título = título;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getISBN() {
		return this.ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public String getAño_de_publicacion() {
		return this.año_de_publicacion;
	}

	public void setAño_de_publicacion(String año_de_publicacion) {
		this.año_de_publicacion = año_de_publicacion;
	}
}