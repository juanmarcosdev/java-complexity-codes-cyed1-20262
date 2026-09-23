class Main {
    static double C(double n) {
        return Math.pow(n, 3) + 2 * Math.pow(n, 2) + n + 5;
    }

    static double g(double n) {
        return Math.pow(n, 2);
    }

    public static void main(String[] args) {
        double c = 1;
        int n0 = -1;
        for (int n = 0; n <= 1000000; n++) {
            if (C(n) > c * g(n)) {
                n0 = n;
                break;
            }
        }
        System.out.println("c = " + c);
        System.out.println("n0 = " + n0);
        System.out.println("C(n0) = " + C(n0));
        System.out.println("c*g(n0) = " + (c * g(n0)));
    }
}
