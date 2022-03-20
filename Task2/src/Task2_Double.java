import java.util.ArrayList;
import java.util.Collections;

public class Task2_Double {
	private static UI rand = new UI();
	public static void main (String[] args) {	        
		double[][] p38 = {
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,1,1,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,1,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,1,1,1},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,1},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1,1},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,1,1},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,1},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,1},
	        		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0}
	        		};
		Q5(p38, 10000);
    }
	public static boolean Q1(double[][] mdg) {
		// Null
		if (mdg == null) {
			return false;
		}
		// Empty
		if (mdg.length <= 1.0) {
			return false;
		}
		// Squared
		for (int x = 0; x < mdg.length; x++) {
			// ADDED THIS
			if (mdg[x] == null) {
				return false;
			}
			if (mdg[x].length != mdg.length) {
				return false;
			}
		}
		// Binary
		for (int i = 0; i < mdg.length; i++) {
			for (int j = 0; j < mdg.length; j++) {
				if (mdg[i][j] != 0.0 && mdg[i][j] != 1.0) {
					return false;
				}
				// UNICODE COMMENTED OUT USE IF NEEDED
				/*
				if (mdg[i][j] == '\u0000') {
					return false;
				}
				if (mdg[i][j] == '\u0001') {
					return false;
				}
				*/
			}
		}
		// Symmetry
		for (int i = 0; i < mdg.length; i++) {
			if (mdg[i][i] != 0.0) {
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
    public static ArrayList<Double> Q2(double n) {
    	if ((String.valueOf(n).equals(null))) {
    		return null;
    	}
    	if (n < 1.0) {
    		return null;
    	}
        ArrayList<Double> cluster = new ArrayList<>();
        double x = n;
        // The value of each item in the cluster corresponds to the cluster number, so item '2' belongs to cluster 2
        for (int i = 1; i < x + 1; i++) {
            // For each i, iterate i + 1 times
            for (int j = 2; j <= i + 1; j++) {
                cluster.add((double)i);
            }
        }
        System.out.println(cluster);
        return cluster;
    }
    public static ArrayList<Double> Q2R(double n) {
    	if ((String.valueOf(n).equals(null))) {
    		return null;
    	}
    	if (n < 1.0) {
    		return null;
    	}
        ArrayList<Double> cluster = new ArrayList<>();

        for (int i = 1; i < n+1; i++) {
        	cluster.add((double)i);

        }
        
        Collections.shuffle(cluster);
        System.out.println(cluster);
        return cluster;
    }
    public static double Q3(double[][] mdg, ArrayList<Double> C) {
    	if (!Q1(mdg)) {
    		return -1;
    	}
    	if (C == null) {
    		return -1;
    	}
    	if (mdg.length != C.size()) {
    		return -1;
    	}
    	for (int i = 0; i < C.size(); i++) {
    		if (C.get(i) < 1.0) {
    			return -1;
    		}
    	}
    	double evm = 0.0;
    	double c1;
		double c2;
    	for (int j = 0; j < mdg.length - 1; j++) {
    		for (int k = j+1; k < mdg.length; k++) {
    			c1 = C.get(j);
    			c2 = C.get(k);
    			if (c1 == c2) {
    				evm = evm + 2*mdg[j][k] - 1.0;
    			}
    		}
    	}
    	return evm;
    }
    
    public static ArrayList<Double> Q4(ArrayList<Double> C)
    {
    	System.out.println(C);
    	if (C == null) {
    		System.out.println("Null");
    		return null;
    	}
    	if (C.size() == 0) {
    		System.out.println("Size too small");
    		return null;
    	}
    	for (int i = 0; i < C.size(); i++) {
    		if (C.get(i) < 1) {
    			System.out.println("Negative");
    			return null;
    		}
    	}
        ArrayList<Double> ClusteringArrangment = (ArrayList<Double>) C.clone();
        double number_size = ClusteringArrangment.size();
        //double number = rand.UI_Double(1, number_size - 1.0);

        double number = rand.UR(1, number_size - 1.0);
        number = Math.floor(number);
        //double index = rand.UI_Double(0, number_size - 1.0);
        double index = rand.UR(0, number_size - 1.0);
        while (ClusteringArrangment.get((int) index).equals(number)) {
            number = rand.UI_Double(1, number_size - 1.0);
        }
        ClusteringArrangment.set((int)index, number);
        System.out.println(ClusteringArrangment);
        return ClusteringArrangment;
    }
    
    public static ArrayList<Double> Q5(double M[][], int ITER)
    {
    	if ((String.valueOf(ITER).equals(null))) {
    		return null;
    	}
    	if (ITER < 1) {
    		return null;
    	}
    	if (Q1(M) == false)
    	{
    		return null;
    	}
    	ArrayList<Double> C = Q2R(M.length);
    	System.out.println("Step 2 C: "+ C);
    	double best_fitness = Q3(M, C);
    	
    	for (int x = 1; x < ITER; x++)
    	{  		
    		ArrayList<Double> small_change = Q4(C);
    		double new_fitness = Q3(M, small_change);
    		System.out.println("Current fitness: " + best_fitness);
    		System.out.println("New fitness: " + new_fitness);
    		if ( new_fitness > best_fitness)
    		{
    			C = (ArrayList<Double>) small_change.clone();
    			best_fitness = new_fitness;
    		}
    	}
    	return C;
    }
}
