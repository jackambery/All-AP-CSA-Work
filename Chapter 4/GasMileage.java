//Author: Jack Ambery
//Assignment: Gas Mileage: Chapter 5 Question 18
//Date: 1 October 2019

// This program prompts the user to enter miles traveled and
// gas spent and calculates the car's gas mileage

import java.util.Scanner;

public class GasMileage
{
  public static double gasMileage(int miles, double mpg)
  {
    return miles/mpg;
  }
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Miles traveled: ");
    int miles = input.nextInt();
    System.out.print("Miles per Gallon of Vehicle: ");
    double mpg = input.nextDouble();
    
    input.close();
    
    double gallons = gasMileage(miles, mpg);
    
    System.out.printf("Your car used up %.1f gallons of gas\n", gallons);
  }
}
