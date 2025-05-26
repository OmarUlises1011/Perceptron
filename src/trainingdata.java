public class trainingdata {
    public static void imprimirDatosEntrada(int[][] conjuntoEntradas) {
        System.out.println("Entradas:");
        for (int[] entrada : conjuntoEntradas) {
            for (int i = 0; i < entrada.length; i++) {
                System.out.print(entrada[i] + (i < entrada.length - 1 ? " " : ""));
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imprimirPesos(Perceptron perceptron) {
        System.out.println("Pesos aprendidos:");
        double[] pesos = perceptron.getPesos();
        for (int i = 0; i < pesos.length; i++) {
            System.out.printf("w%d: %.8f%n", i + 1, pesos[i]);
        }
        System.out.printf("Bias: %.8f%n", perceptron.getBias());
        System.out.println();
    }

    public static void imprimirEcuacion(Perceptron perceptron) {
        System.out.println("Ecuación del modelo:");
        StringBuilder sb = new StringBuilder("Y = ");
        double[] pesos = perceptron.getPesos();
        for (int i = 0; i < pesos.length; i++) {
            sb.append(String.format("(%.8f * x%d)", pesos[i], i + 1));
            if (i < pesos.length - 1) sb.append(" + ");
        }
        sb.append(String.format(" + %.8f", perceptron.getBias()));
        System.out.println(sb);
        System.out.println();
    }

    public static void imprimirPrediccionesYPrecision(Perceptron perceptron, int[][] entradas, int[] salidas) {
        System.out.println("Predicciones:");
        int correctas = 0;
        for (int i = 0; i < entradas.length; i++) {
            int prediccion = perceptron.predecir(entradas[i]);
            System.out.print("Entrada: ");
            for (int j = 0; j < entradas[i].length; j++) {
                System.out.print(entradas[i][j] + (j < entradas[i].length - 1 ? " " : ""));
            }
            System.out.println(" -> Salida: " + prediccion);
            if (prediccion == salidas[i]) correctas++;
        }
        double precision = 100.0 * correctas / entradas.length;
        System.out.printf("Precisión del modelo: %.2f%%%n", precision);
    }
}
