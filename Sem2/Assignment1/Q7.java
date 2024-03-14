import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements of array");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		int max = Integer.MIN_VALUE,maxcount=0;
		int min = Integer.MAX_VALUE,mincount=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==max) {
				maxcount++;
			}
			if (arr[i]==min) {
				mincount++;
			}
		}
		System.out.println("Maximum element of Array is "+max+" and occurs "+maxcount+" times");
		System.out.println("Minimum element of Array is "+min+" and occurs "+mincount+" times");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==max) {
				System.out.println("First occurence of maximum element is at position "+(i+1));
				break;
			}
		}
		for (int i = arr.length-1; i >= 0; i--) {
			if (arr[i]==min) {
				System.out.println("Last occurence of minimum element is at position "+(i+1));
				break;
			}
		}
	}

}
