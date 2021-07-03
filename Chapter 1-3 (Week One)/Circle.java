//Author: Jack Ambery
//Assignment: Circle (CORRECTED)
//Date: 11 September 2019

import java.util.Scanner;

public class Circle
{
   
   //Fields
   private int radius;
   
   //Constructor
   public Circle(int r) {
      radius = r;
   }
  
   //Methods (Getters/Setters)
   public int getRadius() {
      return radius;
   }
   
   public int setRaduis() {
      this.radius = radius;
      return radius;
   }
   
   public double getArea() {
      double area = Math.PI * radius * radius;
      return area;
   }
   
}
