import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task2Part2 {
    static int counter = 0;
    public static final int [][] p38 = matrix. p38;
    public static void main(String[] args) {

        Q5(p38, 5000);
//        Q4(Q2(5));

    }

    public static boolean Q1(int[][] mdg) {
        // Null
        if (mdg == null) {
            return false;
        }
        // Empty
        if (mdg.length <= 1) {
            return false;
        }
        // Squared
        for (int x = 0; x < mdg.length; x++) {
            if (mdg[x].length != mdg.length) {
                return false;
            }
        }
        // Binary
        for (int i = 0; i < mdg.length; i++) {
            for (int j = 0; j < mdg.length; j++) {
                if (mdg[i][j] != 0 && mdg[i][j] != 1) {
                    return false;
                }
            }
        }
        // Symmetry
        for (int i = 0; i < mdg.length; i++) {
            if (mdg[i][i] != 0) {
                return false;
            }
        }
        // Inverse
        for (int i = 0; i < mdg.length; i++) {
            for (int j = 0; j < mdg.length; j++) {
                if (mdg[i][j] != mdg[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }


    /*
     * Q2
     * Write a method that creates the intial starting clustering point (arrangement). The starting clustering arrangement,
     * which should be in vector format [as described above] i.e. ArrayList of integers, should assume every element/variable/
     * module is in its own cluster. It assumes that all modules are independent and there is no relationship between modules.
     */
//    public static int [] Q2(int n) {
//        if (n < 1) {
//            return null;
//        }
//
////		if (isInteger(n)) {
////			//System.out.println("Alphabetical");
////    	}
////		if (Character.(n)) {
////			//System.out.println("Digit");
////    	}
//
//        int[] cluster  = new int[n+1];
//        // The value of each item in the cluster corresponds to the cluster number, so item '2' belongs to cluster 2
//        for (int i = 1; i < x + 1; i++) {
//            // For each i, iterate i + 1 times
//            for (int j = 2; j <= i + 1; j++) {
//                cluster.add((double)i);
//            }
//        }
//        System.out.println(cluster);
//        return cluster;
//    }
    public static int[] Q2R(int n) {
        if (String.valueOf(n).equals(null)){

        }
        if (n < 1) {
            //FALSE1
        }
        int[] cluster = new int[n];

        for (int i = 0; i < n; i++) {
            cluster[i] = i;
        }

        Random rand = new Random();

        for (int i = 0; i < cluster.length; i++) {
            int randomIndexToSwap = rand.nextInt(cluster.length);
            int temp = cluster[randomIndexToSwap];
            cluster[randomIndexToSwap] = cluster[i];
            cluster[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(cluster[i] + ", ");
        }
        return cluster;
    }

    public static int Q3(int[][] mdg, int[] C) {
        if (!Q1(mdg)) {
            System.out.println("Invalid mdg");
            return -1;
        }

        if (C == null) {
            System.out.println("C = null");
            return -1;
        }
        if (mdg.length != C.length) {
            return -1;
        }


        for (int i = 0; i < C.length; i++) {
            if (C[i] < 1) {
                System.out.println("Negative");
            }
//    		if (Character.isAlphabetic(C.get(i))) {
//    			//System.out.println("Alphabetical");
//        	}
//    		if (Character.isDigit(C.get(i))) {
//    			//System.out.println("Digit");
//        	}


        }

        int evm = 0;
        int c1;
        int c2;
        for (int j = 0; j < mdg.length-1; j++) {

            for (int k = j + 1; k < mdg.length; k++) {

                c1 = C[j];
                c2 = C[k];

                if (c1 == c2) {
                    evm = evm + 2 * mdg[j][k] - 1;
                }
            }
        }
        System.out.println("This is evm " + evm);
        return evm;
    }

    public static int[] Q4(int[] C) {
        System.out.println(C);
        if (C == null) {
            System.out.println("Null");
        }
        if (C.length == 0) {
            System.out.println("Size too small");
        }
        for (int i = 0; i < C.length; i++) {
            if (C[i] < 1) {
                System.out.println("Negative");
            }
//    		if (Character.isAlphabetic(C.get(i))) {
//    			//System.out.println("Alphabetical");
//        	}
//    		if (Character.isDigit(C.get(i))) {
//    			//System.out.println("Digit");
//        	}
        }
        int[] ClusteringArrangment = C.clone();
        int number_size = ClusteringArrangment.length;
        Random rand = new Random();
        int number = UI_Int(1, number_size );
        //number = Math.floor(number);

        int index = UI_Int(0, number_size-1);
        while (ClusteringArrangment[index] == number) {
            number = UI_Int(1,number_size);
        }
        ClusteringArrangment[index] = number;
        System.out.println(ClusteringArrangment);
        return ClusteringArrangment;
    }

    public static int[] Q5(int[][] M, int ITER) {
        if (ITER < 1) {
            return null;
        }

        if (Character.isAlphabetic(ITER)) {
            //System.out.println("Alphabetical");
        }
        if (Character.isDigit(ITER)) {
            //System.out.println("Digit");
        }
        if (Q1(M) == false) // 1
        {
            return null;
        }
        int[] c = Q2R(M.length); // 2
        System.out.println("Step 2 C: " + c);
        int best_fitness = 0;


        for (int x = 1; x < ITER; x++) {

            int[] small_change = Q4(c);
            System.out.println("SMALL CHANGE:" + small_change);
            int new_fitness = Q3(M, small_change);
            System.out.println("Q3 test: " + new_fitness);

        //    System.out.println("Q3" + Q3(M, small_change));

            System.out.println("current fitness: " + best_fitness);
            System.out.println("new fitness: " + new_fitness);


            if (new_fitness > best_fitness) {

//    			c = (ArrayList<Double>) small_change.clone();
                for (int i = 0; i < c.length; i++) {

                }

                best_fitness = new_fitness;
                c = small_change;
            }

        }

        return c;


    }
//    public static ArrayList<Double> Q5_V2(double M[][], int ITER)
//    {
//        if (ITER < 1) {
//            return null;
//        }
//
//        if (Character.isAlphabetic(ITER)) {
//            //System.out.println("Alphabetical");
//        }
//        if (Character.isDigit(ITER)) {
//            //System.out.println("Digit");
//        }
//        if (Q1(M) == false) // 1
//        {
//            return null;
//        }
//        ArrayList<Double> c = Q2R(M.length); // 2
//        double best_fitness = Q3(M, c);
//
//
//        for (int x = 1; x < ITER; x++)
//        {
//            ArrayList<Double> small_change = Q4(c);
//            double new_fitness = Q3(M,small_change);
//
//            System.out.println("current fitness: " + best_fitness);
//            System.out.println("new fitness: " + new_fitness);
//
//
//            if ( new_fitness > best_fitness)
//            {
//                counter = 0;
//
//                c = (ArrayList<Double>) small_change.clone();
//
//                best_fitness = new_fitness;
//            }
//            else{
//                System.out.println("Fitness is: " + best_fitness);
//                System.out.println("Counter is: " + counter);
//                counter++;
//            }
//
//            if(counter == 1300){
//                System.out.println("fitness hasn't changed for 500 times");
//                return c;
//            }
//
//
//        }
//        return c;
//
//
//    }
static private Random rand;
public static int UI_Int(int aa, int bb)
{
    int a = Math.min(aa,bb);
    int b = Math.max(aa,bb);
    if (rand == null)
    {
        rand = new Random();
        rand.setSeed(System.nanoTime());
    }
    //Generate random value (x) between a and b (inclusive)
    int d = b - a + 1;
    int x = rand.nextInt(d) + a;
    return(x);
}
}
