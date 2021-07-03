//Author: Jack Ambery
//Assignment: Diploma Test
//Date: 2 March 2020

public class DiplomaTest {
   
   public static void main(String[] args) {
      
      Diploma diploma1 = new Diploma("Adam Smith", "Gardening");
      DiplomaWithHonors diploma2 = new DiplomaWithHonors("Betsy Smith", "Robotics");
      
      System.out.println(diploma1.toString());
      System.out.println();
      System.out.println(diploma2.toString());

   }
}