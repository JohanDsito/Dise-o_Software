package Empleados;

import java.util.ArrayList;

import simulador_vehiculos.Coche;

public class JefeDeZona extends Empleado {
    private Secretario secretario;
    private ArrayList<Vendedor> vendedores;
    private Coche coche;

    // Constructor
    public JefeDeZona(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, Secretario secretario, Coche coche) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.secretario = secretario;
        this.coche = coche;
        this.vendedores = new ArrayList<>();
    }

    // Cambiar de secretario
    public void cambiarSecretario(Secretario nuevoSecretario) {
        this.secretario = nuevoSecretario;
    }

    // Cambiar de coche
    public void cambiarCoche(Coche nuevoCoche) {
        this.coche = nuevoCoche;
    }

    // Dar de alta un vendedor
    public void altaVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    // Dar de baja un vendedor
    public void bajaVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Puesto: Jefe de Zona\nSecretario: " + secretario + 
                           "\nCoche: " + coche.toString() + 
                           "\nVendedores a cargo: " + vendedores.size());
    }

    @Override
    public void incrementarSalario() {
        setSalario(getSalario() * 1.20);  // Incremento del 20%
    }
}