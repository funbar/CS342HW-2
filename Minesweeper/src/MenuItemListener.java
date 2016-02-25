import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MenuItemListener extends AbstractAction{

	public MenuItemListener(String text, Integer mnemonic)
	{
		super(text);
		putValue(MNEMONIC_KEY, mnemonic);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand() == "About")
		{
			//System.out.println("TESSSSSSSSSSST");
			JOptionPane.showMessageDialog(null, "This project was created by Richard Kim (rkim43) and Eilbron. \n" +
					"This was homework #2 of the 2016 spring semester. \nThe class is currently being taught by professor Troy.\n");
		}

		if(e.getActionCommand() == "Help")
		{
			JOptionPane.showMessageDialog(null,	"The objective of the game, minesweeper, is to reveal all the tiles that do not contain mines. \n" +
					"If a player clicks on 1 of 10 randomly placed mines, their game ends and they must restart. \n" +
					"There is a timer to keep track of how fast the user can beat the game. If the user successfully \n" +
					"completes a game of minesweeper, their username and score (time elapsed) will be recorded.\n");

		}
		//JOptionPane.showMessageDialog(null, "Hello World");
		System.out.println(e.getActionCommand());

		if(e.getActionCommand() == "Exit")
		{
			JOptionPane.showMessageDialog(null, "Thank you for playing!");
			System.exit(1);
		}

		if(e.getActionCommand() == "Reset")
		{
			reset();
		}
	}
	public void reset()
	{
		/*
		 * A solution for resetting all the top ten scores
		 * could simply just be deletion of the text file.
		 * also we need to reinitialize the board
		 * TODO: we'll need to reset both the game and also the top scores at one point.
		 */
		Game gameObj = new Game();
		gameObj.gameStart();

		//Grid gridObj = new Grid();
		//final JButton grid[][] = gameObj.getGrid();
		//gridObj.buildGrid();
		//Grid JButton grid[][] = gameObj.getGrid();
		//int i = 1;
		//int j = 1;
		//System.out.println("HEELLLLLOOOOO");
		//System.out.println(grid[10][10]);
	}

}
