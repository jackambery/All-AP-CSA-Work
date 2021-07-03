//Author: Jack Ambery
//Assignment: Position/Place Test Ch. 12 Ex. 14
//Date: 4 March 2020

public class PositionTest {
   
   public static boolean sameDistance(Place p1, Place p2, Place p3) {
      return p1.distance(p2) == p1.distance(p3);
   }
   
   public static void main(String[] args) {
      
      Position p1 = new Position(6);
      Position p2 = new Position(3);
      Position p3 = new Position(9);
      
      System.out.println("For points 6, 3, and 9: " + sameDistance(p1, p2, p3));
   
      Position p4 = new Position(1);
      Position p5 = new Position(2);
      Position p6 = new Position(3);
      
      System.out.println("For points 1, 2, and 3: " + sameDistance(p4, p5, p6));
   }
}