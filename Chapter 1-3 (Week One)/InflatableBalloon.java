//Author: Jack Ambery
//Asssignment: Inflatable Balloon
//Date: 27 September 2019

import java.util.Scanner;

public class InflatableBalloon extends Balloon {
    
   public void inflate(int percentage) {
      int radius = this.getRadius();
      double volume = Math.pow(radius, 3);
      volume = volume * (1 + (0.01 * percentage));
      radius = (int)Math.cbrt(volume);
      setRadius(radius);
     
   }
   
   public static void main(String[] args) {
   
      Scanner kb = new Scanner(System.in);
      
      System.out.println ("What is the radius of your balloon?");
         int radius = kb.nextInt();
   
      System.out.println ("How much do you want to inflate the balloon, by what percent?");
         int percent = kb.nextInt();

      InflatableBalloon bigBalloon = new InflatableBalloon();
          bigBalloon.setRadius(radius);
          bigBalloon.inflate(percent);  
              
      System.out.println(bigBalloon);
   
   }


}