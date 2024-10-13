package simulador_vehiculos;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String matricula, int numPuertas) {
        super(matricula); 
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    @Override
    public String toString() {
        return "Coche [Matrícula: " + super.toString() + ", Número de puertas: " + numPuertas + "]";
    }
}