//Author: Jack Ambery
//Assignment: Scrabble Ch. 9 Ex. 12
//Date: 10 January 2020

import java.util.Scanner;

public class Scrabble { 
                                    
   public static int computeScore(String word) {
      
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      int[] letterValues = {1, 3, 3, 2, 1,
                            4, 2, 4, 1, 8,
                            5, 1, 3, 1, 1,
                            3, 10, 1, 1, 1,
                            1, 4, 4, 8, 4,
                            10 };

      
      int score = 0;
      
      for (int i = 0; i < word.length(); i++) {
         score += letterValues[alphabet.indexOf(word.toLowerCase().charAt(i))];
        /* for (int j = 0; j < 26; j++)   {
            if(choice.substring(i).equals(alphabet[j]))
            {
               score += values[n];
            }
         }*/
      }

      return score;
   }
    
   public static void main(String[] args) {
            
      Scanner kb = new Scanner(System.in);
      
      System.out.printf("What is your word?\n");
      String word = kb.nextLine();
      
      System.out.println("The score for your word is " + computeScore(word));
   }

}