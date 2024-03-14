import java.util.Scanner;
public class A3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("\"You are eligible to cast your vote\"");
		}
		sc.close();
	}

}
