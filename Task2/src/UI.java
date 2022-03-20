import java.util.Random;

public class UI {
	static private Random rand;
	//Create a uniformly distributed random integer between aa and bb inclusive
	public int UI_Int(int aa,int bb)
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
	public double UI_Double(double aa,double bb)
	{
		double a = Math.min(aa,bb);
		double b = Math.max(aa,bb);
		if (rand == null) 
		{
			rand = new Random();
			rand.setSeed(System.nanoTime());
		}
		//Generate random value (x) between a and b (inclusive)
		double d = b - a + 1;
		double x = rand.nextInt((int)d) + a;
		
		return(x);
	}
	public double UR(double a,double b)
    {
        if (rand == null) 
        {
            rand = new Random();
            rand.setSeed(System.nanoTime());
        }
        return((b-a)*rand.nextDouble()+a);
    }
	public short UI_Short(short aa, short bb) {
        short a = (short) Math.min(aa, bb);
        short b = (short) Math.max(aa, bb);
        if (rand == null) {
            rand = new Random();
            rand.setSeed(System.nanoTime());
        }
        //Generate random value (x) between a and b (inclusive)
        short d = (short) (b - a + 1);
        short x = (short) (rand.nextInt((d) + a));

        return (x);
    }
	public long UI_Long(long aa, long bb) {
        long a = Math.min(aa, bb);
        long b = Math.max(aa, bb);
        if (rand == null) {
            rand = new Random();
            rand.setSeed(System.nanoTime());
        }
        //Generate random value (x) between a and b (inclusive)
        long d = b - a + 1;
        long x = rand.nextInt((int) d) + a;

        return (x);
    }
}
