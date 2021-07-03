//Author: Jack Ambery
//Assignment: Diploma Ch. 12 Ex. 4 Pg. 356
//Date: 2 March 2020

public class Diploma {
   
   //-----Fields-----
   private String name;
   private String major; 
   
   //-----Constructors-----
   public Diploma (String name, String major) {
      this.name = name;
      this.major = major;
   }
   
   //-----Methods-----
   public String toString() {
      return "This certifies that " + name + "\nhas completed a MOOC in " + major;
   }
}