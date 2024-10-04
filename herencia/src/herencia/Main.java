package herencia;
public class Main {
    public static void main(String[] args) {
        Circulo circle1 = new Circulo();
        System.out.println(circle1); 
        System.out.println("Área del círculo: " + circle1.getArea());

        Circulo circle2 = new Circulo(1.0, "red");
        System.out.println(circle2); 
        System.out.println("Área del círculo: " + circle2.getArea());

        Cilindro cylinder1 = new Cilindro(1.0);
        System.out.println(cylinder1);  
        System.out.println("Volumen del cilindro: " + cylinder1.getVolumen());

        Cilindro cylinder2 = new Cilindro(1.0, 2.0);
        System.out.println(cylinder2); 
        System.out.println("Volumen del cilindro: " + cylinder2.getVolumen());
    }
}
