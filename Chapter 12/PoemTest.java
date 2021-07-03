//Name: Jack Ambery
//Assignment: Test for Poems
//Date: 28 February 2020

public class PoemTest {

public static void main(String[] args) {
   
   	Limerick limerick = new Limerick();
      Haiku haiku = new Haiku();
      
      System.out.println("A haiku has " + haiku.numLines() + " lines.\n");
      System.out.println("A limerick has " + limerick.numLines() + " lines.\n");
      
      System.out.println("Haiku Syllable Format:");
      haiku.printRhythm();
      
      System.out.println("\nLimerick Syllable Format:");
      limerick.printRhythm();
   }

}