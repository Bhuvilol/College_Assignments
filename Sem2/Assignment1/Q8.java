import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row and columns of 2D - Array");
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("Enter elements of 2D-Array");
		int [][]arr = new int[row][col];
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < col ; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < col ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
