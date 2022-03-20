import java.util.ArrayList;
import java.util.Collections;

public class RHC {
    private static int counter = 0;
    public static ArrayList<Integer> Q51(int M[][], int ITER) {

        int counter1 = 0;

        if (String.valueOf(ITER).equals(null))
            if (ITER < 1) {
                return null;
            }

        if (Main.Q1(M) == false) // 1
        {
            return null;
        }
        ArrayList<Integer> c = Main.Q2R(M.length); // 2
        int best_fitness = Main.Q3(M, c);


        for (int x = 1; x < ITER; x++) {
            ArrayList<Integer> small_change = Main.Q4(c);
            int new_fitness = Main.Q3(M, small_change);

            //  System.out.println("current fitness: " + best_fitness);
            //  System.out.println("new fitness: " + new_fitness);

            counter1++;
            if (new_fitness > best_fitness) {
                counter = 0;

                c = (ArrayList<Integer>) small_change.clone();

                best_fitness = new_fitness;
            } else {

                counter++;
            }

            if (counter == 5000) {
                System.out.println("fitness hasn't changed for 500 times");
                return c;
            }

        }
        System.out.println(best_fitness);
        return c;

    }
    class CS2004MunchB {
        public static ArrayList<Integer> smallChangeOperator (ArrayList<Integer> cluster){
            if (cluster == null) {
                return null;
            }
            if (cluster.size() == 0) {
                return null;
            }
            for (int i = 0; i < cluster.size(); i++) {
                if (cluster.get(i) < 1 || cluster.get(i) > cluster.size()) {
                    return null;
                }
            }


            ArrayList<Integer> clusterC = (ArrayList<Integer>)cluster.clone();
            int n = clusterC.size() - 1;
            int number = CS2004.UI(1, n);
            int index = CS2004.UI(0, n);
            while (clusterC.get(index).equals(number)) {
                number = CS2004.UI(1, n);
            }
            clusterC.set(index, number);
            return clusterC;
        }
        public static int EVMFitness (ArrayList<Integer> cluster, int[][] MDG){
            // NULL
            if (cluster == null) {
                return Integer.MIN_VALUE;
            }
            if (MDG == null) {
                return Integer.MAX_VALUE;
            }

            // EMPTY
            if (!checkValidMDG(MDG)) {
                return Integer.MAX_VALUE;
            }
            if (cluster.size() == 0) {
                return Integer.MIN_VALUE;
            }
            if (MDG.length != cluster.size()) {
                return Integer.MAX_VALUE;
            }
            for (int i = 0; i < cluster.size(); i++) {
                if (cluster.get(i) < 1) {
                    return Integer.MIN_VALUE;
                }
                if (cluster.get(i) > cluster.size()) {
                    return Integer.MIN_VALUE;
                }
                if (cluster.get(i) == null) {
                    return Integer.MIN_VALUE;
                }
            }
            // EVM FITNESS
            int evm = 0;
            int c1;
            int c2;
            for (int j = 0; j < MDG.length - 1; j++) {
                for (int k = j+1; k < MDG.length; k++) {
                    c1 = cluster.get(j);
                    c2 = cluster.get(k);
                    if (c1 == c2) {
                        evm = evm + 2*MDG[j][k] - 1;
                    }
                }
            }
            return evm;

        }
        public static boolean checkValidMDG (int[][] MDG){
            // MDG NULL
            if (MDG == null) {
                return false;
            }
            // MDG ZERO IN SIZE
            if (MDG.length < 1) {
                return false;
            }

            // MDG SQUARE
            for (int x = 0; x < MDG.length; x++) {
                if (MDG[x] == null) {
                    return false;
                }
                if (MDG[x].length != MDG.length) {
                    return false;
                }
            }
            // SYMMETRICAL
            for (int i = 0; i < MDG.length; i++) {
                // INVERSE
                for (int j = 0; j < MDG.length; j++) {
                    if (MDG[i][j] != MDG[j][i]) {
                        return false;
                    }
                }
            }
            // LEADING DIAGONAL
            for (int i = 0; i < MDG.length; i++) {
                if (MDG[i][i] != 0) {
                    return false;
                }
            }

            // BINARY

            for (int i = 0; i < MDG.length; i++) {
                for (int j = 0; j < MDG.length; j++) {
                    if (MDG[i][j] != 0 && MDG[j][i] != 1) {
                        return false;
                    }
                }
            }

            return true;

        }
        public static ArrayList<Integer> initialStartingPoint (int n){
            if (n < 1) {
                return null;
            }
            ArrayList<Integer> cluster = new ArrayList<>();
            for (int i = 1; i < n+1; i++) {
                cluster.add(i);
            }
            Collections.shuffle(cluster);
            return cluster;
        }
        public static ArrayList<Integer> runMunchProgram (int iterations, int[][] MDG){
            if (!checkValidMDG(MDG)) {
                return null;
            }
            if (iterations < 1) {
                return new ArrayList<Integer>();
            }
            ArrayList<Integer> C = initialStartingPoint(MDG.length);
            int currentFitness = EVMFitness(C, MDG);
            for (int x = 1; x < iterations; x++) {
                ArrayList<Integer> smallChange = smallChangeOperator(C);
                int newFitness = EVMFitness(smallChange, MDG);
                if (newFitness > currentFitness) {
                    C = (ArrayList<Integer>) smallChange.clone();
                    currentFitness = newFitness;
                }

            }
            return C;
        }
    }
}

