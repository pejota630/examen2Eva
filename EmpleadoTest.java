import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitarios JUnit 5 para la clase Empleado según análisis de caja negra.
 */
public class EmpleadoTest {

    // CASOS VÁLIDOS
    @Test
    public void crearEmpleadoValido_noDeberiaLanzarExcepcion() {
        assertDoesNotThrow(() -> {
            new Empleado("Ana María", Cargos.DISENADORA, 30000);
        });
    }

    @Test
    public void setterNombreValido() {
        Empleado e = new Empleado("Ana María", Cargos.DISENADORA, 30000);
        assertDoesNotThrow(() -> e.setNombre("Luis Alberto"));
        assertEquals("Luis Alberto", e.getNombre());
    }

    // CASOS NO VÁLIDOS
    @Test
    public void nombreVacio_deberiaLanzar() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Empleado("", Cargos.DESARROLLADOR, 30000);
        });
        assertTrue(ex.getMessage().contains("vacío") || ex.getMessage().contains("vacío"));
    }

    @Test
    public void nombreUnaPalabra_deberiaLanzar() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Empleado("Juan", Cargos.DESARROLLADOR, 30000);
        });
    }

    @Test
    public void cargoInvalido_deberiaLanzar() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Empleado("Luis Miguel", "Cocinero", 30000);
        });
    }

    @Test
    public void salarioNegativo_deberiaLanzar() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Empleado("Luis Miguel", Cargos.DESARROLLADOR, -1000);
        });
    }

    @Test
    public void salarioPorDebajoConvenio_deberiaLanzar() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Empleado("Luis Miguel", Cargos.DESARROLLADOR, Constantes.CONVENIO_SALARIAL - 1);
        });
    }
}
