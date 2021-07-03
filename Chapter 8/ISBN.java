//Name: Jack Ambery
//Assignment: ISBN Ch. 8 Ex. 20 pg. 233
//Date: 1 December 2019

import java.util.Scanner;

public class ISBN {

//An ISBN is valid if it has 13 digits and the (sum of all the digits) % 10 = 0
// but every even digit is multiplied by 3.

   public static boolean isValidISBN(String isbn) {
      
      int d1 = isbn.charAt(0); //1st digit
      int d2 = isbn.charAt(1); //2nd digit
      d2 *= 3; //Multiplies by 3 because it's even
      int d3 = isbn.charAt(2);
      int d4 = isbn.charAt(3);
      d4 *= 3;
      int d5 = isbn.charAt(4);
      int d6 = isbn.charAt(5);
      d6 *= 3;
      int d7 = isbn.charAt(6);
      int d8 = isbn.charAt(7);
      d8 *= 3;
      int d9 = isbn.charAt(8);
      int d10 = isbn.charAt(9);
      d10 *= 3;
      int d11 = isbn.charAt(10);
      int d12 = isbn.charAt(11);
      d12 *= 3;
      int d13 = isbn.charAt(12);
      
      int sum = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13; 
      
      if (sum % 10 == 0) {
         return true;
      }
      else {
         return false;
      }   
   }
   
   public static void main(String [] args) {
   
      Scanner kb = new Scanner(System.in);
   
      System.out.println("What is the ISBN?");
      String isbn = kb.nextLine();
      
      System.out.println(isValidISBN(isbn));
      
   }
}