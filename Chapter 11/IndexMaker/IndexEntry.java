//Name: Jack Ambery
//Assignment: IndexEntry from IndexMaker Lab
//Date: 23 February 2020

import java.util.ArrayList;

public class IndexEntry {
   
   //-----Fields-----
   private String word;
   private ArrayList<Integer> numsList;
   
   //-----Constructors-----
   public IndexEntry(String a) {
      a.toUpperCase();
      word = a;
      numsList = new ArrayList<Integer>();
   }
   
   //-----Methods-----
   public void add(int num) {
      if (! (numsList.contains(num))) {
         numsList.add(num);
      }
   }
   
   public String getWord() {
      return word;
   }
   
   public String toString() {
      return word + " " + numsList;
   }
}