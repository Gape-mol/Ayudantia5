import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private int identificacion;
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Multa> multas;

	public Usuario(String nombre, int identificacion) {
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.prestamos = new ArrayList<Prestamo>();
		this.multas = new ArrayList<Multa>();
	}
	public void realizarPrestamo(Prestamo prestamo) {
		prestamos.add(prestamo);
	}
	public void agregarMulta(Multa multa){
		multas.add(multa);
	}

	public String getNombre() {
		return nombre;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public ArrayList<Multa> getMultas() {
		return multas;
	}
}