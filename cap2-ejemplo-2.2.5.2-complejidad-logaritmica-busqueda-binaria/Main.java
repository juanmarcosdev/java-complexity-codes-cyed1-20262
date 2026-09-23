class Main {
    static int buscar(int[] arr, int objetivo, int bajo, int alto) {
        if (bajo > alto) return -1;
        int medio = (bajo + alto) / 2;
        if (arr[medio] == objetivo) return medio;
        else if (arr[medio] < objetivo) return buscar(arr, objetivo, medio + 1, alto);
        else return buscar(arr, objetivo, bajo, medio - 1);
    }

    public static void main(String[] args) {
        int n = 100000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;
        int objetivo = arr[n - 1];
        long inicio = System.nanoTime();
        int pos = buscar(arr, objetivo, 0, n - 1);
        long fin = System.nanoTime();
        System.out.println("encontrado en: " + pos);
        System.out.println("tiempo: " + (fin - inicio) + " ns");
    }
}
