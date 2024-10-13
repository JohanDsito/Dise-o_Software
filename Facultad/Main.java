package Facultad;

public class Main {
    public static void main(String[] args) {
        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Laura", "Gómez", "12345678A", "Soltero/a", "1º de Ingeniería");
        estudiante.imprimir();
        System.out.println();
        
        // Matricular en un nuevo curso
        estudiante.matricularNuevoCurso("2º de Ingeniería");
        estudiante.imprimir();
        System.out.println();
        
        // Crear un profesor
        Profesor profesor = new Profesor("Carlos", "Pérez", "87654321B", "Casado/a", 2015, 101, "Matemáticas");
        profesor.imprimir();
        System.out.println();
        
        // Cambiar departamento del profesor
        profesor.cambiarDepartamento("Lenguajes");
        profesor.imprimir();
        System.out.println();
        
        // Crear personal de servicio
        PersonalDeServicio personal = new PersonalDeServicio("Ana", "Martínez", "11223344C", "Divorciado/a", 2010, 202, "Biblioteca");
        personal.imprimir();
        System.out.println();
        
        // Trasladar a una nueva sección
        personal.trasladarSeccion("Decanato");
        personal.imprimir();
        System.out.println();
        
        // Cambiar el estado civil de una persona
        profesor.cambiarEstadoCivil("Divorciado/a");
        profesor.imprimir();
    }
}