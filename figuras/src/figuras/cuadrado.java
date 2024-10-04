package figuras;

public class cuadrado extends rectangulo {
    
    public cuadrado() {
    }

    public cuadrado(double side) {
        super(side, side); 
    }

    public cuadrado(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); 
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side); 
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
