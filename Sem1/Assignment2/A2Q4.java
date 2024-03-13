
public class A2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nu=999;
		int a,b,c,d;
		System.out.println("Enter the number between 0 and 1000: "+nu);
		a= nu/100;
		b= nu%100;
		c= b/10;
		d= b%10;
		System.out.println("The sum of the digits is "+(a+c+d));
	}

}
