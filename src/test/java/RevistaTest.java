import com.mycompany.biblioteca.java.Revista;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RevistaTest {

    private Revista revista;

    public void setUp() {
        revista = new Revista("TIME", 2021, 1923, "TIME Magazine");
    }

    @Test
    public void testConstructor() {
        assertEquals("TIME", revista.getTitulo());
        assertEquals(2021, revista.getAñoPublicacion());
        assertEquals(1923, revista.getNumeroRevista());
        assertEquals("TIME Magazine", revista.getNombreRevista());
    }

    @Test
    public void testMostrarInfo() {
        revista.mostrarInfo();
    }
}
