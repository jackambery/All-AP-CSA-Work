//Name: Jack Ambery
//Assignment: Equilateral Triangle Ch. 12 Ex. 6a
//Date: 3 March 2020

public class EquilateralTriangle extends TriangleOOP {
   
   //-----Constructors-----
   public EquilateralTriangle(double side) {
      super(side);
   }
   
   //-----Methods-----
   @Override
   public double getPerimeter() {
      return 3 * getSide();
   }
   
   @Override
   public double getArea() {
      return Math.sqrt(3) / 4 * getSide() * getSide();
   }

}