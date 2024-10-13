package Facultad;

public class Persona {
    private String nombre;
    private String apellidos;
    private String identificacion;
    private String estadoCivil;

    public Persona(String nombre, String apellidos, String identificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(String nuevoEstadoCivil) {
        this.estadoCivil = nuevoEstadoCivil;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + " " + apellidos +
                           "\nIdentificación: " + identificacion +
                           "\nEstado Civil: " + estadoCivil);
    }
}