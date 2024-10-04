package animales;

public class Main {
    public static void main(String[] args) {
      
        Gato Gato1 = new Gato("Michi");
        System.out.println(Gato1);
        Gato1.greets(); 
   
        Perro dog1 = new Perro("Buddy");
        Perro dog2 = new Perro("Max");
        System.out.println(dog1);
        dog1.greets(); 

      
        dog1.greets(dog2); 
    }
}
