
public class HAQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = (int)(Math.random()+0.5);
			}
		}
		System.out.println("Computer generated 4X4 matrix is: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		int rowmax = Integer.MIN_VALUE,posR=0;
		int colmax = Integer.MIN_VALUE,posC=0;
		for (int i = 0; i < 4 ; i++) {
			int rowsum =0;
			int colsum =0;
			for (int j = 0; j < 4 ; j++) {
				rowsum += arr[i][j];
			}
			for (int j = 0; j < 4 ; j++) {
				colsum += arr[j][i];
			}
			if (rowsum>rowmax) {
				rowmax=rowsum;
				posR=i;
			}
			if (colsum>colmax) {
				colmax=colsum;
				posC=i;
			}
		}
		System.out.println("The largest row index:"+posR);
		System.out.println("The largest col index:"+posC);
	}

}

//output
// Computer generated 4X4 matrix is: 
// 0	1	0	1	
// 1	0	0	0	
// 0	1	0	0	
// 0	0	0	1	
// The largest row index:0
// The largest col index:1

