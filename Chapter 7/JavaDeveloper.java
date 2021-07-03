//Author: Jack Ambery
//Assignment: Chapter 7 Ex. 7 Pg. 200
//Date: 3 November 2019

public class JavaDeveloper {

   //Constants
   final private static double FINAL = 95;
   final private static double PERCENT = 0.1;
   final private static double MONTHS_IN_YEAR = 12;
   
   
   //Finds total number of months needed to learn whole book
   public static double monthsNeeded() {
   
      double months = 0;
      double leftToLearn = 100;
      double learned = 0;
      double totalLearned = 0;
      
      //Finds 10% of the material needed to cover and adds it to total material learned
      //Also adds 1 to numbers of months every time
      while (totalLearned < FINAL) {
         learned = leftToLearn * PERCENT;
         leftToLearn -= learned;
         totalLearned += learned;  
         months++;
      }  
          
   return months; //29 months  
   }
   
   //Finds number of whole years it will take to cover material 
   public static int getYears() {
      int years = (int) (monthsNeeded() / MONTHS_IN_YEAR);
   return years;   
   }
   
   //Finds number of remaining months it will take  
   public static int getMonths() {
      int months = (int) (monthsNeeded() % MONTHS_IN_YEAR);
   return months; 
   }

   //Prints final statement
   public static void main(String [] args) {
      System.out.println ("It would take Kevin " + getYears() + " years and " + getMonths() + " months to learn all of the material.");
   
   }

}