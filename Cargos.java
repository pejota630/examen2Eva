/**
 * Clase que contiene la lista de cargos válidos de la empresa.
 * Evita el uso de "magic strings" para cargos en el código.
 */
import java.util.Arrays;
import java.util.List;

public class Cargos {
    public static final String DESARROLLADOR = "Desarrollador";
    public static final String DISENADORA = "Diseñadora";
    public static final String GERENTE = "Gerente";

    public static final List<String> LISTA = Arrays.asList(
            DESARROLLADOR,
            DISENADORA,
            GERENTE
    );

    /**
     * Comprueba si un cargo está en la lista de cargos válidos.
     * @param cargo cargo a comprobar
     * @return true si es válido
     */
    public static boolean isValid(String cargo) {
        if (cargo == null) return false;
        return LISTA.contains(cargo);
    }
}
