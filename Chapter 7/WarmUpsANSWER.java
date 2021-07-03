
public class WarmUpsANSWER{


/*  Given a binary string with 8 digits, give me the decimal value.

    To get the digit from the string you can use binaryString.charAt(place),
    so, if your binaryString = "10110000", then 
    binaryString.charAt(0) will give you "1" 
    binaryString.charAt(1) will give you "0" and so on.
*/
   public static int decimalValueUnsigned(String s) {
   // For now, this only works for strings that are of length 8, so you know there
   // are only 8 places
   
      if (s.length() != 8) throw new IllegalArgumentException();
      int result = 0;
 
      return result;
   }
  
  /* 
    Java stores whole numbers in such a way that the left most bit indicates
    a negative number.
    
    If the first bit is on, the number is negative
    If the first bit is off, the number is positive
    If the number is negative, calculate the positive value of the next 7 bits and subtract 128
    to get the accurate value.
    
  */
   public static int decimalValueSigned(String s) {
   // For now, this only works for strings that are of length 8, so you know there
   // are only 8 places
   
      if (s.length() != 8) throw new IllegalArgumentException();
      int result = 0;
   
      return result;
   }

  /*
    Given a binaryString, calculate the hexValue of the string
    Iterate through the string, iterate through each quadruple
    obtain the hex digit and combine them into a result String
    
    Remember that you must start from the right side of the string
    and move backward.
  */
   public static String hexValue(String s) {
      String result = "";
    
      return result;
   }
  
  /*
   Given a binary String, calculate the octalValue of the string
   Iterate through the string, iterate through each triple obtain
   the octal digit and combine these digits into a result String
    
    Remember that you must start from the right side of the string
    and move backward.
   
   */  
   public static String octalValue(String s) {
      String result = "";
    
      return result;
   }

   
  /*
   Given a binaryString, break it up so there is a space between every four characters
   Remember that you must start at the right and pad the front with 0s
   
   001011 would return 0000 1011
   11101110 would return 1110 1110
   1011011 would return 0101 1011
   
   I recommend that you write a helper method (function) that takes in a decimal number between
   0 and 15 and returns the appropriate hexDigit as a String.
   
  */
   public static String hexString(String s) {
      String result = "";
   
      return result;
   }
  
/*
   Given a binaryString, break it up so there is a space between every three characters
   Remember that you must start at the right and pad the front with 0s
   
   001011 would return 001 011
   11101110 would return 011 101 110
   1011011 would return 001 011 011
  */
   public static String octalString(String s) {
      String result = "";
   
      return result;
   }
  
  /*
    The two's complement of a binary number is  a reversal of all the 0s and 1s
    if a digit in the string is 0, the digit in the resulting string is a 1,
    if a digit in the string is 1, the digit in the resulting string is a 0.
    */
    
   public static String twosComplement(String s) {
      String result = "";
      
      return result;
   }
      /*
     A function to return the number of binary places will be required for an integer
     How it works ... the log base 2 of i is the number of digits required
     log base 2 (i) = log (n) / log (2)
     */
   public static int binaryPlaces(int n) {
      return (int) Math.ceil(Math.log(n) / Math.log(2));
   }
   /*
   Given an integer, return the binary string representation
     The largestPlaceValue calculates how many digits will be in the binary string
     Hint:  if Math.pow(2, PlaceValue) > n then that place value is "1", otherwise "0"
            whenever you add 1 to the result string, subtract that Math.pow(2, PlaceValue)
            from the integer n
*/
   public static String binaryValue(int n) {
      String result = "";
      int largestPlaceValue = binaryPlaces(n);
  
      return result;
   }

    
    /*
      To negate a number, you can take its binary string, take the twos complement of
      it and add 1.
      
      Take in a number, convert it to its binary string, 
      take the twos complement, convert the result back to a number, add one,
      return the number
      
    */
   public static int negate(int n) {
      int result = 0;
      
      return result;
   }
  
  private static void testDecimalValueUnsigned() {
    System.out.println("10110011: " + decimalValueUnsigned("10110011"));
  }
   public static void main(String[] args) {
     testDecimalValueUnsigned();
   }
  
}