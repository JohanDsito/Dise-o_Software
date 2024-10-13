package simulador_vehiculos;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("ABC-123", 4);
        System.out.println(coche);

        coche.acelerar(50);
        System.out.println(coche);

        Camion camion = new Camion("XYZ-789");
        System.out.println(camion);

        camion.acelerar(60);
        System.out.println(camion);

        Remolque remolque = new Remolque(2000);
        camion.ponRemolque(remolque);
        System.out.println(camion);
        
        camion.acelerar(50); 
        System.out.println(camion);
    }
}