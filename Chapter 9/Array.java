//Name: Jack Ambery
//Assignment: Finishing Array Practice from Class
//Date: 15 January 2020

import java.util.Random;

public class Array{

// There are a few errors in this code that 
// have been allowed to remain to demonstrate specific points
// When you arrive at one of these, ask about it.

   public static void fill_Ints(int[] ints) {
   
      if (ints == null || ints.length < 10) {
         ints = new int[10];
      }
      for (int i = 0; i < ints.length; i++) {
         ints[i] = (int)(Math.random() * 10 + 1);  
      }
   
   }

   public static String printIntArray(int[] ints) {
   
      String result = "";
      
      for (int n = 0; n < ints.length; n++) {
         result += String.format("%d: %d\n", n, ints[n]);
      }
      
      return result;
   }
   
   public static double[] fill_Doubles() {
   
      double[] doubles = new double[10];
      
      for (int d = 0; d < doubles.length; d++) {
         doubles[d] = Math.random() * 1000;
      }
      
      return doubles;
   }
   
   public static String printDoubleArray(double[] doubles) {
   
      String result = "";
      
      for (int i = 0; i < doubles.length; i++) {
         result += String.format("%7.2f\n", doubles[i]);
      }
      
      return result;
   }
   
   // This is a method that is provided to produce random letters
   // It would be a good idea for you to understand how this code works
   
   private static char getRandomLetter() {
   
      final int lowercaseStart = (int) 'a';
      final int uppercaseStart = (int) 'A';
      final int numLetters = 26;
    
      int intLetter = (int) (Math.random() * numLetters);
      Random r = new Random();
    
      if (r.nextBoolean()) 
         intLetter +=  lowercaseStart;
      else
         intLetter += uppercaseStart;
    
      return (char) intLetter;
   }
   
   public static char[] fill_Chars() {
   
      char[] randomChars = new char[(int)(Math.random() * 11 + 5)];
   
      for (int i = 1; i < randomChars.length; i++) {
         randomChars[i] = getRandomLetter();
      }
   
      return randomChars;
   }

   public static String printCharArray(char[] chars) {
      
      String result = "";
      
      for (int i = 0; i < chars.length; i++) {
         result += String.format("%c\n", chars[i]);
      }
      
      return result;
   }
   

   public static void fill_Strings (String[] strings, char[] chars) {
   
   // Fills strings array with 5 letter words composed of 
   // random selections from the character array
   
      strings = new String[7];
      
      for (int i = 1; i < strings.length; i++) {
         for (int k = 1; k <= 5; k++) {
            strings[i] += chars;
         }
      }
   
   }

   // This method is provided to print values of any array that holds 
   // objects.  It actually depends on the toString of the object created
   // It would be useful for you to create a class and fill the array with 
   // random items from the class to see how it works
   
   public static String printArray(Object[] objs) {
      if (objs == null) 
         return "";
      String result = "";
      for (Object o : objs) 
         result += "\t" + o + "\n";
      return result;
   }
   
   public static int find(int[] ints, int element) {
   
      for (int i = 1; i <= ints.length; i++) {
         if (ints[i] == element) {
            return i;
         }
      }
      
      return -1;
   }

   public static void remove(int[] ints, int element) {
      
      find(ints, element);
      int index;
      
      for (int i = 0; i < ints.length; i++) {
         if (ints[i] == element) {
            index = i;
            
            for (int j = i + 1; j < ints.length; j++) {
               ints[j - 1] = ints[j];
            }
         }
      }
      
      ints[ints.length - 1] = Integer.MIN_VALUE;
   
   }
   
   public static void insert(int[] ints, int element, int index) {
   
      for (int i = ints.length - 1; i > index; i--) {
            ints[i] = ints[i - 1];
         }
      ints[index] = element;   
   
   }
   
   public static void main (String[] args) {
      
      String[] stringArray;
      double[] doubleArray;
      char[] charArray;
      
      int[] intArray = new int[20];
      charArray = new char[8];
      stringArray = new String[20];

   
      fill_Ints(intArray);
      System.out.println("Integers");
      System.out.println(printIntArray(intArray));
   
      doubleArray = fill_Doubles();
      System.out.println("Doubles");
   // This is where you will see the first big error, what is the error, why is it happening and how do you fix it?
      System.out.println(printDoubleArray(doubleArray));
   
      fill_Chars();
      System.out.println("Chars");
      System.out.println(printCharArray(charArray));
   
      fill_Strings(stringArray, charArray);
      System.out.println("Strings");
      System.out.println(printArray(stringArray));   
      
      Integer num = intArray[5];
      System.out.printf("%d was found in position %d\n", num, find(intArray, num));
      
      System.out.println("Removing " + num + " from Integers");
      remove(intArray, num);
      System.out.println(printIntArray(intArray));
      
      System.out.println("Inserting 42 at position 3");
      insert(intArray, 42, 3);
      System.out.println(printIntArray(intArray));
   }
}