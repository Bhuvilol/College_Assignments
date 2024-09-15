import java.util.Arrays;
import java.util.Scanner;

public class Q3_Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr= {10,20,30,40,50,60};
		System.out.print("Before rotation : ");
		System.out.println(Arrays.toString(arr));
		
		System.out.print("Enter the position to rotate by : ");
		int k = sc.nextInt();
		
		int[] narr = new int[arr.length];
		int p =0;
		for (int i = k; i < narr.length; i++) {
			narr[i]=arr[p++];
		}
		int pos = k;
		for (int i = 0; i < k; i++) {
			narr[i]=arr[p++];
		}
		
		
		System.out.print("After rotation : ");
		System.out.println(Arrays.toString(narr));
	}

}


//Time complexity = O(n)
//Space complexity = O(n)
//OUTPUT
//Before rotation : [10, 20, 30, 40, 50, 60]
//Enter the position to rotate by : 3
//After rotation : [40, 50, 60, 10, 20, 30]

