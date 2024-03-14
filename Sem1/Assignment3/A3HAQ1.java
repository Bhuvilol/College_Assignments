import java.util.Scanner;

public class A3HAQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user input:\nscissor(0), rock(1), paper(2): ");
		
		int user = sc.nextInt();
		String man ="r",mac ="r";
		switch(user) {
		case 0:	man = "scissor";break;
		case 1:	man = "rock";break;
		case 2: man = "paper";break;
		default: man ="invalid input";
		}
		System.out.print("You are "+man+". ");
		
		int comp = (int)(3*Math.random());
		switch(comp) {
		case 0: mac = "scissor";break;
		case 1: mac = "rock";break;
		case 2: mac = "paper";break;
		default: mac = "invalid input";
		}
		System.out.print("The computer is "+mac+". ");
		if(user==0) {
			if(comp==0) System.out.println("It is a draw");
			if(comp==1) System.out.println("Computer won");
			if(comp==2) System.out.println("You won");
		}
		if(user==1) {
			if(comp==1) System.out.println("It is a draw");
			if(comp==2) System.out.println("Computer won");
			if(comp==0) System.out.println("You won");
		}
		if(user==2) {
			if(comp==2) System.out.println("It is a draw");
			if(comp==0) System.out.println("Computer won");
			if(comp==1) System.out.println("You won");
		}
		sc.close();
		
	}
}

