//Name: Jack Ambery
//Assignment: Right Triangle Ch. 12 Ex. 6a
//Date: 3 March 2020

public class RightTriangle extends TriangleOOP {
   
   //-----Constructors-----
   public RightTriangle(double side) {
      super(side);
   }
   
   //-----Methods-----
   @Override
   public double getPerimeter() {
      return (2 + Math.sqrt(2.0)) * getSide();
   }
   
   @Override
   public double getArea() {
      return getSide() * getSide() / 2;
   }

}