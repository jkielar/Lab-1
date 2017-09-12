import java.util.LinkedList;

public class Round {
	private  int ComeOutScore;
	private  eGameResult eGameResult1;
	private LinkedList<Roll1> rolls = new LinkedList<Roll1>();
	

	public Round() {
		Roll1 r1= new Roll1();
		ComeOutScore= r1.getScore();
		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out
		if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore ==12) {
			eGameResult1= eGameResult1.CRAPS;
			System.out.println("you win!");
		}
		else if (ComeOutScore ==7 || ComeOutScore == 11) {
			eGameResult1= eGameResult1.NATURAL;
			System.out.println("you lose!");
		}
		else {
			Roll1 r2= new Roll1();
			if (r2.getScore()== r1.getScore()) {
				eGameResult1= eGameResult1.POINT;
				System.out.println("you win!");
			}
			else if (r2.getScore() == 7) {
				eGameResult1= eGameResult1.SEVEN_OUT;
				System.out.println("you lose!");
			}
			else {
				Roll1 r3 = new Roll1();
			while (r3.getScore() != r1.getScore() || r3.getScore() != 7) {
				Roll1 r4 = new Roll1();
				if (r4.getScore() ==7) {
					eGameResult1= eGameResult1.SEVEN_OUT;
					System.out.println("you lose!");
				}
				else if (r4.getScore()== r1.getScore()) {
					eGameResult1 = eGameResult1.POINT;
					System.out.println("you win!");
				}
				else {
					r4 = new Roll1();
				}	
			
			}
	}
			
		}
	}
			
		
		
	

		// TODO: value the eGameResult after the round is complete
	public eGameResult geteGameResult()
	{
		return eGameResult1;
	}
		
	

	public static int RollCount() {
		// Return the roll count
		
		
		return Roll1.getCount();
	}
	
	public static void main (String [] args)
	{
		Roll1 r = new Roll1();
		System.out.println(RollCount());
	}





	





	

}


