//Author: Jack Ambery
//Assignment: Palindromes pg. 232 ex. 18a and 18b
//Date: 21 November 2019

public class Palindromes {

   public static boolean isPalindrome(String word) {
      //is word same forwards and backwards?
      
      word = word.toLowerCase();
      word = word.replaceAll("[^a-zA-Z]", "");
      word = word.replaceAll("\\s", "");
      
      int x = word.length();
      for (int i = 0; i < (x/2); i++) {
         if (word.charAt(i) != word.charAt(x - i - 1)) {
            return false;
         }
      }
      
      return true;
   }
}