//Name: Jack Ambery
//Assignment: Ch. 7 Ex. 2 Flowchart with handwritten chart
//Date: 7 November 2019

import java.lang.Math; //only used for calculating pi for comparison, not used in flowchart code

public class Ch7Ex2Flowchart{

   private static final double NATURAL_LOG_2 = Math.log(2);

   public static double solveChart(int x) {
   
      double sum = 0;
      double factor = -1; //starts at -1 to then be multiplied by -1 to be therefore positive
   
      for (double i = 1; i <= x; i++) {
         factor *= -1;
         sum += factor * ( 1 / i );
      }
      return sum;
   }

   public static void main(String[] args) {
      System.out.printf("The answer to the flowchart is %f%nwhich is equal to the natural logarithm of 2 or, %f", solveChart(10000), NATURAL_LOG_2);
   }
   
}
