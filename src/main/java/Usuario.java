import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private int identificación;
	private ArrayList<Préstamo> prestamos = new ArrayList<Préstamo>();
	private ArrayList<Multa> multas = new ArrayList<Multa>();

	public void realizarPrestamo() {
		throw new UnsupportedOperationException();
	}
}