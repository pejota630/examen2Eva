/**
 * Clase que gestiona una colección de empleados.
 * Contiene un array llamado 'lista' con los empleados y métodos para gestionarlos.
 */
import java.util.Arrays;

public class Empleados {
    // array que contiene los empleados; el nombre del atributo es 'lista' según requisitos
    private Empleado[] lista;

    /**
     * Construye una colección vacía de empleados.
     */
    public Empleados() {
        this.lista = new Empleado[0];
    }

    /**
     * Añade un empleado a la lista (crece dinámicamente el array).
     * @param empleado empleado a añadir
     */
    public void darAltaEmpleado(Empleado empleado) {
        if (empleado == null) return;
        Empleado[] nuevo = Arrays.copyOf(lista, lista.length + 1);
        nuevo[nuevo.length - 1] = empleado;
        lista = nuevo;
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje.
     * @param porcentaje porcentaje de aumento (ej. 10 para 10%)
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado e : lista) {
            double nuevoSalario = e.getSalario() * (1 + porcentaje / 100.0);
            e.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra por consola el listado de empleados.
     */
    public void mostrarListado() {
        System.out.println(Constantes.TITULO_LISTADO);
        for (Empleado e : lista) {
            System.out.println(e);
        }
    }

    /**
     * Obtiene el array actual de empleados.
     * @return array de empleados
     */
    public Empleado[] getLista() {
        return lista;
    }
}
