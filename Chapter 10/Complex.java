//Name: Jack Ambery
//Assignment: Ch. 10 Ex. 18 Complex Classwork
//Date: 6 February 2020

public class Complex {
   
   //Fields:
   
   double a;
   double b;
   
   //Constructors
   
   Complex (double a) {
      this.a = a;
   }
   
   Complex (double a, double b) {
      this.a = a;
      this.b = b;
   }
   
   //Methods
   
   public double abs() {
      return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
   }
   
   public Complex add(Complex other) {
      Complex result = new Complex(a + other.a, b + other.b);
      return result;
   }
   
   public Complex multiply(Complex other) {
   
      double newA = a * other.a - b * other.b;
      double newB = a * other.b + b * other.a;
   
      Complex product = new Complex(newA, newB);
   
      return product;
   }
   
   public Complex add(double other) {
      return new Complex(a + other, b);
   }
   
   public Complex multiply(double other) {
   
      double newA = a * other;
      double newB = b * other;
   
      return new Complex(newA, newB);
   }
   
   public String toString() {
      String result = "";
      result = a + " + " + b + "i";
      return result;
   }
   
   //Test Method
   
   public static void main(String[] args) {
      
      Complex one = new Complex(3, 4);
      System.out.printf("one = %s\n", one);
      
      Complex two = new Complex(3);
      System.out.printf("two = %s\n", two);
      
      Complex three = new Complex(-2.5, 1.5);
      System.out.printf("three = %s\n", three);
      
      System.out.println("Absolutes");
      System.out.printf("\t%.2f\n", one.abs());
      System.out.printf("\t%.2f\n", two.abs());
      System.out.printf("\t%.2f\n", three.abs());
      
      System.out.println("Adding Tests");
      System.out.printf("\t%s + %s = %s\n", one, two, one.add(two));
      System.out.printf("\t%s + %s = %s\n", two, three, two.add(three));
      System.out.printf("\t%s + %s = %s\n", one, three, one.add(three));      
      System.out.printf("\t%.2f + %s = %s\n", 2.5, one, one.add(2.5));
      System.out.printf("\t%.2f + %s = %s\n", 0.0, two, one.add(0.0));
      System.out.printf("\t%.2f + %s = %s\n", -2.5, three, one.add(-2.5));

      System.out.println("Multiplying Tests");
      System.out.printf("\t%s * %s = %s\n", one, two, one.multiply(two));
      System.out.printf("\t%s * %s = %s\n", two, three, two.multiply(three));
      System.out.printf("\t%s * %s = %s\n", one, three, one.multiply(three));      
      System.out.printf("\t%.2f * %s = %s\n", 2.5, one, one.multiply(2.5));
      System.out.printf("\t%.2f * %s = %s\n", 0.0, two, one.multiply(0.0));
      System.out.printf("\t%.2f * %s = %s\n", -2.5, three, one.multiply(-2.5));
      
   }
}