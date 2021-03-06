import java.util.ArrayList;
import java.util.Collections;

public class Task2_Char {
	private static UI rand = new UI();
    public static void main (String[] args) {
        char[][] testData = {
        		{'0', '0', '0', '1'},
        		{'0', '0', '0', '0'},
        		{'0', '0', '0', '0'},
        		{'1', '0', '0', '0'}};
        char[][] p38 = {
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','1','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','1','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','1','0','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','1','1','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','1','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','1','0','1','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','1','1','0','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','1','1','1','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','1','1','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','1','1','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','0','1','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','0','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','1','1','1','1','1','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','0','1','1','1','1','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','0','1','1','1','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','0','1','1','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','0','1','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','0','0','0','0','0','0','0','0','0'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','1','1','1','1','1','1'},
        		{'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','0','1','1','1','1','1'},
                {'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','0','1','1','1','1'},
                {'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','0','1','1','1'},
                {'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','0','1','1'},
                {'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','0','1'},
                {'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','0'}
        };
        
//        System.out.println(Q1(testData));
//        Q2('8');
//        Q2R('9');
        Q2R(36);
//        System.out.println(Q3(p38, Q2R(36)));
//        
//        Q4(Q2(2));
//        Q5(p38, '1');
    }
    public static boolean Q1(char[][] mdg) {
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
				if (mdg[i][j] != '0' && mdg[i][j] != '1') {
					return false;
				}
			}
		}
		// Symmetry
		for (int i = 0; i < mdg.length; i++) {
			if (mdg[i][i] != '0') {
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
    public static ArrayList<String> Q2(int n) {
    	if (n == 0) {
    		return null;
    	}
    	int y;
    	try {
    		y = Character.getNumericValue(n);
    	} catch (Exception e) {
    		return null;
    	}
    	if (y < 1) {
    		return null;
    	}
        ArrayList<String> cluster = new ArrayList<>();
        int x = y;
        // The value of each item in the cluster corresponds to the cluster number, so item '2' belongs to cluster 2
        for (int i = 1; i < x + 1; i++) {
            // For each i, iterate i + 1 times
            for (int j = 2; j <= i + 1; j++) {
                cluster.add(Integer.toString(i));
            }
        }
        System.out.println(cluster);
        return cluster;
    }
    public static ArrayList<Character> Q2R(int n) {
    	if (n == 0) {
    		return null;
    	}
    	if (n < 1) {
    		return null;
    	}
        ArrayList<Character> cluster = new ArrayList<>();

        for (int i = 1; i < n+1; i++) {
        	int redix = 16;
        	char b = (char) (i + '0');
        	char x = Character.forDigit(i, redix);
        	System.out.println(x);
        	cluster.add(x);
        }
        Collections.shuffle(cluster);
        System.out.println(cluster);
        return cluster;
    }
    
    public static char Q3(char[][] mdg, ArrayList<Character> C) {
    	if (!Q1(mdg)) {
    		
    		return 0;
    	}
    	if (C == null) {
    		
    		return 0;
    	}
    	if (mdg.length != C.size()) {
//    		System.out.println(mdg.length);
//    		System.out.println(C.size());
    		return 0;
    	}
    	
    	for (int i = 0; i < C.size(); i++) {
    		int y;
    		try {
    			y = Character.getNumericValue(C.get(i));
    			System.out.println(y);
    		} catch (Exception e) {
    			return 0;
    		}
    		if (y < 1) {
    			return 0;
    		}
    	}
    	int evm = 0;
    	Character c1;
    	Character c2;
    	for (int j = 0; j < mdg.length - 1; j++) {
    		for (int k = j+1; k < mdg.length; k++) {
    			c1 = C.get(j);
    			c2 = C.get(k);
    			if (c1.equals(c2)) {
    				int y;
    		    	try {
    		    		y = Character.getNumericValue(mdg[j][k]);
    		    	} catch (Exception e) {
    		    		return 0;
    		    	}
    				evm = evm + 2*y - 1;
    			}
    		}
    	}
    	return (char) (evm+'0');
    }
    public static ArrayList<Character> Q4(ArrayList<Character> C)
    {
    	if (C == null) {
    		System.out.println("Null");
    		return null;
    	}
    	if (C.size() == 0) {
    		System.out.println("Size too small");
    		return null;
    	}
    	for (int i = 0; i < C.size(); i++) {
    		int y;
	    	try {
	    		y = Character.getNumericValue(C.get(i));
	    	} catch (Exception e) {
	    		return null;
	    	}
    		if (y < 1) {
    			System.out.println("Negative");
    			return null;
    		}
    	}
        ArrayList<Character> ClusteringArrangment = (ArrayList<Character>) C.clone();
        int number_size = ClusteringArrangment.size();
        int number = rand.UI_Int(1, number_size - 1);
        int index = rand.UI_Int(0, number_size - 1);
        char numberChar = (char) (number + '0');
        while (ClusteringArrangment.get(index).equals(numberChar)) {
            number = rand.UI_Int(1, number_size - 1);
            numberChar = (char) (number + '0');
        }
        ClusteringArrangment.set(index, numberChar);
        System.out.println(ClusteringArrangment);
        return ClusteringArrangment;
    }
    public static ArrayList<Character> Q5(char M[][], int ITER)
    {
    	if (ITER == 0) {
    		return null;
    	}
    	
    	if (ITER < 1) {
    		return null;
    	}
    	if (Q1(M) == false)
    	{
    		return null;
    	}
    	char mLength = (char) (M.length + '0');
    	ArrayList<Character> C = Q2R(mLength);
    	int currentFitness;
    	try {
    		currentFitness = Character.getNumericValue(Q3(M, C));
    	} catch (Exception e) {
    		return null;
    	}
    	
    	

    	for (int x = 1; x < ITER; x++)
    	{	
    		ArrayList<Character> small_change = Q4(C);
    		int newFitness;
    		try {
    			newFitness = Character.getNumericValue(Q3(M, small_change));
        	} catch (Exception e) {
        		return null;
        	}
    		
    		System.out.println("Current fitness: " + currentFitness);
    		System.out.println("New fitness: " + newFitness);
    		if ( newFitness > currentFitness)
    		{
    			C = (ArrayList<Character>) small_change.clone();
    			currentFitness = newFitness;
    		}
    	}
    	return C;
    }
    
}
