import java.util.Random;

class Main {
    static int[][] multiplicar(int[][] a, int[][] b) {
        int n = a.length;
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 100;
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(10);
                b[i][j] = rand.nextInt(10);
            }
        }
        long inicio = System.nanoTime();
        int[][] c = multiplicar(a, b);
        long fin = System.nanoTime();
        System.out.println("c[0][0] = " + c[0][0]);
        System.out.println("tiempo: " + (fin - inicio) + " ns");
    }
}
