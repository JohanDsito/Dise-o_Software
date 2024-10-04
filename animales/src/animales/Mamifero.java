package animales;

public class Mamifero extends Animal {

    public Mamifero(String name) {
        super(name); 
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
