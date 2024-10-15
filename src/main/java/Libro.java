import java.util.ArrayList;

public class Libro {
	private String titulo;
	private String autor;
	private int ISBN;
	private String anoDePublicacion;
	private ArrayList<Biblioteca> bibliotecas;
	public Categoria Categoria;

	public Libro(String titulo, String autor, int ISBN, String anoDePublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.anoDePublicacion = anoDePublicacion;
		this.bibliotecas = new ArrayList<Biblioteca>();
	}

	public void asignarCategoria(Categoria categoria) {
		categoria.agregarLibro(this);
		this.Categoria = categoria;
	}

	public void asignarBibliotecas(Biblioteca biblioteca){
		this.bibliotecas.add(biblioteca);
		biblioteca.agregarLibro(this);
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTítulo(String titulo) {
		this.titulo = titulo;
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

	public String getAnoDePublicacion() {
		return this.anoDePublicacion;
	}

	public void setAnoDePublicacion(String anoDePublicacion) {
		this.anoDePublicacion = anoDePublicacion;
	}

	public Categoria getCategoria() {
		return this.Categoria;
	}

	public ArrayList<Biblioteca> getBibliotecas() {
		return this.bibliotecas;
	}

}