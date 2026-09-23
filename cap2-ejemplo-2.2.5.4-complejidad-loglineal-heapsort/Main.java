import java.util.Random;

class Main {
    static void heapsort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) {
        int mayor = i;
        int izq = 2 * i + 1;
        int der = 2 * i + 2;
        if (izq < n && arr[izq] > arr[mayor]) mayor = izq;
        if (der < n && arr[der] > arr[mayor]) mayor = der;
        if (mayor != i) {
            int tmp = arr[i];
            arr[i] = arr[mayor];
            arr[mayor] = tmp;
            heapify(arr, n, mayor);
        }
    }

    public static void main(String[] args) {
        int n = 10000;
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) arr[i] = rand.nextInt(n);
        long inicio = System.nanoTime();
        heapsort(arr);
        long fin = System.nanoTime();
        System.out.println("arr[0] = " + arr[0] + ", arr[n-1] = " + arr[n - 1]);
        System.out.println("tiempo: " + (fin - inicio) + " ns");
    }
}
