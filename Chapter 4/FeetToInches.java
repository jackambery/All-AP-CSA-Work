//Name: Jack Ambery
//Assignment: Chapter 5 Question 12 Feet to Inches
//Date: 10 October 2019

import java.util.Scanner;

public class FeetToInches
{
  public static int toInches(int feet, int inches){
      int height = (feet * 12) + inches;
      return height
  }

  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("Feet: ");
    int feet = kboard.nextInt();

    System.out.print("Inches: ");
    int inches = kboard.nextInt();

    kboard.close();

    int totalInches = toInches(feet, inches);

    System.out.println(feet + " feet and " + inches + " inches = " + totalInches + " inches");
  }
}
