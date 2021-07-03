//Author: Jack Ambery
//Assignment: Ch. 10 Ex. 13 Time 
//Date: 11 February 2020

public class Time {

   //Feilds
   
   private int hours;
   private int mins;
   
   //Constructors
   
   public Time(int h, int m) {
      
      h = hours;
      m = mins;
      
      if (hours >= 24 || hours < 0 || mins >= 60 || mins < 0) {
         throw new IllegalArgumentException(
            "Arguements are not valid.");
      }      
   }
   
   //Private Methods
   
   private int toMins() {
      
      int totalMins = (hours * 60) + mins;
      
      return totalMins;
   }
   
   //Public Methods
   
   public boolean lessThan(Time t) {
      
      if (this.toMins() < t.toMins()) {
         return true;
      }
      
      else {
         return false;
      }
   }
   
   public int elapsedSince(Time t) {
      
      int elapsedMins = this.toMins() - t.toMins();
      
      return elapsedMins;
   }
   
   public String toString() {
      
      return this.hours + ":" + this.mins;
   }
   
}