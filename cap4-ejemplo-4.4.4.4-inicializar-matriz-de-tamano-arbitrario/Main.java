class Main {
    public static int[][] inicializarMatriz(int m, int n) {
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = 1;
            }
        }
        return matriz;
    }

    public static void main(String[] args) {
        long inicio = System.nanoTime();
        int[][] matriz = inicializarMatriz(200, 200);
        long fin = System.nanoTime();
        System.out.println("matriz[0][0] = " + matriz[0][0]);
        System.out.println("tiempo: " + (fin - inicio) + " ns");
    }
}
