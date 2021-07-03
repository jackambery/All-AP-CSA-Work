//Author: Jack Ambery
//Assignment: Test Class for LineList
//Date: 23 February 2020

//This class is a copy of my original LineList except modified to use a test class main method to make sure it works outside shuffler

import java.util.ArrayList;

public class LineListTest extends LineList {
   
   //---------- Test -----------
   public static void main(String[] args) {
            
      LineList people = new LineList();
      people.add("amy");
      people.add("jacob");
      people.add("jack");
      people.add("emily");
      people.add("joe");
         
      System.out.println("Original ArrayList: " + people);
      System.out.println("Size Method: " + people.size());
      System.out.println("Get Method at 2: " + people.get(2));
      
      people.add("john");
      System.out.println("Add Method: " + people);
      
      people.remove(1);
      System.out.println("Remove Method at 1: " + people);
      
      people.move(3, 1);
      System.out.println("Move Method from position 0 to 1: " + people);
      
      people.shuffle();
      System.out.println("Shuffle Method: " + people);
   
   }
  
}