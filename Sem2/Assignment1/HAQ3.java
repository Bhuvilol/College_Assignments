import java.util.Scanner;

public class HAQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of arrays");
		int n = sc.nextInt();
		int arrA[] = new int[n];
		System.out.println("Enter the contents of Array A");
		for (int i = 0; i < arrA.length; i++) {
			arrA[i]=sc.nextInt();
		}
		int arrB[] = new int[n];
		System.out.println("Enter the contents of Array B");
		for (int i = 0; i < arrB.length; i++) {
			arrB[i]=sc.nextInt();
		}
		int arrC[] = new int[n];
		System.out.println("The contents of Array C are");
		for (int i = 0; i < arrC.length; i++) {
			arrC[i]= arrA[i]*arrB[i];
		}
		for (int i : arrC) {
			System.out.println(i+" ");
		}
		
	}

}


//output
// Enter the length of arrays
// 4
// Enter the contents of Array A
// 1 2 3 4
// Enter the contents of Array B
// 2 3 4 5
// The contents of Array C are
// 2 6 12 20 

