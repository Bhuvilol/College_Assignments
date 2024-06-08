
public class Q6 {
	public static <T> int count(T[] array, T item) {
		int count = 0;
		for (T el : array) {
			if (el!=null && el.equals(item)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] iar = {1,2,3,4,2,2};
		int icount = count(iar, 2);
		System.out.println("Count of 2 : "+icount);
		
		String[] sar = {"liku","papa","bhuvi","liza","papa"};
		int scount = count(sar, "papa");
		System.out.println("Count of papa : "+scount);
	}

}






//output
// Count of 2 : 3
// Count of papa : 2
