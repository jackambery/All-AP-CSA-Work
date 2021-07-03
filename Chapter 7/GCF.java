//Author: Jack Ambery
//Assignment: EC: GCF Pg. 206 Ex. 26
//Date: 13 November 2019

import java.util.Scanner;

public class GCF {

   //Returns GCF of a and b
   //Preecondition: a > 0, b > 0
   public static int gcf(int a, int b) {
      while (a != b) {
         //int temp = ;
         
         if (a > b)
            a %= b;
         else
            b %= a;
      }
      return b;
   }
   
   public static void main(String [] args) {
   
      Scanner kb = new Scanner(System.in);
      
      System.out.println ("This program will find the GCF of integers a and b.");
      System.out.println ("What is the value of a?");
      int userA = kb.nextInt();
      System.out.println ("What is the value of b?");
      int userB = kb.nextInt();
      
      System.out.println ("The GCF of " + userA + " and " + userB + " is " + gcf(userA, userB) + ".");
   }
}