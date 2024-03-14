import java.util.Scanner;

public class A3Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int amount= sc.nextInt();
		if(amount>5000) {
			System.out.println("\"Yes,Alice is following doctor's advice\"");
		}
		else {
			System.out.println("\"No,Alice is not following doctor's advice\"");
		}
		sc.close();
	}

}
