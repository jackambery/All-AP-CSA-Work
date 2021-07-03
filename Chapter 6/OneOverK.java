//Author: Jack Ambery
//Assignment: OneOverK Pg. 199 Ex. 2
//Date: 8 November 2019

public class OneOverK {
   
   public static double findSum() {
      
      int n = 1;
      boolean positive = true;
      double addend;
      double sum = 0;
      
      while (n <= 10000) {
      
         if (positive = true) {
            addend = 1 / (double) n;
            sum += addend;
            positive = false;                        
         }
         
         if (positive = false) {
            addend = -(1 / (double) n);
            sum += addend;
            positive = true;         
         }
         
         n++;
      
      } 
      
      return sum;
         
   }
   
   public static void main(String[] args) {
      System.out.println (findSum());
   }
}