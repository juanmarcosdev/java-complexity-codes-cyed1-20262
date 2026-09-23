import java.util.ArrayList;
import java.util.List;

class Main {
    static List<List<Integer>> permutar(List<Integer> lista) {
        List<List<Integer>> permutaciones = new ArrayList<>();
        if (lista.isEmpty()) return permutaciones;
        if (lista.size() == 1) {
            permutaciones.add(new ArrayList<>(lista));
            return permutaciones;
        }
        for (int i = 0; i < lista.size(); i++) {
            int actual = lista.get(i);
            List<Integer> restante = new ArrayList<>(lista);
            restante.remove(i);
            for (List<Integer> p : permutar(restante)) {
                List<Integer> nueva = new ArrayList<>();
                nueva.add(actual);
                nueva.addAll(p);
                permutaciones.add(nueva);
            }
        }
        return permutaciones;
    }

    public static void main(String[] args) {
        int n = 8;
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= n; i++) lista.add(i);
        long inicio = System.nanoTime();
        List<List<Integer>> resultado = permutar(lista);
        long fin = System.nanoTime();
        System.out.println("permutaciones generadas: " + resultado.size());
        System.out.println("tiempo: " + (fin - inicio) + " ns");
    }
}
