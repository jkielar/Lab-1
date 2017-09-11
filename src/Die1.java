
public class Die1 {
private int DieValue;
	
	
	public Die1() {
		for(int i =0; i < 100; i++)
		{
		    //int answer = rn.nextInt(10) + 1;
		   // System.out.println(answer);
		}
		DieValue =(int)((Math.random() * 6)+1);

	}

	public int getDieValue() {
		return DieValue;
	}
}
