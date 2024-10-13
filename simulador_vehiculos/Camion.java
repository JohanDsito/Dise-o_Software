package simulador_vehiculos;

public class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null; 
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(int incremento) {
        if (remolque != null && (velocidad + incremento) > 100) {
            System.out.println("¡Demasiado rápido con el remolque!");
        } else {
            super.acelerar(incremento); 
        }
    }

    @Override
    public String toString() {
        String infoCamion = "Camion [Matrícula: " + super.toString();
        if (remolque != null) {
            infoCamion += ", Remolque: " + remolque.toString();
        }
        return infoCamion + "]";
    }
}