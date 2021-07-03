//Name: Jack Ambery
//Assignment: sumDigits pg. 201 Ex. 12
//Date: 5 November 2019

import java.util.Scanner;

public class SumDigits {
   
   //Finds the sum of the digits of the given number
   public static int sumOfDigits(int number) {
      
      int sum = 0;
      
      while (number > 0) {
         sum += (number % 10);
         number /= 10;
      }
      return sum;
   }
   
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      
      System.out.println ("What is the number? (The number can not be negative)");
      int given = kb.nextInt();
      
      System.out.println ("The sum of the digits of your number is " + sumOfDigits(given) + ".");
   }
}