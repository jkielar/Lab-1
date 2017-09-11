
public class Roll1 {
	private Die1 d1;
	private Die1 d2;
	private int Score;
	public static int count;
	
	public static void main (String [] pinkBunny)
	{
		Roll1 r = new Roll1();
		System.out.println(r.getScore());
	}
	
	public Roll1() {
		Die1 d1= new Die1();
		Die1 d2= new Die1();
		 int h = d1.getDieValue();
		 int g = d2.getDieValue();
		 Score = h + g;
		 count++;
	}
	
	public int getScore() {
		return Score;
	}
	public static int getCount() {
		return count;
	}

}
