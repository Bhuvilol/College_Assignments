import java.util.Scanner;

public class HAQ4 {
	public static double[][] addMatrix(double [][]a, double[][]b){
		double sum[][] = new double[a.length][a[0].length];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[0].length; j++) {
				sum[i][j] = a[i][j]+b[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number row of matrices");
		int row = sc.nextInt();
		System.out.println("Enter number column of matrices");
		int col = sc.nextInt();
		double a[][] = new double[row][col];
		System.out.println("Enter the elements of matrix a");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j]=sc.nextDouble();
			}
		}
		double b[][] = new double[row][col];
		System.out.println("Enter the elements of matrix b");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				b[i][j]=sc.nextDouble();
			}
		}
		double c[][] = addMatrix(a, b);
		System.out.println("the resultant matrix after addition of a and b is:");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}


//output
// Enter number row of matrices
// 3
// Enter number column of matrices
// 3
// Enter the elements of matrix a
// 1 3 5
// 8 9 3
// 5 2 7
// Enter the elements of matrix b
// 1 6 9
// 4 2 8
// 0 4 2
// the resultant matrix after addition of a and b is:
// 2.0	9.0	14.0	
// 12.0	11.0	11.0	
// 5.0	6.0	9.0	
