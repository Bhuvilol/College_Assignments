
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number :");
		int a = Integer.parseInt(args[0]);
		int i = a,count = 0;
		System.out.println("The positive integer greater then 2 from command line argument is "+a);
		while (i>2) {
			i/=2;
			count++;
		}
		System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+count);
	}

}
