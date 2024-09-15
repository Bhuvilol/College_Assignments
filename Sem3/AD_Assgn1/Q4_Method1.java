

public class Q4_Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,-8,7,-1,2,3};
		int max = Integer.MIN_VALUE;
		int start=0,ansS = -1,ansE = -1;
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			start=i;
			for (int j = i; j < arr.length; j++) {
				sum+=arr[j];
				if (sum>max) {
					max=sum;
					ansS = start;
					ansE = j;
				}	
			}
		}
		
		System.out.println("Maximum Sum in Subarray = "+max);
		System.out.print("Subarray : [");
		for (int i = ansS; i <= ansE; i++) {
			System.out.print(arr[i]+" ");	
		}
		System.out.print("]");
	}
}
