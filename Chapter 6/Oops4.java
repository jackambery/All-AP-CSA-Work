public class Oops4 {
   
   public static void main(String[] args) {
      int a = 7;
      int b = 42;
      int smaller;
      minimum(a, b);
         if (a == minimum(7, 42)) {
            System.out.println("a is the smallest!");
      }
}

   public static int minimum(int a, int b) {
      int smaller = b;
      if (a < b) {
         smaller = a;
         }
         else if (a >= b) {
            smaller = b;
         }
      return smaller;
   }
}