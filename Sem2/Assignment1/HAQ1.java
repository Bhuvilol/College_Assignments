import java.util.Scanner;

public class HAQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three inputs :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a+b==c ) {
			System.out.println(a+", "+b+", and "+c+" can be used in the formula a+b=c.");
		} else if (a==b-c) {
			System.out.println(a+", "+b+", and "+c+" can be used in the formula a=b-c.");
		} else if (a*b==c) {
			System.out.println(a+", "+b+", and "+c+" can be used in the formula a*b=c.");
		} else {
			System.out.println(a+", "+b+", and "+c+" cannot be used in either of formula given in question.");
		}
	}

}
