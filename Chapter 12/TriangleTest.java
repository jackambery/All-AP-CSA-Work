//Name: Jack Ambery
//Assignment: Test for Triangle Ch. 12 Ex. 6a
//Date: 3 March 2020

public class TriangleTest {

   public static void main(String[] args) {
   
      EquilateralTriangle equilateralTriangle = new EquilateralTriangle(12);
      RightTriangle rightTriangle = new RightTriangle(12);
   
      System.out.println("Ratio of Equilateral with side of 12: " + equilateralTriangle.getRatio());
      System.out.println("Ratio of Right Isosceles with side of 12: " + rightTriangle.getRatio());
   }
}

// Exercise 6b:
// As see above, if an equilateral triangle and right isoceles 
// triangle have the same side length, in this case 12, 
// the right isoceles triangle will have a larger
// inscribed circle radius.