public class HAQ1 {
	public static int gcd(int m,int n) {
		if (n==0) {
			return m;
		}
		return gcd(n, m%n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 12;
		int n =4;
		System.out.println("GCD of "+m+" and "+n+" is "+gcd(m, n));
		
	}

}
