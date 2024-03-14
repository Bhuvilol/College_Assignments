import java.util.Scanner;

public class Q10 {
	public static double sumColumn(double[][]m,int columnIndex) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum+=m[i][columnIndex];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column of matrix");
		int row = sc.nextInt();
		int col = sc.nextInt();
		double m[][] = new double[row][col];
		System.out.println("Enter the elements of the 2-D array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col ; j++) {
				m[i][j]=sc.nextDouble();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col ; j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
		for (int i = 0; i < col ; i++) {
			System.out.println("Sum of the elements at column "+i+" is "+sumColumn(m, i));
		}
		
	}

}
