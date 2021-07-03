//Authors: Jack Ambery with Matt Lorenzo
//Assignment: Warm Up
//Date: 13 November 2019

import java.lang.Math;

public class WarmUps {

   private final static int BINARY_BASE = 2;
   
   public static int decimalValueUnsigned(String S) {
   
      S = "10110011";
      
      if (S.length() != 8) throw new IllegalArgumentException();
      int result = 0;
      
      for (int i = 7; i >= 0; i--) {
                  
         if (S.charAt(i) = 0) {
            result += 0;
         }
         
         if (S.charAt(i) = 1) {
            result += (Math.POW(BINARY_BASE, i));
         }
      }
      
         return result;
   
   } 
}