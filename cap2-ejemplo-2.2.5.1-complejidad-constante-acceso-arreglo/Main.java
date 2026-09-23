class Main {
    static int acceder(int[] arr, int indice) {
        return arr[indice];
    }

    public static void main(String[] args) {
        int n = 1000000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;
        int indice = n / 2;
        long inicio = System.nanoTime();
        int valor = acceder(arr, indice);
        long fin = System.nanoTime();
        System.out.println("arr[" + indice + "] = " + valor);
        System.out.println("tiempo: " + (fin - inicio) + " ns");
    }
}
