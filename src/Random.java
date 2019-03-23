import java.util.Calendar;

public class Random {
	private long p = 2147483648L;
	private long m = 843314861;
	private long a = 453816693;
	
	private Calendar hora = Calendar.getInstance();
	private int xi = (int) - hora.getTimeInMillis();

	public Random() {
		
	}
	
	public Random(int k) {
		xi = k;
	}
	
	public void setSemente(int semente) {
		xi = semente;
	}
	
	public double getRand() {

		xi = (int) ((a + m * xi) % p);
		double d = xi;
		return d / p;
		
	}
	
	public int getIntRand(int max) {
		
		double d = getRand() * max;
		return (int) d;
		
	}

	@Override
	public String toString() {
	return xi + "";
	}
}
	

