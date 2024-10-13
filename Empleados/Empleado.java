package Empleados;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String telefono;
    private double salario;
    private int antiguedad;
    private Empleado supervisor;

    // Constructor
    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.antiguedad = 0;  // Se inicializa la antigüedad en 0
        this.supervisor = null;
    }

    // Método para imprimir información del empleado
    public void imprimir() {
        System.out.println("Empleado: " + nombre + " " + apellidos + 
                           "\nDNI: " + dni + 
                           "\nDirección: " + direccion + 
                           "\nTeléfono: " + telefono + 
                           "\nSalario: " + salario + 
                           "\nAntigüedad: " + antiguedad + " años" +
                           (supervisor != null ? "\nSupervisor: " + supervisor.nombre : "\nSin supervisor"));
    }

    // Método para cambiar de supervisor
    public void cambiarSupervisor(Empleado nuevoSupervisor) {
        this.supervisor = nuevoSupervisor;
    }

    // Método para incrementar el salario (cada clase hija lo sobrescribirá)
    public void incrementarSalario() {
        // Este será un método sobrescrito por cada subclase
    }

    // Getters para el salario (por si es necesario acceder desde subclases)
    public double getSalario() {
        return salario;
    }

    // Setters para cambiar salario (utilizado en incremento de salario)
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
