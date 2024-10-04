package dobleh;

public class Main {
    public static void main(String[] args) {
      
        estudiante student = new estudiante("juan", "Calle 123", "ingenieria", 2024, 50.000);
        System.out.println(student);
 
        staff staff = new staff("maria", "carrera 456", "tecnico profesional", 35.000);
        System.out.println(staff);
    }
}
