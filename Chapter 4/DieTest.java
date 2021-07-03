//Name: Jack Ambery
//Assignment: Test for Die Assignment
//Date: 23 October 2019

import java.util.Scanner;

public class DieTest {

   public static void main(String [] args) {
   
   Scanner kb = new Scanner(System.in);
   
      System.out.println("How many faces are on the dice?");
   
         int possible = kb.nextInt(); 
      
      //new die object for NOT default
      Die myDie = new Die(possible);
      
      //new die for default dice
      Die defaultDie = new Die();
         
      //10 rolls for user input dice         
      for (int i = 0; i < 10; i++) {
         myDie.roll();  
         System.out.println("You rolled: " + myDie);
      }
      
      System.out.println("Ten rolls for a six-sided die:");
         
      //10 rolls for default dice
      for (int i = 0; i < 10; i++) {
         defaultDie.roll();
         System.out.println("You rolled: " + defaultDie);
      
      }
   }
 
}
