
public class Q4_Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,-8,7,-1,2,3};
		int max = arr[0];
		int sum = arr[0];
		int start=0,ansS = -1,ansE = -1;
		for (int i = 1; i < arr.length; i++) {
			if (sum<0) {
				sum=0;
				start = i;
			}
			sum = sum+arr[i];
			if (sum>max) {
				max=sum;
				ansS = start;
				ansE =i;
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

//Kadane's Algo
//Time complexity = O(n)
//Space complexity = O(1)
//OUTPUT
//Maximum Sum in Subarray = 11
//Subarray : [7 -1 2 3 ]

