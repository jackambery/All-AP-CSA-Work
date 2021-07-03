import java.lang.reflect.Method;

public class TestStrings {

// FIELDS
   final static boolean DEBUG = false; // If you want detailed score information, set this to true
   
   final static float PROBLEMSCORE = 10;

   static String emptyString, nullString, oneStar, twoStars, threeStars;
   static String everyOtherStar, everyOtherStar2, noStar;
   static String mySSN, yourSSN, myDate, yourDate, myCC, yourLast5,  myScroll, yourScroll;
   static String myName, yourName, myName2, yourName2, myCutOut, yourCutout, yourCutout2, yourCutout3;
   static String myStartsWith, yourSWa, yourSWb, yourSWc, myEndsWith, yourEWa, yourEWb, yourEWc, yourEWd;
   static String myOnlyDigits, myOnlyDigitsb, myNumA, myNumB, myNumC;
   
   static float totalScore;
   static int problems;
   static int problem;
         
   static StringPractice SP;
  
   static void initialize() {
      emptyString = "";
      oneStar = "*";
      twoStars = "**";
      threeStars = "***";
      everyOtherStar = "Hello *";
      everyOtherStar2 = "Hello * * ";
      noStar = "Hello";
   
      mySSN = "123-456-7890";
      yourSSN = "1234567890";
   
      myDate = "12/25/1929";
      yourDate = "25-12-1929";
   
      myCC = "3300 9302 4837 5621";
      yourLast5 = "75621";
   
      myScroll = "Alphabet";
      yourScroll = "lphabetA";
   
      myName = "Clause, Santa";
      yourName = "Santa Clause";
   
      myName2 = "Morton, Jr., Ricky";
      yourName2 = "Ricky Morton, Jr.";
   
      myCutOut = "It is a keyboard";
      yourCutout = " is a keyboard";
      yourCutout2 = "Ita keyboard";
      yourCutout3 = "It is a keyboa";
   
      myStartsWith = "Hello";
      yourSWa ="Hel";
      yourSWb = "H";
      yourSWc = "Hec";
   
      myEndsWith = "Hello";
      yourEWa = "llo";
      yourEWb = "o";
      yourEWc = "Hello";
      yourEWd = "ellc";
   
      myOnlyDigits = "123j123";
      myOnlyDigitsb = "83247081234";
   
      myNumA = "965";
      myNumB = "965";
      myNumC = "9012";
   
      totalScore = 0;
      problems = 4;
   
      problem=1;
         
      SP = new StringPractice();
   }
   
   private static void debug(double score) {
      if (DEBUG)
         SOP(String.format("\t Score: %1.1f\n",score));
   }
      
   private static float testEndsWithStar() {
      float score = 0; problems = 4;
      if (DEBUG) SOP(String.format(" - %d problems\n",problems));
      if (! SP.endsWithStar (emptyString)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.endsWithStar (oneStar)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.endsWithStar (twoStars)) score += PROBLEMSCORE / problems;
      debug(score);
      if (! SP.endsWithStar (noStar)) score += PROBLEMSCORE / problems;
      debug(score);
      return score;
   }
   
   private static float testEndsWith2Stars() {
      float score = 0; problems = 5;
      if (DEBUG) SOP(String.format(" - %d problems\n",problems));
      debug(score);
      if (! SP.endsWith2Stars (emptyString)) score += PROBLEMSCORE / problems;
      debug(score);
      if (! SP.endsWith2Stars (oneStar)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.endsWith2Stars (twoStars)) score += PROBLEMSCORE / problems;
      debug(score);
      if (!SP.endsWith2Stars (everyOtherStar2)) score += PROBLEMSCORE / problems;
      debug(score);
      if (!SP.endsWith2Stars (noStar)) score += PROBLEMSCORE / problems;
      debug(score);
      return score;
   }

   private static float testRemoveDashes() {
      float score = 0; problems = 4;
      if (DEBUG) SOP(String.format(" - %d problems\n",problems));
      if (SP.removeDashes(mySSN).equals(yourSSN)) score += PROBLEMSCORE / problems;
      debug(score);
      if (!SP.removeDashes(mySSN).equals(mySSN)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.removeDashes(emptyString).equals(emptyString)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.removeDashes(mySSN).equals(yourSSN)) score += PROBLEMSCORE / problems;   
      debug(score);
      return score;
   }
       
   private static float testModifyDate() {
      float score = 0; problems = 2;  
      if (DEBUG) SOP(String.format(" - %d problems\n",problems));
      if (SP.modifyDate(myDate).equals(yourDate)) score += PROBLEMSCORE / problems;
      debug(score);
      if (!SP.modifyDate(myDate).equals(myDate)) score += PROBLEMSCORE / problems;   
      debug(score);
      return score;
   }
      
   private static float testLast5() {
      float score = 0; problems = 3;
      if (DEBUG) SOP(String.format(" - %d problems\n",problems)); 
      if (SP.lastFive(myCC).equals(yourLast5)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.lastFive(oneStar).equals(oneStar)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.lastFive(mySSN).equals("67890")) score += PROBLEMSCORE / problems;
      debug(score);
      return score;
   }

