//Author: Jack Ambery
//Assignment: Covers Ch. 9 Ex. 16
//Date: 13 January 2020

public class Covers {

  //Returns true if m1 covers m2, false if otherwise
  //Precondition: m1 and m2 have the same dimensions
  
   private static boolean covers(double[][] m1, double[][] m2) {
   
      double cover = 0; //amount of area that m1 covers
      int size = 0; //area of whole matrix m1
      
      for (int rows = 0; rows < m1.length; rows++) {
         for (int cols = 0; cols < m1[rows].length; cols++) {
            if (m1[rows][cols] > m2[rows][cols]) {
               cover++;
            }
            size++;
         }
      }
      
      if (cover / size >= 0.5) {
         return true; //(covering more than half)
      }
      
      else {
         return false;
      }   
   }

}