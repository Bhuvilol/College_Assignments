import java.util.Scanner;

public class A3HAQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean or=true,and=true,both=true;
		
		if((num%5==0)&&(num%6==0)) {and=true;}
		else {and=false;}
		
		if((num%5==0)||(num%6==0)) {or=true;}
		else {or=false;}
		
		if(and==or) {both = false;}
		else {both=true;}
		
		System.out.println("Is "+num+" divisivle by 5 and 6? "+and);
		System.out.println("Is "+num+" divisivle by 5 or 6? "+or);
		System.out.println("Is "+num+" divisivle by 5 or 6, but not both? "+or);
	}

}
