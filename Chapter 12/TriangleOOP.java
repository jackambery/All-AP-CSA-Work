//Name: Jack Ambery
//Assignment: Triangle Ch. 12 Ex. 6a
//Date: 3 March 2020

public abstract class TriangleOOP {
   
  //-----Fields-----
  private double side;
  private double perimeter;
  private double area;
  
  //-----Constructors-----
  public TriangleOOP(double side) {
     this.side = side;
  }
  
  //-----Methods-----
  public abstract double getPerimeter();

  public abstract double getArea();
  
  public double getSide() {
     return side;
  }

  public double getRatio() {
     return getArea()/getPerimeter();
  }

}