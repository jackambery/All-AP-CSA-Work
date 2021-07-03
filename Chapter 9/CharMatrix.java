//Name: Jack Ambery
//Assignment: Chapter 9 Lab (Snow Day Assignment)
//Date: 8 January 2020

/**
 * Implements a 2-D array of characters
 */

public class CharMatrix
{

  // Fields:
   private char[][] board;
   private static final char SPACE = ' ';
  
  /**
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
   public CharMatrix(int rows, int cols) {
      board = new char[rows][cols]; //creates an array full of null characters
      for (int r = 0; r < board.length; r++) {
         for (int c = 0; c < board[r].length; c++) {
            board[r][c] = SPACE;
         } 
      }
   }

  /**
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill character
   */
   public CharMatrix(int rows, int cols, char fill) {
      board = new char[rows][cols];
      for (int r = 0; r < rows; r++) {
         for (int c = 0; c < cols; c++) {
            board[r][c] = fill;
         }
      }
   }

  /**
   * Returns the number of rows in grid
   */
   public int numRows() {   
      if (board != null) {
         return board.length;
      }
      else {
         return 0;
      }
   }

  /**
   * Returns the number of columns in grid
   */
   public int numCols() {
      if (board != null) {
         return board[0].length;
      }
      else {
         return 0;
      }
   }

  /**
   * Returns the character at row, col location
   */
   public char charAt(int row, int col) {
      return board[row][col];
   }

  /**
   * Sets the character at row, col location to ch
   */
   public void setCharAt(int row, int col, char ch) {
      board[row][col] = ch;   
   }

  /**
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
   public boolean isEmpty(int row, int col) {
      if (board[row][col] == SPACE) {
         return true;
      }
      return false;
   }

  /**
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
   public void fillRect(int row0, int col0, int row1, int col1, char fill) {
      for (int a = row0; a <= row1; a++) {
         for (int b = col0; b <= col1; b++) {
            board[a][b] = fill;
         }
      }    
   }

  /**
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
   public void clearRect(int row0, int col0, int row1, int col1) {
      for (int a = row0; a <= row1; a++) {
         for (int b = col0; b <= col1; b++) {
            board[a][b] = SPACE;
         }
      }    
   }

  /**
   * Returns the count of all non-SPACE characters in row.
   */
   public int countInRow(int row) {
      int result = 0;
      for (int c = 0; c < board[0].length; c++) {
         if (! isEmpty(row, c)) {
            result++;
         }
      }
      return result;
   }

  /**
   * Returns the count of all non-SPACE characters in col.
   */
   public int countInCol(int col) {
      int result = 0;
      for (int r = 0; r < board.length; r++) {
         if (! isEmpty(r, col)) {
            result++;
         }
      }
   return result;
   }
   
}