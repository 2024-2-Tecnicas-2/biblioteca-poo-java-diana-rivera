import com.mycompany.biblioteca.java.Libro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {
    private Libro libro;

    public void setUp() {
        libro = new Libro("El Quijote", 1605, "Miguel de Cervantes", 500);
    }

    @Test
    public void testConstructor() {
        assertEquals("El Quijote", libro.getTitulo());
        assertEquals(1605, libro.getAñoPublicacion());
        assertEquals("Miguel de Cervantes", libro.getAutor());
        assertEquals(500, libro.getNumPaginas());
    }

    @Test
    public void testMostrarInfo() {
        libro.mostrarInfo();
    }
}
