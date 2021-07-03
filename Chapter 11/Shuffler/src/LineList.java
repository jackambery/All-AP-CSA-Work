//Author: Jack Ambery
//Assignment: Ch. 11 Lab Shuffler
//Date: 14 February 2020 <3

import java.util.ArrayList;

public class LineList {

   //---------- Fields ------------
   
   private ArrayList<String> list;
   
   //------------ Constructors --------------
   
   public LineList() { 
      this.list = new ArrayList();
   }
   
   //------------- Methods ----------------
   
   public int size() {
      return list.size();
   }
   
   public String get(int k) {
      return list.get(k);
   }
   
   public void add(String line) {
      list.add(line);
   }
   
   public String remove(int k) {
      return list.remove(k);
   }
   
   public void move(int index, int newIndex) {
      String temp = list.get(index);
      list.add(newIndex, temp);
      list.remove(index);
   }
   
   public void shuffle() {
   
      int n = list.size() - 1;
      
      while (n >= 2) {
         int random = (int)(Math.random() * n);
         move(random, n);
         move(n, random);
      }
   }  
   
   public String toString() {
      return "" + list;
   }
}