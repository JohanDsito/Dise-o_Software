package Empleados;

public class Secretario extends Empleado {
    private String despacho;
    private String numeroFax;

    // Constructor
    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String despacho, String numeroFax) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Secretario\nDespacho: " + despacho + "\nFax: " + numeroFax);
    }

    @Override
    public void incrementarSalario() {
        setSalario(getSalario() * 1.05);  // Incremento del 5%
    }
}