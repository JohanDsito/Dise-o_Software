package Empleados;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de prueba
        Coche cocheVendedor = new Coche("ABC-123", "Toyota", "Corolla");
        Coche cocheJefe = new Coche("XYZ-789", "Audi", "A6");
        
        Secretario secretario = new Secretario("Ana", "López", "11223344Z", "Calle Falsa 123", "987654321", 20000, "Despacho 101", "123456789");
        Vendedor vendedor = new Vendedor("Carlos", "García", "22334455X", "Calle Real 456", "912345678", 25000, "Norte", "666777888", 0.10, cocheVendedor);
        JefeDeZona jefe = new JefeDeZona("Pedro", "Martínez", "33445566Y", "Calle Central 789", "987654321", 40000, secretario, cocheJefe);
        
        // Añadir un vendedor al jefe
        jefe.altaVendedor(vendedor);
        
        // Probar incrementos de salario
        secretario.incrementarSalario();
        vendedor.incrementarSalario();
        jefe.incrementarSalario();
        
        // Imprimir información de cada empleado
        secretario.imprimir();
        System.out.println();
        vendedor.imprimir();
        System.out.println();
        jefe.imprimir();
    }
}
