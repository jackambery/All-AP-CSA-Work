//Name: Jack Ambery
//Assignment: Diagonals Ch. 9 Ex. 13 
//Date: 12 January 2020

import java.util.Scanner;

public class Diagonals {
   
   public static boolean isDiagonal(int[][] grid, int r, int c) {
      
      if (r >= grid.length || c >= grid[r].length) {
         System.out.printf("Position not in array grid\n");
         System.exit(0);
      }
      
      if (r == c || r + c == grid.length - 1) {
         return true;
      }
      else {
         return false;
      }
   }
   
   public static void main(String[] args) {
   
      int [][] grid = new int[10][10];
      
      Scanner kb = new Scanner(System.in);
      
      System.out.printf("What is the position you would like to test as a diagonal? (row then column)\n");
      int r = kb.nextInt();
      int c = kb.nextInt();
      
      System.out.println(isDiagonal(grid, r, c));
   }
}