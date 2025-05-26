public class trainer {
    public static void entrenarYMostrar(String nombre, Perceptron p, Dataset dataset) {
        p.entrenar(dataset.entradas, dataset.salidas, 100);

        System.out.println("**** " + nombre + " ****");
        trainingdata.imprimirDatosEntrada(dataset.entradas);
        trainingdata.imprimirPesos(p);
        trainingdata.imprimirEcuacion(p);
        trainingdata.imprimirPrediccionesYPrecision(p, dataset.entradas, dataset.salidas);
    }
}
