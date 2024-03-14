import java.util.*;
public class A310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your marks: ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		int range;
		String grade="q";
		range = marks/10;
		
		switch(range) {
		case 10:
		case 9:
			grade="O"; break;
		case 8:
			grade="A"; break;
		case 7:
			grade="B"; break;
		case 6:
			grade="C"; break;
		case 5:
			grade="D"; break;
		case 4:
			grade="E"; break;
		case 3:
		case 2:
		case 1:
		case 0:
			grade="F"; break;
		default :
			grade="Invalid mark";
		}
		
		System.out.println("Grade obtained = "+grade);
		sc.close();
	}

}