   private static float testScroll() {
      float score = 0; problems = 2;
      if (DEBUG) SOP(String.format(" - %d problems\n",problems));
      if (SP.scroll(myScroll).equals(yourScroll)) score += PROBLEMSCORE / problems;
      debug(score);
      if (!SP.scroll(myName).equals(myName)) score += PROBLEMSCORE / problems;
      debug(score);
      return score;
   }

   private static float testConvertName() {
      float score = 0; problems = 2;   
      if (DEBUG) SOP(String.format(" - %d problems\n",problems));
      if (SP.convertName(myName).equals(yourName)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.convertName(myName2).equals(yourName2)) score += PROBLEMSCORE / problems;
      debug(score);
      return score;
   }
      
   private static float testMyCutout() {
      float score = 0; problems = 4;   
      if (DEBUG) SOP(String.format(" - %d problems\n",problems));
      if (SP.cutOut(myCutOut,"It").equals(yourCutout)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.cutOut(myCutOut," is ").equals(yourCutout2)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.cutOut(myCutOut,"rd").equals(yourCutout3)) score += PROBLEMSCORE / problems;
      debug(score);
      if (!SP.cutOut(myCutOut,"zel").equals(yourCutout)) score += PROBLEMSCORE / problems;
      debug(score);
      return score;
   }
      
   private static float testStartsWith() {
      float score = 0; problems = 5;
      if (DEBUG) SOP(String.format(" - %d problems\n",problems));      
      if (SP.startsWith(myStartsWith, yourSWa)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.startsWith(myStartsWith, yourSWb)) score += PROBLEMSCORE / problems;
      debug(score);
      if (!SP.startsWith(myStartsWith, yourSWc)) score += PROBLEMSCORE / problems;
      debug(score);
      if (!SP.startsWith(myStartsWith, emptyString)) score += PROBLEMSCORE / problems;
      debug(score);
      if (!SP.startsWith(emptyString, myStartsWith)) score += PROBLEMSCORE / problems;
      debug(score);
      return score;
   }
      
   private static float testEndsWith() {
      float score = 0; problems = 5;
      if (DEBUG) SOP(String.format(" - %d problems\n",problems));
      if (SP.endsWith(myEndsWith, yourEWa)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.endsWith(myEndsWith, yourEWb)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.endsWith(myEndsWith, yourEWc)) score += PROBLEMSCORE / problems;
      debug(score);
      if (!SP.endsWith(myEndsWith, yourEWd)) score += PROBLEMSCORE / problems;
      debug(score);
      if (!SP.endsWith(emptyString, yourEWd)) score += PROBLEMSCORE / problems;
      debug(score);
      return score;
   }
      
   private static float testOnlyDigits() {
      float score = 0; problems = 2;
      if (DEBUG) SOP(String.format(" - %d problems\n",problems));
      if (!SP.onlyDigits(myOnlyDigits)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.onlyDigits(myOnlyDigitsb)) score += PROBLEMSCORE / problems;
      debug(score);
      return score;
   }

   private static float testNumCompareTo() {
      float score = 0; problems = 5;
      if (DEBUG) SOP(String.format(" - %d problems\n",problems));
      if (!SP.numCompareTo(myNumA,myNumC)) score += PROBLEMSCORE / problems;
      debug(score);
      if (!SP.numCompareTo(myNumC,myNumA)) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.numCompareTo("987654","5")) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.numCompareTo("5","987654")) score += PROBLEMSCORE / problems;
      debug(score);
      if (SP.numCompareTo(myNumA,myNumB)) score += PROBLEMSCORE / problems;
      debug(score);
      return score;
   }

   public static void runTests() {
      float score = 0;
      SOP("\nStrings Test ... each method is worth 10 points ... \n\n");
      SOP ("Prob\t#Tests\tScore\t\tTotal\tMethod\n");  
      try { // Get an array of all the methods in this class
         Method[] methods = TestStrings.class.getDeclaredMethods();
         for (int m =0; m < methods.length; m++) {
            String method = methods[m].getName();
            switch (method) {  // SKIP THE FIRST METHODS
               case "main" :
               case "debug" :
               case "initialize" :
               case "SOP" :  
               case "runTests" : 
                  break;
               default :
                  try {
                     if (DEBUG)
                        SOP(String.format("\n%2d. %s", problem, method));
                     score =  Math.round((float) methods[m].invoke(methods[m]));
                     totalScore += score;
                     SOP(String.format ("%2d.\t\t%d\t\t%4.1f\t\t%5.1f\t%s\n",
                                                      problem++, problems, score, totalScore,method));  
                  }
                  catch (NullPointerException e) { SOP("NPE in " + method + "\n"); }
                  catch (IndexOutOfBoundsException e) {SOP("IOB in " + method + "\n");}
                  catch (Exception e) { SOP("Exception in " + method + "\n"); e.printStackTrace();}
                  break;           
            }
         }
      } catch (Exception e) { e.printStackTrace();}
   }

   public static void main (String[] args) {
      initialize();
      runTests();
      SOP(String.format("\nTotal Score: %2.1f out of %d: %.1f%%\n", 
                           totalScore, --problem * Math.round(PROBLEMSCORE), 
                           totalScore / problem * PROBLEMSCORE));
   }
   
   public static void SOP (String s) { System.out.print(s); }

}