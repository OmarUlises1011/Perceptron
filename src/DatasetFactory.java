public class DatasetFactory {
    public static Dataset crearAND2() {
        return new Dataset(
                new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 1}},
                new int[]{0, 0, 0, 1}
        );
    }

    public static Dataset crearOR2() {
        return new Dataset(
                new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 1}},
                new int[]{0, 1, 1, 1}
        );
    }

    public static Dataset crearAND3() {
        return new Dataset(
                new int[][]{
                        {0, 0, 0}, {0, 0, 1}, {0, 1, 0}, {0, 1, 1},
                        {1, 0, 0}, {1, 0, 1}, {1, 1, 0}, {1, 1, 1}
                },
                new int[]{0, 0, 0, 0, 0, 0, 0, 1}
        );
    }

    public static Dataset crearOR3() {
        return new Dataset(
                new int[][]{
                        {0, 0, 0}, {0, 0, 1}, {0, 1, 0}, {0, 1, 1},
                        {1, 0, 0}, {1, 0, 1}, {1, 1, 0}, {1, 1, 1}
                },
                new int[]{0, 1, 1, 1, 1, 1, 1, 1}
        );
    }
}
