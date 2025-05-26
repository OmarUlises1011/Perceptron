public class Perceptron {
    private double[] pesos;
    private double tasaAprendizaje;
    private double bias;
    private double umbral = 0.5;

    public Perceptron(int numEntradas, double tasaAprendizaje) {
        this.pesos = new double[numEntradas];
        this.tasaAprendizaje = tasaAprendizaje;
        inicializarPesos();
        this.bias = Math.random() * 0.3;
    }

    private void inicializarPesos() {
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = Math.random() * 0.1;
        }
    }

    public int predecir(int[] entradas) {
        double suma = bias;
        for (int i = 0; i < pesos.length; i++) {
            suma += entradas[i] * pesos[i];
        }
        return (suma > umbral) ? 1 : 0;
    }

    public void entrenar(int[][] conjuntoEntradas, int[] conjuntoSalidas, int numRondas) {
        for (int ronda = 0; ronda < numRondas; ronda++) {
            for (int i = 0; i < conjuntoEntradas.length; i++) {
                int prediccion = predecir(conjuntoEntradas[i]);
                int error = conjuntoSalidas[i] - prediccion;
                if (error != 0) {
                    actualizarPesos(conjuntoEntradas[i], error);
                }
            }
        }
    }

    private void actualizarPesos(int[] entradas, int error) {
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] += tasaAprendizaje * error * entradas[i];
        }
        bias += tasaAprendizaje * error;
    }

    public double[] getPesos() {
        return pesos;
    }

    public double getBias() {
        return bias;
    }
}
