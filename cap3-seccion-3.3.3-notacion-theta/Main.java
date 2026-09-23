class Main {
    static double C(double n) {
        return Math.pow(n, 3) + 2 * Math.pow(n, 2) + n + 5;
    }

    static double g(double n) {
        return Math.pow(n, 3);
    }

    public static void main(String[] args) {
        double c1 = 0.5;
        double c2 = 2;
        int n0 = -1;
        for (int n = 0; n <= 1000000; n++) {
            if (c1 * g(n) <= C(n) && C(n) <= c2 * g(n)) {
                n0 = n;
                break;
            }
        }
        System.out.println("c1 = " + c1 + ", c2 = " + c2);
        System.out.println("n0 = " + n0);
        System.out.println("c1*g(n0) = " + (c1 * g(n0)));
        System.out.println("C(n0) = " + C(n0));
        System.out.println("c2*g(n0) = " + (c2 * g(n0)));
    }
}
