class Main {
    public static void iterar() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        long inicio = System.nanoTime();
        iterar();
        long fin = System.nanoTime();
        System.err.println("tiempo: " + (fin - inicio) + " ns");
    }
}
