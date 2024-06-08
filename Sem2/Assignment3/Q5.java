
public class Q5 {
	public static <E> void printArray(E[] inputArray) {
		for (E e : inputArray) {
			System.out.print(e+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] iar = {1,2,3,4,5};
		printArray(iar);
		
		String[] sar = {"liku","liza","bhuvi"};
		printArray(sar);
		
		Double[] dar = {1.1,2.2,3.3};
		printArray(dar);
	}

}




//output
// 1 2 3 4 5 
// liku liza bhuvi 
// 1.1 2.2 3.3 
