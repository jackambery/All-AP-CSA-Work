//Author: Jack Ambery
//Assignment: For Each Sums Ch. 9 Ex.18 a and b
//Date: 13 January 2020

public class ForEachSums {

   public static int sum(int[] ints) { //Ex. 18a
   
      int sum = 0;
      
      for (int num : ints) { //for each num in ints
         sum += num; //sum of all ints in ints[]
      }
      
      return sum;
   }
   
   public static int[] sumOfKthRows(int[][] t) { //Ex. 18b
   
      int[] sums = new int[t.length];
      
      for (int i = 0; i < t.length; i++) {
         sums[i] = sum(t[i]); //sums of i becomes the sum method of that row
      }
      
      return sums;
   }
   
   public static void main(String[] args) {
      int[][] t = {{1, 1, 1, 1},
                  {2, 4, 6, 8},
                  {10, 20, 30, 40},
                  {-100, 50, -25, -5}};
      
     for (int i = 0; i < t.length; i++) {
        System.out.println(sumOfKthRows(t)[i]);
     }
   }
   
}