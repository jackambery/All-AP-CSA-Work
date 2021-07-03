//Author: Jack Ambery
//Assignment: Palindromes Test pg. 232 ex. 18a and 18b
//Date: 21 November 2019

import java.util.Scanner;

public class PalindromesTest {

   public static void main(String[] args) {
   
      Scanner kb = new Scanner(System.in);
   
      System.out.println("What is the word or phase you believe to be a palindrome?");
      String word = kb.nextLine();
      
      if (Palindromes.isPalindrome(word)) {
         System.out.println("Yes, that is a palindrome.");
      }
      else {
         System.out.println("That is not is palindrome.");
      }
   }
}