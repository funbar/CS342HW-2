import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {

	@Test
	public void getMineLeftTest() {
		Game T1 = new Game();
		//expected initial mines = 10;
		assertEquals(10, T1.getMines_left());
		
		
	}
	
	@Test
	public void setMines_leftTest() {
		Game T2 = new Game();
		T2.setMines_left(6);
	    assertEquals(6, T2.mines_left);
	}
		


}