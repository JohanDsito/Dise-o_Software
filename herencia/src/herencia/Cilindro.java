package herencia;

public class Cilindro extends Circulo {
	
    private double height = 1.0;

    public Cilindro() {
        super(); 
    }
    
    public Cilindro(double height) {
        super(); 
        this.height = height;
    }
    
    public Cilindro(double radio, double height) {
        super(radio);
        this.height = height;
    }
    
    public Cilindro(double radio, double height, String color) {
        super(radio, color);
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolumen() {
        return getArea() * height;
    }
    
    @Override
    public String toString() {
        return "Cilindro [radio=" + getRadio() + ", height=" + height + ", color=" + getColor() + "]";
    }
}