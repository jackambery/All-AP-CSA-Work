//Author: Jack Ambery
//Assignment: Circle Test
//Date: 11 September 2019

import java.util.Scanner;

public class CircleTest {
   public static void main(String[] args) {
       
   Scanner kb = new Scanner(System.in);
   
   System.out.println ("What is the radius of the circle?");
      int radius = kb.nextInt();
   
   
   //Calling other file
   Circle theCircle = new Circle(radius);
   
      double area = theCircle.getArea();

   
   //System.out.println (theCircle + ": ");
   System.out.println ("The area is " + area);
   
   }

}
