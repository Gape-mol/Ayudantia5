import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class mainTest {
        Categoria cienciaFiccion = new Categoria("Ciencia Ficción", "Libros de ciencia ficción");
        Libro libro1 = new Libro("Dune", "Frank Herbert", 123456, "1965");

        @Test
        void testAsignarCategoria() {
                libro1.asignarCategoria(cienciaFiccion);
                assertEquals(cienciaFiccion, libro1.getCategoria());
        }

        @Test
        void testCrearBibliotecas() {
                Biblioteca biblioteca1 = new Biblioteca("Biblioteca1", "Calle 1");
                Biblioteca biblioteca2 = new Biblioteca("Biblioteca2", "Calle 2");
                Biblioteca biblioteca3 = new Biblioteca("Biblioteca3", "Calle 3");
                biblioteca1.agregarLibro(libro1);
                biblioteca2.agregarLibro(libro1);
                System.out.println("El libro '" + libro1.getTitulo() + "' está disponible en las siguientes bibliotecas:");
                for (Biblioteca biblioteca : libro1.getBibliotecas()) {
                        System.out.println("- " + biblioteca.getNombre());
                }
                assertEquals(2, libro1.getBibliotecas().size());
        }

        @Test
        void testEmpleados() {
                Biblioteca biblioteca1 = new Biblioteca("Biblioteca1", "Calle 1");
                Biblioteca biblioteca2 = new Biblioteca("Biblioteca2", "Calle 2");
                Empleado empleado1 = new Empleado("Juan", "1", "Bibliotecario");
                Empleado empleado2 = new Empleado("Ana", "2", "Auxiliar");
                empleado1.setBiblioteca(biblioteca1);
                empleado2.setBiblioteca(biblioteca1);
                System.out.println("Empleados en la " + biblioteca1.getNombre() + ":");
                for (Empleado empleado : biblioteca1.getEmpleados()) {
                        System.out.println("- " + empleado.getNombre() + " (" + empleado.getCargo() + ")");
                }
        }
}
