//Author: Jack Ambery
//Assignment: Ch. 13 Ex. 8 printStars
//Date: 16 March 2020

public class Stars {
   
   public static String printStars(int n) {
      String s = "";
      for (int i = 1; i <= n; i++) {
         s += "*";
      }
      return s;
   }
   
   public static void printTriangle(int n) {
   
      if (n < 0) {
         throw new IllegalArgumentException();
      }
      for (int i = 1; i <= n; i++) {
         System.out.println(printStars(i));
      }
   }
   
   public static void printReverseTriangle(int n) {
   
      if (n < 0) {
         throw new IllegalArgumentException();
      }
      for (int i = n; i > 0; i--) {
         System.out.println(printStars(i));
      }
   }   
   
   public static void main(String[] args) {
      
      printTriangle(5);
      printTriangle(0);
      printTriangle(10);
      //printTriangle(-9);
   
      printReverseTriangle(5);
      printReverseTriangle(0);
      printReverseTriangle(10);
      //printReverseTriangle(-9);   
   }
}