public class DOSTest {
final static int VALUE = 5;
   public static int scoreTest(String test, String expectedResult) {
   
      int partsValue = VALUE;
      
      // TO USE THIS TESTER - you must have your class named DOSFilename and your method public and named validFileName
      
      String actualResult = DOSFilename.validFileName(test);
      String printResult  = "";
      
      if (actualResult == null){  
        if (expectedResult == null)
          printResult = "PASS";
        else
          printResult = "FAIL";
        if (expectedResult == null) expectedResult = "Null";
        if (actualResult == null) actualResult = "Null";
      }
      else   
       if (actualResult.equals(expectedResult)) 
         printResult = "PASS";       
      else 
        printResult = "FAIL"; 
      
      System.out.printf("Testing: %s, Expecting: %s, Actual: %s  %s\n",test,expectedResult, actualResult,printResult);
   
      if (printResult.equals("PASS"))
         return partsValue;
      else 
         return 0;
       
   }

   public static void main(String[] args) {
   
      int score = 0;
      int numTestsRun = 0;
      score += scoreTest("one.txt","ONE.TXT");  numTestsRun++;
      score += scoreTest("two.tx","TWO.TX");   numTestsRun++;
      score += scoreTest("three.t","THREE.T");  numTestsRun++;
      score += scoreTest("four.","FOUR");  numTestsRun++;
      score += scoreTest("fiv:e.txt",null);  numTestsRun++;
      score += scoreTest("si\\x.txt",null);  numTestsRun++;
      score += scoreTest("seve*n.txt",null);  numTestsRun++;
      score += scoreTest("?eight.txt",null);  numTestsRun++;
      score += scoreTest("nine.?tx",null);  numTestsRun++;
      score += scoreTest("ten.*xt",null);  numTestsRun++;
      score += scoreTest("eleven.t:f",null);  numTestsRun++;
      score += scoreTest("twelve.t\\f",null);  numTestsRun++;
      score += scoreTest("thirteen..if",null);  numTestsRun++;
      score += scoreTest("fourteen....",null);  numTestsRun++;
      score += scoreTest("fifteen.tx","FIFTEEN.TX");  numTestsRun++;
      score += scoreTest("sixteen.t","SIXTEEN.T");  numTestsRun++;
      score += scoreTest("sevent.txta",null);  numTestsRun++;
      score += scoreTest("eighteens.txt",null);  numTestsRun++;
      
      System.out.printf("Score: %d / %d\n",score,numTestsRun*VALUE);
   }
}