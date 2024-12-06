package dec6;

import java.util.ArrayList;

public class printAllSubsets {
    public static void printSubset(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void subsetsN(int n, ArrayList<Integer> list) {
        if (n == 0) {
            printSubset(list);
            return;
        }
        // add hoga
        list.add(n);
        subsetsN(n - 1, list);

        // nahi add hoga
        list.remove(list.size() - 1);
        subsetsN(n - 1, list);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        subsetsN(n, list);
    }
}
