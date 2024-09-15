import java.util.Arrays;
import java.util.Scanner;

public class Q3_Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60};
		System.out.print("Before rotation : ");
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position to rotate by : ");
		int k = sc.nextInt();
		
		int narr[]=new int[k];
		
		for (int i = arr.length-k; i < arr.length; i++) {
			narr[i-arr.length+k] = arr[i];
		}
		for (int i = arr.length-k-1; i >= 0; i--) {
			arr[i+k] = arr[i];
		}
		for (int i = 0; i < k; i++) {
			arr[i]= narr[i];
		}
		
		System.out.print("After rotation : ");
		System.out.println(Arrays.toString(arr));
	}

}
