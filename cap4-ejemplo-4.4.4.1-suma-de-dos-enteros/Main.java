class Main {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 348;
        int b = 921;
        long inicio = System.nanoTime();
        int resultado = sumar(a, b);
        long fin = System.nanoTime();
        System.out.println(a + " + " + b + " = " + resultado);
        System.out.println("tiempo: " + (fin - inicio) + " ns");
    }
}
