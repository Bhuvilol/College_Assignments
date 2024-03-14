import java.util.Scanner;

public class Q9 {
	public static double sumMajorDiagonal(double[][]m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum+=m[i][i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n*n value of matrix");
		int n = sc.nextInt();
		double m[][] = new double[n][n];
		System.out.println("Enter the elements of the 2-D array");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m[i][j]=sc.nextDouble();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n ; j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(m));
	}

}
