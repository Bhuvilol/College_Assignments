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
		System.out.println("marks : "+GTmarks);
		System.out.println("Scores : "+GTscores);
	}

}
