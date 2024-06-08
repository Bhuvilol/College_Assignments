
public class Q8 {
	public static double power(double x, int pow) {
		if (pow>0) {
			return x*power(x, pow-1);
		}
		if (pow<0) {
			return 1/(x*power(x, -pow-1));
		}
		return 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3;
		int pow = -3;
		System.out.println(x+" raised to the power "+pow+" is "+power(x, pow));
	}

}
