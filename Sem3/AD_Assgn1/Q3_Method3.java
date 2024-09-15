import java.util.Arrays;
import java.util.Scanner;

public class Q3_Method3 {
	public static void Reverse(int[]arr,int beg,int end) {
		for (int i = beg; beg<=end ; beg++,end--) {
			int temp = arr[beg];
			arr[beg]=arr[end];
			arr[end]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60};
		System.out.print("Before rotation : ");
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position to rotate by : ");
		int k = sc.nextInt();
		
		Reverse(arr, 0, arr.length-k-1); //elements before k
		
		Reverse(arr, arr.length-k, arr.length-1); //elements after k
		
		Reverse(arr, 0 ,arr.length-1); //whole array
		
		System.out.print("After rotation : ");
		System.out.println(Arrays.toString(arr));
	}

}
