/* Author: Jack Ambery
* Assignment: pg. 175 Ex. 22 One, Two, Buckle My Shoe
* Date: 22 October 2019
*

*  Poem:
*  One, two, buckle your shoe;
*  Three, four, shut the door;
*  Five, six, pick up sticks;
*  Seven, eight, lay them straight;
*  Nine, ten, big fat hen;
*/

import java.util.Scanner;

public class BuckleMyShoe {

   public static void getResult(int number) {
   
      switch (number) {
         case 1:
         case 2:
            System.out.println ("Buckle your shoe");
            break;
         case 3:
         case 4:
            System.out.println ("Shut the door");
            break;
         case 5:
         case 6:
            System.out.println ("Pick up sticks");
            break;
         case 7:
         case 8:
            System.out.println ("Lay them straight");
            break;
         case 9:
         case 10:
            System.out.println ("Big fat hen.");
            break;
         case 0:
            System.out.println ("Bye");
            break;
         default:
            System.out.println ("That is not a valid number");
      }
   }


   public static void main(String [] args) {
   
      Scanner kb = new Scanner(System.in);
      
      System.out.print ("Enter a number 1-10 (or 0 to quit): ");
      int number = kb.nextInt();
      
      getResult(number);
             
   }
   
}