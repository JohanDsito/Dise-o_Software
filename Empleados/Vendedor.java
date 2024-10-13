package Empleados;

import java.util.ArrayList;

public class Vendedor extends Empleado {
    private String areaVenta;
    private String telefonoMovil;
    private double porcentajeComision;
    private ArrayList<String> clientes;
    private Coche coche;

    // Constructor
    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String areaVenta, String telefonoMovil, double porcentajeComision, Coche coche) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.areaVenta = areaVenta;
        this.telefonoMovil = telefonoMovil;
        this.porcentajeComision = porcentajeComision;
        this.coche = coche;
        this.clientes = new ArrayList<>();
    }

    // Agregar cliente
    public void altaCliente(String cliente) {
        clientes.add(cliente);
    }

    // Eliminar cliente
    public void bajaCliente(String cliente) {
        clientes.remove(cliente);
    }

    // Cambiar de coche
    public void cambiarCoche(Coche nuevoCoche) {
        this.coche = nuevoCoche;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Vendedor\nÁrea de venta: " + areaVenta + "\nTeléfono móvil: " + telefonoMovil + 
                           "\nCoche: " + coche.toString() + "\nClientes: " + clientes.toString());
    }

    @Override
    public void incrementarSalario() {
        setSalario(getSalario() * 1.10);  // Incremento del 10%
    }
}