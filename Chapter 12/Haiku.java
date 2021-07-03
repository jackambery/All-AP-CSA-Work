//Author: Jack Ambery
//Assignment: Ch. 12 Ex. 5 Haiku
//Date: 28 February 2020

public class Haiku extends Poem {

   //Haiku:
   //5 Syllables
   //7 Syllabes
   //5 Syllables

   //-----Fields-----
   private static int lines = 3;
	
	//-----Methods-----
   @Override
   public int getSyllables(int k) {
  
      if(k == 1)
         return 7;
      
      else
         return 5;
   }
	
   @Override
   public int numLines() {
      return lines; //3
   }

}