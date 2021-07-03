public class ExerciseTest {

   public static void main(String[] args) {
   
   String dateStr = "2/4/19";  
      
      //int firstSlash = s.index("//");
      //int secondSlash = s.index(firstSlash + 1)      
   
   dateStr = dateStr.replace("/", "-");
   
   int num1 = dateStr.charAt(0);
   dateStr = dateStr.format("%d", num1);
   
   System.out.println(dateStr);

   }
}