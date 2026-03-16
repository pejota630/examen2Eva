import java.util.Scanner;

/**
 * Aplicación principal que gestiona empleados usando la clase Empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * Punto de entrada de la aplicación.
     * @param args argumentos
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados();

        // Dar de alta los empleados de ejemplo usando Cargos constantes
        empleados.darAltaEmpleado(new Empleado("Juan Pérez", Cargos.DESARROLLADOR, 50000));
        empleados.darAltaEmpleado(new Empleado("María López", Cargos.DISENADORA, 45000));
        empleados.darAltaEmpleado(new Empleado("Pedro García", Cargos.GERENTE, 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(Constantes.PROMPT_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        empleados.mostrarListado();

        scanner.close();
    }
}
