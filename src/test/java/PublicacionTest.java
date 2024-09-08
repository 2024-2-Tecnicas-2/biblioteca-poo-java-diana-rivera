import com.mycompany.biblioteca.java.Publicacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PublicacionTest {

    private Publicacion publicacion;

    public void setUp() {
        publicacion = new Publicacion("Historia de dos ciudades", 1859);
    }

    @Test
    public void testConstructor() {
        assertEquals("Historia de dos ciudades", publicacion.getTitulo());
        assertEquals(1859, publicacion.getAñoPublicacion());
    }

    @Test
    public void testMostrarInfo() {
        publicacion.mostrarInfo();
    }
}
