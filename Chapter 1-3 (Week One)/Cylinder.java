//Author: Jack Ambery
//Assignment: Cylinder (CORRECTED)
//Date: 9/16/19

public class Cylinder {

   //Fields
   private Circle base;
   private int height;
   
   
   //Constructors
   public Cylinder (int r, int h){
      height = h;
      Circle base = new Circle (r);
      }
   
   //Getters/Setters   
   public int getHeight() {
      return height;
   }
   
   public void setHeight() {
      this.height = height;
   }
   
   public void setBase() {
      this.base = base;
   }
      
   public double getVolume() {
      double area = base.getArea();
      double volume = height * area;
      return volume; 
      }
}