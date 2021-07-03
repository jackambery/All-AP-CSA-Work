//Name: Jack Ambery
//Assignment: Ch. 9 Ex. 5 Random Rps
//Date: 8 January 2020

import java.lang.Math;

public class RandomRps {

   private static char[] rps = {'r', 'r', 'r', 'p', 'p', 'p', 'p', 'p', 's', 's', 's', 's', 's', 's'};

   public static char getRandomRps(char[] rps) {
       char random = rps[(int)(Math.floor(Math.random() * rps.length))]; //gets random double 0 to rps.length then Math.floor rounds answer down so that 0 is a possible answer, 
       return random;
   }
   
   public static void main(String[] args) {
      for (int i = 1; i <= 10; i++) {
         System.out.println(getRandomRps(rps));
      }
   }
}