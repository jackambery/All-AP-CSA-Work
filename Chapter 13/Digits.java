//Name: Jack Ambery  
//Assignment: Ch. 13 Ex. 8 SumDigits
//Date: 11 March 2020

import java.util.Scanner;

public class Digits {

   //-----Methods-----   
   public static int sumDigits(int num) {
      
      if (num < 0) {
         return 0;
      }
      
      int sum = num % 10; 
         
      while (num > 0) {
         sum += sumDigits(num / 10);
         return sum;
      }
      return 0; //code will never reach this statement
   
   }
   
   public static boolean isDivisibleByThree(int num) {
      
      if (sumDigits(sumDigits(num)) == 3) {
         return true;
      }
      if (sumDigits(sumDigits(num)) == 6) {
         return true;
      }
      if (sumDigits(sumDigits(num)) == 9) {
         return true;
      }
      
      return false;
   }
   
   //-----Test-----
   public static void main(String[] args) {
   
      Scanner kb = new Scanner(System.in);
      
      System.out.println("What is the number you would like to add the digits of?");
      int num = kb.nextInt();
      
      int sum = sumDigits(num);
      System.out.printf("The sum of the digits of %d is %d%n", num, sum);
      
      boolean result = isDivisibleByThree(num);
      System.out.printf(num + " is divisible by three: " + result);
   
   }
}