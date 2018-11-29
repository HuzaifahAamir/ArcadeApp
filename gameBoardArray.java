package cs1302.arcade;

/**
 * Class representing a gameboard, with methods to check for a game piece on all sides.
 */ 
 public class GameBoardArray {
     
	 int[][] board; //Represents a board, where if int i 1
	 				//there's a game piece there. 0 if there is not
     
     /**
      * Constructor: Creates a double aray of dimensions given by parm
      * @param int x rows int y columns
      */
     public GameBoardArray(int x, int y) {
        board = new int[x][y];
        initBoard();
     }
 
     /**
      * Initializes the game board array; makes all int in array 0,
      */
     private void initBoard() {
    	  	for(int x = 0; x < board.length; x++) {
    	  		for(int y = 0; y < board[x].length; y++) {
    	  			board[x][y] = 0;
    	  		}
    	  	} 
     }
 
 }
