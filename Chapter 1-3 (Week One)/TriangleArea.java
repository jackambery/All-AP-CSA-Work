//Name: Jack Ambery
//Assignment: Triangle Area
//Date: 26 September 2019

import java.lang.Math;

public class TriangleArea {
   
   public static double getArea(int s1, int s2, int s3) {
   
      double semi = (s1 + s2 + s3)/2;
      double heron = Math.sqrt(semi*(semi-s1)*(semi-s2)*(semi-s3));
   
      return heron;     
      
   }

   public static void main(String[] args) {           
   
      System.out.println ("The area of the triangle is " + getArea(4,5,6));
           
   }

}