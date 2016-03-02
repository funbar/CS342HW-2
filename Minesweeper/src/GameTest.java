import static org.junit.Assert.*;

import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.junit.Test;

public class GameTest extends Game {

	Game gameObj = new Game();
	
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
		
	@Test
	public void longClick()
	{
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                ++count;
            }
        };

        tester.actionDelay(5000);
        tester.mouseRelease();
        assertTrue("No abnormal behavior", count > 1);
    	}
    
	@Test
	public void resetTimer(Timer timer)
	{
		int time = gameObj.getTimer();
		assertEquals(0, time);
	}

	@Test
	public void testGameInput(String username){
		
		// test case for if the user doesn't enter a name
		assertNotNull(username);
		
	}
	
	@Test
	public void testGameInputMax(String username)
	{
		// test case for is the user enters in a string that is too long.
		assertTrue(username.length() < 50);
	}
	
	
	@Test
	public void testMouseClickedWhenGameEnds(MouseEvent arg0)
	{
		gameObj.gameOver();
		if(gameObj.mouseClicked(arg0) == 0)
		{
			if(arg0.getSource() == JButton)
			{
				assertFalse("Game is not over", false);
			}
		}
	}
	
	@Test
	public void gameWinnerTest(JOptionPane jPane)
	{
		String winner = "You win!";
	//	JOptionPane.showMessageDialog(null, "You win!");
		inputTest = (JTextField)TestUtils(jPane, "You win!");
		assertEquals(winner, inputTest);
		
		
	}

}
