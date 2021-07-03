//Author: Jack Ambery
//Assignment: Ch. 12 Ex. 5 Poem
//Date: 28 February 2020

public abstract class Poem {
   
   //-----Fields-----  
   private int lines;
   
   //-----Methods-----
   public abstract int numLines();
   
   public abstract int getSyllables(int k);
   
   public void printRhythm() {
      
      String rhythm = "";
      
      for (int i = 0; i < numLines(); i++) { //Each line in poem
         for (int j = 0; j < getSyllables(i); j++) { //Each syllable in line 
            
            if (j == getSyllables(i) - 1) { //if it is the last syllable of the line, no dash after
               rhythm += "ta";
            }
            
            else {
               rhythm += "ta-"; //normal to have dash after
            }
         }
         rhythm += '\n'; //enter after each line loop complete
      }
      System.out.println(rhythm);
   }
}