import java.util.Random;

class Main {
    static long recorrer(int[][] matriz) {
        long suma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int n = 1000;
        int[][] matriz = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matriz[i][j] = rand.nextInt(100);
        long inicio = System.nanoTime();
        long suma = recorrer(matriz);
        long fin = System.nanoTime();
        System.out.println("suma: " + suma);
        System.out.println("tiempo: " + (fin - inicio) + " ns");
    }
}
