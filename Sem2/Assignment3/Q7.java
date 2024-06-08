
public class Q7 {
	public static int factorial(int x) {
		if (x==0) {
			return 1;
		}
		return x*factorial(x-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int result = factorial(num);
		System.out.println("Factotial of "+num+" is : "+result);
	}

}
