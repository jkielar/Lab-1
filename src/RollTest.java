import static org.junit.Assert.*;

	import org.junit.Test;

	
public class RollTest {
	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll1 r = new Roll1();
			// TODO: Make sure value of roll is between 1 and 12.
			assertTrue(r.getScore() >= 1 && r.getScore() <= 12);
		}

	}
	


}
