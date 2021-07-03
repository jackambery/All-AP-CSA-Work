/*Author: Jack Ambery
*Assignment: Pg. 174 Ex. 20 Die with N Faces
*Date: 21 October 2019
*/

public class Die {
   
   //Fields
   private int numDots;
   private int numFaces;
   private int faces;
   
   //Constructors
   public Die () {
      faces = 6;
   }
   
   public Die (int n) {
      faces = n;
   }
   
   //Roll Method   
   public void roll() {
      numDots = (int)(Math.random() * faces + 1);   
   }

   //Sets numDots
   public int getNumDots() {
      return numDots;
   }
   
   //toString Method
   public String toString() {
            return "" + numDots;
   }

}