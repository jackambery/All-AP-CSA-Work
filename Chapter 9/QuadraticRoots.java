//Author: Jack Ambery
//Assignment: Quadratic Roots Ch. 9 Ex. 7
//Date: 8 January 2020

import java.lang.Math;

public class QuadraticRoots {
   
   public static double[] findRoots(int a, int b, int c) {
   
      double[] roots = new double[2];
      double DISCRIMINANT = (Math.pow(b, 2)) - (4 * a * c);

      //This is what I had for Exercise 7
         //throw new IllegalArgumentException("\"a\" can not be zero.");
      
      if (b == 0 && c != 0) {
         throw new IllegalArgumentException("b is 0");
      }
            
      else if (DISCRIMINANT > 0) {
         roots[0] = (-b + Math.sqrt(DISCRIMINANT)) / 2 * a;
         roots[1] = (-b - Math.sqrt(DISCRIMINANT)) / 2 * a;
      }
      
      else if ((DISCRIMINANT < 0) || (b == 0 && c != 0)) {
         roots = null;
      }
         
      return roots;
   }
   
   public static void main(String[] args) {
   
      if (args.length < 3) {
         System.out.println("Not enough arguments");
         System.exit(0);
      }
   
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);
      
      double[] rootValues = null;
      
      try {
         rootValues = findRoots(a, b, c);
      }
      catch (IllegalArgumentException e) {
         System.out.println(e);
         System.exit(0);
      }
      
      System.out.printf("If the a, b, and c values are %d, %d, and %d:\n", a, b, c);
      System.out.printf("The roots are:\n");
      
      if (rootValues == null) {
         System.out.printf("There are no real roots");
      }
      
      else if (rootValues != null && a != 0) {
         for (double d : rootValues) {
            System.out.printf("%.2f\n", d);
         }
      } 
        
      if (a == 0 && b != 0) {
         double oneroot = -c / b;
         System.out.printf("%.2f\n", oneroot);
      }
         
   }
}