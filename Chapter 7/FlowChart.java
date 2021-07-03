//Author: Jack Ambery 
//Assignment: Ch. 7 Ex. 16 Flow Chart
//Date: 7 November 2019

public class FlowChart {

   private static int n = 37; //Given by book
   private static int b = 2; //Given by book
   private static int p = 1; //Aslo given by book

   public static int flowTest() {
      
      while (p <= n) {
         n = n - p;
         p = p * b;
      }
      
      return n; //6
   }

   public static void main(String[] args) {
      System.out.println ("The soultion to the algorithm is " + flowTest() + ".");
   }
}