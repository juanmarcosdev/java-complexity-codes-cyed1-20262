class Main {
    static int buscar(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 100000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;
        long inicio = System.nanoTime();
        int pos = buscar(arr, arr[n - 1]);
        long fin = System.nanoTime();
        System.out.println("encontrado en: " + pos);
        System.out.println("tiempo: " + (fin - inicio) + " ns");
    }
}
