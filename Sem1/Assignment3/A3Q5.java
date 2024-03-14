import java.util.Scanner;

public class A3Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the year:");
		int year = sc.nextInt();
		boolean c = true;
		if(year%100==0) {
			if(year%400==0) {
				System.out.println(c=true);
			}
			else {
				System.out.println(c=false);
			}
		}
		else if(year%4==0) {
			System.out.println(c==true);
		}
		else {
			System.out.println(c==true);
		}
		sc.close();
	}

}
