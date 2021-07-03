//Author: Jack Ambery
//Assignment: Pg. 204 Ex. 19 Multiplication Table
//Date: 12 November 2019

public class MultiplicationTable{

   //repeats the multiplication of 12 numbers, 12 times to make a 12x12 table
   public static String table() {
      
      int factor1;
      int factor2;
      
      for (factor1 = 1; factor1 <= 12; factor1++) {
         for (factor2 = 1; factor2 <= 12; factor2++) {
            System.out.print("|" + factor1 * factor2 + "|" + "\t");
         }
         
         System.out.println();
      }
      
      return ""; //returns nothing because method could not be void 
      
   }

   public static void main(String [] args) {
      
      //Prints multiplication method
      System.out.println(table());
   }
}