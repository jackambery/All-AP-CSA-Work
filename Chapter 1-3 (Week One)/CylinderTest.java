//Author: Jack Ambery
//Assignment: Cylinder Test (CORRECTED)
//Date: 16 September 2019

import java.util.Scanner;

public class CylinderTest {

   //Main Method
   public static void main(String[] args) {
       
   Scanner kb = new Scanner(System.in);
   
   System.out.println ("What is the radius of the base?");
      int radius = kb.nextInt();
   
   System.out.println ("What is the height of the cylinder?");
      int height = kb.nextInt();
   
   
   //Calling other file
   Circle baseRadius = new Circle(radius);
   
      double areaOfBase = baseRadius.getArea();

   //Final Print
   System.out.println ("The volume is " + areaOfBase * height);
   
   }

}
