class Main {
    static long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 30;
        long inicio = System.nanoTime();
        long resultado = fibonacci(n);
        long fin = System.nanoTime();
        System.out.println("fibonacci(" + n + ") = " + resultado);
        System.out.println("tiempo: " + (fin - inicio) + " ns");
    }
}
