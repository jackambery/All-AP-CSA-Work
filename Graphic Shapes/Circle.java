//Author: Jack Ambery
//Assignment: Circle for Graphic Shapes
//Date: 29 October 2019

import java.awt.Point;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.Math;

public class Circle extends Shape {

   public Circle (int radius) {
      setDimensions(radius, radius);
   }

   Circle (Point p, Dimension d, Color c) {
      super(p,d,c);
   }

   
   public void setRadius(int radius) {
      setDimensions(radius, radius);
   }


   public String toString() {
      return "Circle: (" + getLocation() + ") " + (int) getDimensions().getWidth() + " " + getColor().toString();
   }

   @Override
   public int getArea() {
      return (int)(Math.pow(getDimensions().getWidth(),2) * Math.PI);
   }
   
   public int getDiameter() {
      return (int)(getDimensions().getWidth());
   }
   
   public int getCircumference() {
     return (int)(getDiameter() * Math.PI);
   }

   @Override
   public int getPerimeter() {
     return (int)(getDiameter() * Math.PI);
   }
   
   @Override
   public void drawMe(Graphics g) {
      Color saveColor = g.getColor();
      g.setColor(getColor());
      g.drawOval((int) getLocation().getX(), (int) getLocation().getY(), (int) getDimensions().getWidth(), (int) getDimensions().getHeight());
        g.setColor(saveColor); 
          }

}