class Main {
    public static void imprimirElementos(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int n = 20;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i * i;
        long inicio = System.nanoTime();
        imprimirElementos(arr);
        long fin = System.nanoTime();
        System.out.println("tiempo: " + (fin - inicio) + " ns");
    }
}
