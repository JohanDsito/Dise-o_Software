package simulador_vehiculos;
public class Vehiculo {
    private String matricula;
    protected int velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0; 
    }

    public void acelerar(int incremento) {
        velocidad += incremento;
    }

    @Override
    public String toString() {
        return "Vehiculo [Matrícula: " + matricula + ", Velocidad: " + velocidad + " km/h]";
    }
}