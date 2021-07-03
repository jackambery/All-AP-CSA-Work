import java.awt.Point;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Rectangle extends Shape {

   Rectangle (int height, int width) {
      setDimensions (height, width);
   }

   Rectangle (Point p, Dimension d, Color c) {
      super (p, d, c);
   }

   public String toString() {
      return "Rectangle: (" + getLocation() + ") " + (int) getDimensions().getWidth() + "x" + getDimensions().getHeight() + " " + getColor().toString();
   }
   
   @Override
   public void drawMe(Graphics g) {
      Color saveColor = g.getColor();
      g.setColor(getColor());
      g.drawRect((int) getLocation().getX(), (int) getLocation().getY(), (int) getDimensions().getWidth(), (int) getDimensions().getHeight());
      g.setColor(saveColor); 
   }

}