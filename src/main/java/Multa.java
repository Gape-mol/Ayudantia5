import java.time.LocalDate;

public class Multa {
	private int monto;
	private LocalDate fechaDeGeneracion;
	private boolean estado;
	public Usuario Usuario;
	public Prestamo Prestamo;

	public Multa(int monto, LocalDate fechaDeGeneracion, Usuario Usuario, Prestamo Prestamo) {
		this.monto = monto;
		this.fechaDeGeneracion = fechaDeGeneracion;
		this.estado = false;
		this.Usuario = Usuario;
		this.Prestamo = Prestamo;
		Usuario.agregarMulta(this);
	}

	public void pagarMulta(){
		this.estado = true;
	}

	public void generarMulta() {

	}
}