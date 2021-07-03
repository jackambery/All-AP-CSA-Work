//Name: Jack Ambery
//Assignment: FCConverter Classwork Assignment
//Date: 5 Feburary 2020

public class FCConverter {
   
   //Fields
   private double celsius, fahrenheit;
   
   //Getters/Setters
   public void setFahrenheit(double degrees) {
      fahrenheit = degrees;
      celsius = 5.0 / 9 * (degrees - 32);
   }
   
   public void setCelsius(double degrees) {
      celsius = degrees;
      fahrenheit = (9.0 / 5 * degrees) + 32;
   }
   
   public double getFahrenheit() {
      return fahrenheit;
   }   
   
   public double getCelsius() {
      return celsius;
   }
   
   public String toString() {
   
      String result = "";
      char degreeSymbol = '\u00F8';
      result += String.format("%.2f%cC and %.2f%cF\n", celsius, degreeSymbol, fahrenheit, degreeSymbol);
      
      return result;
      
   }
   
   public static void main(String[] args) {
      
      FCConverter fc = new FCConverter();
      
      fc.setFahrenheit(212.0);
      System.out.println(fc);
   
      fc.setCelsius(0.0);
      System.out.println(fc);  
   }
}