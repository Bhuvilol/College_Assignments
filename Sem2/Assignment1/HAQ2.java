import java.util.Scanner;

public class HAQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of lines user wants to input");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter line " + (i+1));
			arr[i] = sc.nextLine();
		}
		
		System.out.println("\nAfter reversal the output would be :");
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("- " + arr[i]);
		}
	}

}


//output
// Enter number of lines user wants to input
// 3
// Enter line 1
// bhabesh is a good boy
// Enter line 2
// bhabesh is not a good boy
// Enter line 3
// bhabesh is a bad boy

// After reversal the output would be :
// - bhabesh is a bad boy
// - bhabesh is not a good boy
// - bhabesh is a good boy
