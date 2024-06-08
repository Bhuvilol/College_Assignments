
public class Q10 {
	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 8; i++) {
			System.out.print(fibonacci(i)+" ");
		}
	}
}
