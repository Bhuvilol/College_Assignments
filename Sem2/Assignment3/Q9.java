
public class Q9 {
	public static void reversal(int x) {
		if (x<10) {
			System.out.println(x);
			return;
		}
		System.out.print(x%10);
		reversal(x/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4735;
		System.out.print("Reversed number of "+num+" is ");
		reversal(num);
	}

}
