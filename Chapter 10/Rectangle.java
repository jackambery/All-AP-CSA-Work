//Author: Jack Ambery
//Assignment: Ch. 10 Ex. 10 Rectangle
//Date: 5 February 2020

public class Rectangle {
   
   //Fields
   private int height;
   private int width;
   
   //Constructors
   
   public Rectangle(int h, int w) {
   
      if (h <= 0 || w <= 0) {
         throw new IllegalArgumentException (
            "Dimensions can not be negative or zero.");
      }
   
      height = h;
      width = w;
   }
   
   public Rectangle(int side) {
      
      if (side <= 0) {
         throw new IllegalArgumentException (
            "Dimensions can not be negative or zero.");
      }
      
      height = side;
      width = side;
   }
   
   public Rectangle() {
      height = 1;
      width = 1;
   }
   
   //Methods
   
   public static boolean isSquare(Rectangle r) {
      
      if (r.height == r.width) {
         return true;
      }
      
      else {
         return false;
      }
   }
   
   public static void quadratize(Rectangle r) {
      int side = (int) Math.sqrt(r.width * r.height);
      r.height = side;
      r.width = side;
   }

   
   //Test Method
   
   public static void main(String[] args) {
      
      Rectangle rect1 = new Rectangle(4, 5);
      Rectangle rect2 = new Rectangle(8);
      Rectangle rect3 = new Rectangle();
      
      System.out.println("A rectangle with the dimensions 4 and 5 is a square: " + isSquare(rect1));
      System.out.println("A square with a side of 8 is a square: " + isSquare(rect2));
      System.out.println("A rectangle with the dimensions 1 and 1 is a square: " + isSquare(rect3));
        
      System.out.println();
      
      quadratize(rect1);
      System.out.println("After being quadratized, rect1 is now a square: " + isSquare(rect1));

   }
   
}