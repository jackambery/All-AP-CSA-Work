//Name: Jack Ambery
//Assignment: Snow Day C Classwork
//19 March 2020

public class SnowDayC {

   public static int mystery1 (int x, int y) {
      if (x < y) {
         return x;
      }
      else {
         return mystery1(x - y, y);
      }
   }
   
   //#17
   public static void mystery6(int x, int y) {
      if (y == 1) {
         System.out.print(x);
      }
      else {
         System.out.print(x * y + ", ");
         mystery6(x, y - 1);
         System.out.print(", " + x * y);
      }
   }
   
   public static void main(String[] args) {
      System.out.printf(" (%d, %d) gives %d\n", 6, 13, mystery1(6, 13));
      System.out.printf(" (%d, %d) gives %d\n", 8, 2, mystery1(8, 2));
      System.out.printf(" (%d, %d) gives %d\n", 14, 10, mystery1(14, 10));
      mystery6(8, 2);
   }
}