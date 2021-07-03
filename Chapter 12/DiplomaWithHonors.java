//Author: Jack Ambery
//Assignment: DiplomaWithHonors for Diploma Exercise
//Date: 2 March 2020

public class DiplomaWithHonors extends Diploma {
   
   //-----Constructors-----
   public DiplomaWithHonors(String name, String major) {
      super(name, major);
   }
      
   //-----Methods-----
   @Override
   public String toString() {
      return super.toString() + "\n*** with honors ***";
   }
   
}