public class SmallestPositiveInteger {
   public static void main (String[] args) {
      int k = 1;
      while (((int) (k * 0.01 * 100)) == k) {
         k++;      
      }
   System.out.println(k);
   }
}