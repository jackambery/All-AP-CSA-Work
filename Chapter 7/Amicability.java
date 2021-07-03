//Author: Jack Ambery
//Assignment: Chapter 7 Test Corrections Questions 26a and 26b
//Date: 25 November 2019

public class Amicability {

   //Question 26a
   public static int sumOfFactors(int x) {
      
      int sum = 0;
      
      for (int i = 1; i < x; i++) {
         if (x % i == 0) {
            sum += i;
         }
      } 
                
      return sum; //sum of all factors of x
   }
   
   //Question 26b
   public static String findAmicables() {
   
      for (int m = 1; m <= 1000; m++) {
         for (int n = m + 1; n <= 1000; n++) {
            if (sumOfFactors(n) == m && sumOfFactors(m) == n) 
               return (m + " and " + n + " are a pair of amicable numbers less than 1000.");              
            }
         } 
         return ""; 
      }   
   
   public static void main(String[] args) {
   
      System.out.println("These are all of the amicable numbers less than 1000:");
      
      System.out.println(findAmicables());
               
      }
}