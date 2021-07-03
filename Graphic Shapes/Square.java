//Author: Jack Ambery
//Assignment: Graphic Shapes Square Portion
//Date: 22 September 2019

import java.awt.Point;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Square extends Shape {

   //Constructors
   Square (int height, int width) {
      setDimensions (width, width);
   }

   Square (Point p, Dimension d, Color c) {
      super(p, d, c);
   }
   
   public void setWidth(int width) {
      setDimensions(width, width);
   }
   
   //public int getWidth() {
    //  return 0;
   //}

   public String toString() {
      return "Square: (" + getLocation() + ") " + (int) getDimensions().getWidth() + " " + getColor().toString();
   }
   
   @Override
   public void drawMe(Graphics g) {
      Color saveColor = g.getColor();
      g.setColor(getColor());
      g.drawRect((int) getLocation().getX(), (int) getLocation().getY(), (int) getDimensions().getWidth(), (int) getDimensions().getWidth());
        g.setColor(saveColor); 
          }

}