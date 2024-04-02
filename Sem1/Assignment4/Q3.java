import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		int ran,sum = 0;
		System.out.print("Random numbers generated are ");
		int i =0;
		do {
			ran = (int)(10*Math.random());
			System.out.print(ran+" ");
			sum = sum +ran;
			i++;
		}
		while(i < num);
		//System.out.println("\n"+sum);
		System.out.println("\nAverage of "+num+" random numbers are "+(1.0*sum/num));
	}

}
