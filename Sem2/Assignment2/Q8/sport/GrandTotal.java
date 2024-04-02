package sport;

import school.Test;

public class GrandTotal extends Test implements Sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int GTmarks,GTscores;
		GrandTotal num = new GrandTotal();
		num.inputDetails();
		num.showDetails();
		GTmarks = num.mark1+num.mark2;
		GTscores = Sports.score1+Sports.score2;
		System.out.println("Total marks : "+GTmarks);
		System.out.println("Total Scores : "+GTscores);
	}

}







// output

// Enter name of the student
// Bhabesh
// Enter roll number of the student
// 23410210
// Enter marks of subject 1
// 92
// Enter marks of subject 2
// 88
// Name : Bhabesh
// Roll number : 23410210
// Marks in subject 1 : 92
// Marks in subject 2 : 88
// Total marks : 180
// Total Scores : 15
