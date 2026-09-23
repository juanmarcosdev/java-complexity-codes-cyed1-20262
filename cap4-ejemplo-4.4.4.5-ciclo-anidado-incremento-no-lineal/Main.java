class Main {
    public static void recorrerMatrizVacia(int m, int n) {
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j += 2) {
            }
        }
    }

    public static void main(String[] args) {
        long inicio = System.nanoTime();
        recorrerMatrizVacia(200, 200);
        long fin = System.nanoTime();
        System.out.println("tiempo: " + (fin - inicio) + " ns");
    }
}
