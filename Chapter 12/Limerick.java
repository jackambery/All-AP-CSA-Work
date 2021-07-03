//Author: Jack Ambery
//Assignment: Ch. 12 Ex. 5 Limerick
//Date: 28 February 2020

public class Limerick extends Poem {

   //Limerick:
   //9 Syllables
   //9 Syllabes
   //6 Syllables
   //6 Syllables
   //9 Syllables

   //-----Fields-----
   private static int lines = 5;
	
	//-----Methods-----
   @Override
   public int getSyllables(int k) {
  
      if(k == 0 || k == 1 || k == 4)
         return 9;
      
      else
         return 6;
   }
	
   @Override
   public int numLines() {
      return lines; //5
   }
	
   
}