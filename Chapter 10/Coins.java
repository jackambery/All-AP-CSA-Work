//Author: Jack Ambery
//Assignment: Ch. 10 Ex. X Coins 
//Date: 11 February 2020

import java.util.Scanner;

public class Coins {
   
   //Fields
   
   private int cents;
   private static int quarters, nickels, dimes, pennies;

   //Constructors

   public Coins(int c) {
        
      cents = c;

      quarters = c / 25;
      c %= 25;
      
      dimes = c / 10;
      c %= 10;
      
      nickels = c / 5;
      c %= 5;
      
      pennies = c;
  }

   //Methods
   //methods are only static so they can be used in the test method

   public static int getQuarters() {
   
      return quarters;
   }

   public static int getDimes() {
   
      return dimes;
   }

   public static int getNickels() {
   
      return nickels;
   }

   public static int getPennies() {
   
      return pennies;
   }
   
   
   //Method to Test
   public static void main(String[] args) {
      
      Scanner kb = new Scanner(System.in);
      System.out.println("What is the amount of cents?");
      Coins cents = new Coins(kb.nextInt());
      
      System.out.println("The lowest amount of coins you can use are:");
      System.out.println(cents.getQuarters() + " quarters,");
      System.out.println(cents.getDimes() + " dimes,");
      System.out.println(cents.getNickels() + " nickels, and");
      System.out.println(cents.getPennies() + " pennies.");
   }

}