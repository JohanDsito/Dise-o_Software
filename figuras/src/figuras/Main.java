package figuras;

public class Main {
    public static void main(String[] args) {

        shape shape = new shape("blue", false);
        System.out.println(shape);

        circulo circle = new circulo(2.5, "green", true);
        System.out.println(circle);
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());

        rectangulo rectangle = new rectangulo(2.0, 4.0, "yellow", false);
        System.out.println(rectangle);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());

  
        cuadrado square = new cuadrado(5.0, "purple", true);
        System.out.println(square);
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Perimeter of Square: " + square.getPerimeter());
    }
}
