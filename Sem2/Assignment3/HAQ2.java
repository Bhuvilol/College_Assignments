import java.util.Scanner;

public class HAQ2 {
	public static int binSearch(int arr[],int start,int end,int key) {
		if (end>=start &&start<= arr.length - 1) {
			int mid = start+(end-start)/2;
			if (arr[mid]==key) {
				return mid;
			}
			if (arr[mid]>key) {
				return binSearch(arr, start, mid-1, key);
			}
			return binSearch(arr, mid+1, end, key);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {19,28,37,46,55,64,73,82,91};
		System.out.println("Enter the number you want to search");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int result = binSearch(arr, 0, arr.length, key);
		System.out.println(result == -1 ? ("Element not present"):("Element present at position "+(result+1)));
	}

}





//output
// Enter the number you want to search
// 73
// Element present at position 7
