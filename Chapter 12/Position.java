//Author: Jack Ambery
//Assignment: Place Interface Ch. 12 Ex. 14
//Date: 4 March 2020

public class Position implements Place {
   
   private int i;
   
   public Position(int i) {
      this.i = i;   
   }
   
   public int getI() {
      return i;
   }
   
   public int distance(Place other) {
      return Math.abs(this.getI() - ((Position)other).getI());
   }
   
}