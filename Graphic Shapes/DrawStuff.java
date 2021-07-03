//Name: Jack Ambery
//Assignment: Graphic Shapes
//Date: 29 October 2019

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Color;

public class DrawStuff {

   private static final int NUMSHAPES = 3;   // This should equal the number of shapes you have created
   private static final int NUMTESTS = 20;   // Number of test shapes you want to draw
   
   private static final int CIRCLE = 1;      // Constant Values for the Shapes ... if you do another shape, add another constant and
   private static final int RECTANGLE = 2;         // add it to the addRandomShape method
   private static final int SQUARE = 3;


// Adds a random shape to the list

   private static void addRandomShape(ShapeGraphics w) {
      int shapeChoice = (int) (Math.random() * NUMSHAPES) + 1;
      System.out.print(shapeChoice + ": ");
      Shape newShape;
      switch (shapeChoice) {
         case CIRCLE : newShape = randomCircle(); 
         break;
         case RECTANGLE : newShape = randomRectangle(); 
         break;
         case SQUARE : newShape = randomSquare(); 
         break;
         default: newShape = randomCircle();
      }
      System.out.println(newShape);
      w.addShape(newShape);
   }
   
   // Chooses a random point between 0 and 3/4 of the width/height ... so at least some of the shape is on the window

   private static Point randomPoint() {
      int x = (int) (Math.random() * ShapeGraphics.PANEL_WIDTH *.75);
      int y = (int) (Math.random() * ShapeGraphics.PANEL_HEIGHT * .75);
      return new Point(x,y);
   }

   // Chooses a random height/width for the shape - limits the size to 1/5th the size of the window
   
   private static Dimension randomDimensions() {
      int width = (int) (Math.random() * ShapeGraphics.PANEL_WIDTH/5);
      int height = (int) (Math.random() * ShapeGraphics.PANEL_HEIGHT/5);
      return new Dimension(width, height);
   }

   // Makes an array of Java's built-in colors and then returns a random one.  This method
   // should be in a library that we could use over and over again ...
   
   private static Color randomColor() {
      Color[] colors = new Color[] {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY,
                                    Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE,
                                    Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
   
      int index = (int) (Math.random()* colors.length);
      return colors[index];
   }

   // Creates a random Circle, at a random point, with a random size and color
   private static Circle randomCircle() {
      return new Circle( randomPoint(), randomDimensions(), randomColor());
   }
    
   // Creates a random Rectangle, at a random point, with a random size and color
   private static Rectangle randomRectangle() {
      return new Rectangle(randomPoint(), randomDimensions(), randomColor());
   }
   
   // Creates a random Square, at a random point, with a random size and color
   private static Square randomSquare() {
      return new Square(randomPoint(), randomDimensions(), randomColor());
   }
   
   
   // This is the method that actually runs ...
   // It creates a ShapeGraphics object (to draw the shapes on)
   // Then it fills an array (actually an arraylist) with random shapes and displays them
   
   
   // THINGS THAT WE COULD ADD:
   //       Event Listeners that would allow you to change a shape when you click on it
   //       Buttons that allow you to redo or close or ...
   //       Pull downs that allow you to change all of the colors to one color
   //       Code that would cause the shapes to move (2 directions is easier than random, but random is possible)
   //       Collision Listeners that would detect if two shapes ran into each other
   //       SO MUCH MORE
   
   public static void main (String[] args) {
      
      ShapeGraphics window = new ShapeGraphics();
      for (int x = 0; x < NUMTESTS; x++) 
         addRandomShape(window);
       window.repaint();
   }



}