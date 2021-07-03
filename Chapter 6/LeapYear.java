//Author: Jack Ambery
//Assignment: Ex. 13 Pg. 171 Leap Year
//Date: 17 October 2019

import java.util.Scanner;

public class LeapYear {

   public static boolean isLeapYear (int year) {
      if ((year % 4  == 0) && (year % 100 != 0 || year % 400 == 0)) {
         return true;
      }
      else { 
         return false;
      } 
   }
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
   
      System.out.println("What is the year?");
      int year = kb.nextInt();
         
      System.out.println("The result for is " + year + " a leap year is " + isLeapYear(year) + ".");
   }
}