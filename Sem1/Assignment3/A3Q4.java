import java.util.Scanner;

public class A3Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Choose between 1-9\nEnter user number: ");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int com = (int)(9*Math.random()+1);
		System.out.println("Computer guesses: "+com);
		if(com == user) {
			System.out.println("\"You got it right\"");
		}
		else if((com==user+1)||(com==user-1)){
			System.out.println("\"Almost got it right\"");
		}
		else {
			System.out.println("\"You got it wrong\"");
		}
		sc.close();
	}

}
