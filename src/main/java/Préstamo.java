public class Préstamo {
	private String fecha_de_prestamo;
	private String fecha_de_devolucion;
	public Usuario Usuario;
	public Multa Multa;

	public String getFecha_de_devolucion() {
		return this.fecha_de_devolucion;
	}

	public void setFecha_de_devolucion(String fecha_de_devolucion) {
		this.fecha_de_devolucion = fecha_de_devolucion;
	}

	public String getFecha_de_prestamo() {
		return this.fecha_de_prestamo;
	}

	public void setFecha_de_prestamo(String fecha_de_prestamo) {
		this.fecha_de_prestamo = fecha_de_prestamo;
	}
}