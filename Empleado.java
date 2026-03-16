/**
 * Clase que representa a un empleado.
 * Contiene nombre, cargo y salario con validaciones en constructor y setters.
 */
public class Empleado {
    // ...existing code...
    private String nombre;
    private String cargo;
    private double salario;

    /**
     * Construye un empleado validando los parámetros según las reglas definidas.
     *
     * @param nombre nombre completo (no vacío, más de una palabra)
     * @param cargo  uno de los cargos válidos definidos en Cargos
     * @param salario salario (>= Constantes.CONVENIO_SALARIAL)
     * @throws IllegalArgumentException si algún parámetro no cumple las reglas
     */
    public Empleado(String nombre, String cargo, double salario) {
        setNombre(nombre);
        setCargo(cargo);
        setSalario(salario);
    }

    /**
     * Obtiene el nombre del empleado.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado. Debe ser no vacío y contener más de una palabra.
     * @param nombre el nombre a establecer
     * @throws IllegalArgumentException si nombre no cumple criterios
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        String[] partes = nombre.trim().split("\\s+");
        if (partes.length < 2) {
            throw new IllegalArgumentException("El nombre debe contener más de una palabra.");
        }
        this.nombre = nombre.trim();
    }

    /**
     * Obtiene el cargo del empleado.
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo del empleado. Debe ser uno de los valores válidos en Cargos.
     * @param cargo el cargo a establecer
     * @throws IllegalArgumentException si cargo no es válido
     */
    public void setCargo(String cargo) {
        if (cargo == null || !Cargos.isValid(cargo)) {
            throw new IllegalArgumentException("Cargo no válido: " + cargo);
        }
        this.cargo = cargo;
    }

    /**
     * Obtiene el salario del empleado.
     * @return salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado. No puede ser negativo ni por debajo del convenio.
     * @param salario el salario a establecer
     * @throws IllegalArgumentException si salario inválido
     */
    public void setSalario(double salario) {
        if (Double.isNaN(salario)) {
            throw new IllegalArgumentException("Salario inválido.");
        }
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        if (salario < Constantes.CONVENIO_SALARIAL) {
            throw new IllegalArgumentException("El salario no puede estar por debajo del convenio: " + Constantes.CONVENIO_SALARIAL);
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
    // ...existing code...
}
