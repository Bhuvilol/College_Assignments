
public class HAQ3 {
	public static String decTOBin(int n) {
		if (n==0) {
			return "0";
		}
		if (n==1) {
			return "1";
		}
		else {
			return decTOBin(n/2)+String.valueOf(n%2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decTOBin(8));
	}

}
