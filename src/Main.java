public class Main {
    public static void main(String[] args) {
        Dataset[] datasets = {
                DatasetFactory.crearAND2(),
                DatasetFactory.crearOR2(),
                DatasetFactory.crearAND3(),
                DatasetFactory.crearOR3()
        };

        String[] nombres = {
                "AND 2 Entradas",
                "OR 2 Entradas",
                "AND 3 Entradas",
                "OR 3 Entradas"
        };

        for (int i = 0; i < datasets.length; i++) {
            System.out.println("\n==============================");
            trainer.entrenarYMostrar(nombres[i], new Perceptron(datasets[i].entradas[0].length, 0.3), datasets[i]);
        }
    }
}
