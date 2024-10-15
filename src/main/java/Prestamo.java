import java.time.LocalDate;

public class Prestamo {
	private LocalDate fechaDePrestamo;
	private LocalDate fechaDeDevolucion;
	private Usuario Usuario;
	private Multa Multa;
	private Libro Libro;
	private Biblioteca biblioteca;

	public Prestamo(Usuario Usuario, Libro Libro, LocalDate fechaDePrestamo, LocalDate fechaDeDevolucion, Biblioteca biblioteca) {
		this.Usuario = Usuario;
		this.Libro = Libro;
		this.biblioteca = biblioteca;
		if(biblioteca.existeLibro(Libro)) {
			this.fechaDePrestamo = fechaDePrestamo;
			this.fechaDeDevolucion = fechaDeDevolucion;
			Usuario.realizarPrestamo(this);
			System.out.println("Prestamo Realizado");
		}
		else {
			System.out.println("El libro no se encuentra en la biblioteca");
		}
	}

	public LocalDate getFechaDeDevolucion() {
		return this.fechaDeDevolucion;
	}

	public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
		this.fechaDeDevolucion = fechaDeDevolucion;
	}

	public LocalDate getFechaDePrestamo() {
		return this.fechaDePrestamo;
	}

	public void setFechaDePrestamo(LocalDate fechaDePrestamo) {
		this.fechaDePrestamo = fechaDePrestamo;
	}
}