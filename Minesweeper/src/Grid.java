import javax.swing.JButton;

public class Grid {
	private final int rows    = 10;
	private final int columns = 10;
	private int minesLeft     = 10;
	
	// "Unique" id for a mine
	private int mine = 50;
	// Declaring a 2d array for our JButtons.
	private int grid[][];
	
	public int getMinesLeft() {
		return minesLeft;
	}

	public void setMinesLeft(int minesLeft) {
		this.minesLeft = minesLeft;
	}

	public int getMine() {
		return mine;
	}

	public void setMine(int mine) {
		this.mine = mine;
	}

	public int[][] getGrid() {
		return grid;
	}

	public void setGrid(int[][] grid) {
		this.grid = grid;
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Grid()
	{
		grid = new int[rows][columns];
		
	}
	
	private void printBoard(){
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				System.out.print(grid[i][j]+"  ");
				
			}
			System.out.println();
		}
	}
	
	public void buildGrid()
	{
		grid = new int[10][10];
		
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				// initialize every grid point to 0;
				grid[i][j] = 0;
				//grid[i][j].
				
				//this.add(grid[i][j]);
				//grid[i][j].addActionListener(new ButtonHandler(i, j, grid));
			}
		}
		 printBoard();
		generateMines();
		printBoard();
		checkAroundMines();
		printBoard();
	}
	

	private void checkAroundMines()
	{
		int mineCount = 0;
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				if(grid[i][j] != 50)
				{
				if(i > 0 && j > 0){
			
					// top left
					if(grid[i-1][j-1] == 50)
					{
						mineCount++;
					}
				}
				if(i > 0){
					// up
					if(grid[i-1][j] == 50)
					{
						mineCount++;
					}
				}
				
					// left
				if(j > 0){
					if(grid[i][j-1] == 50)
					{
						mineCount++;
					}
				}
				
				
					// down
				if(i < 9){
					if(grid[i+1][j] == 50)
					{
						mineCount++;
					}
				}
				
					// right
				if(j < 9){
					if(grid[i][j+1] == 50)
					{
						mineCount++;
					}
				}
				
					// bottom right
				if(i < 9 && j < 9){
					if(grid[i+1][j+1] == 50)
					{
						mineCount++;
					}
				}
				
					// bottom left
				if(i < 9 && j > 0){
					if(grid[i+1][j-1] == 50)
					{
						mineCount++;
					}
				}
				
					// top right
				if(i > 0 && j < 9){
					if(grid[i-1][j+1] == 50)
					{
						mineCount++;
					}
				}
				grid[i][j] = mineCount; 
				mineCount = 0;
				}
			}
		}
	}
	
	
	int randomWithRange(int min, int max)
	{
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
		
	}
	private void generateMines()
	{
		/*
		 * create mines for the games
		 * we will call this method when the grid is created.
		 */

		for(int i = 0; i < minesLeft; i++)
		{
			
			int randRow = randomWithRange(0, 9); //(int)Math.random() * 9 + 0;
			int randCol = randomWithRange(0, 9); //(int)Math.random() * 9 + 0;
			System.out.println(randRow +"+"+randCol);
			// replace with "mine" underneath JButton somehow
			if(grid[randRow][randCol] == mine)
			{
				i--;
			}
			else
			{
			grid[randRow][randCol] = mine;
			}
		}	
	}
	/*private void ButtonHandler implements ActionListener
	{
	}
*/
}
