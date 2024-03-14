import java.util.Scanner;

public class A3Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the coordinates : ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		if(x<0&&y<0) {
			System.out.println("("+x+","+y+")"+" is in quadrant III");
		}
		else if(x<0&&y>0) {
			System.out.println("("+x+","+y+")"+" is in quadrant II");
		}
		else if(x>0&&y>0) {
			System.out.println("("+x+","+y+")"+" is in quadrant I");
		}
		else if(x>0&&y<0) {
			System.out.println("("+x+","+y+")"+" is in quadrant IV");
		}
		else ;
		
		if(x==0) {
			System.out.println("("+x+","+y+")"+" is in y-axis");
		}
		if(y==0) {
			System.out.println("("+x+","+y+")"+" is in x-axis");
		}
		sc.close();
	}

}
