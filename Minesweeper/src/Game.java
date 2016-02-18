import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Game extends JPanel{
	// there are 10 mines in our game every time, so we need to keep track of this.
	private int mines_left = 10;
	// I feel as if the timer should be a float, but we'll keep it as an int for now.
	private int timer = 0;
	
	private final int rows    = 10;
	private final int columns = 10;
	
	// Declaring a 2d array for our JButtons.
	private JButton grid[][];
	
	// Constructor for our Game class.
	public Game()
	{
		JPanel score_board = new JPanel(new GridLayout(2, 3, 5, 3));
		grid = new JButton[rows][columns];
		
		/*
		 * use new ImageIcon ("image path in project") to add pictures instead of text
		 */
		
		
	}
	
	public void game_start()
	{
		build_grid();
	}
	
	private void build_grid()
	{
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				grid[i][j] = new JButton();
				grid[i][j].setSize(300, 300);
				
			}
		}
	}
	
	private void menu_bar()
	{
		/*
		 * TODO new JMenu object instance here.
		 */
	}
	
	private void generate_mines()
	{
		/*
		 * create mines for the games
		 */
	}
	
	private void randomizer()
	{
		/*
		 * probably not necessary, but if we need a randomized method outside of the traditional method, 
		 * we can implement out own. Used for randomly placing mines, etc.
		 */
	}
	
	private void top_scores()
	{
		/*
		 * List of top scores - top 10
		 */
	}
	
	private void reset()
	{
		/*
		 * TODO: we'll need to reset both the game and also the top scores at one point.
		 */
	}
	
	
}
