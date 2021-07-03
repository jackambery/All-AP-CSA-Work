//Author: Jack Ambery
//Assignment: Chapter 8 Exercises
//Date: 21 November 2019

public class StringPractice {

/*
2a - endsWithStar (String s)
2b - endsWith2Stars (String s)
3 - removeDashes (String s)
4b - modifyDate (String dateStr)
5b - lastFive (String ccNumber)
6 - scroll (String s)
7 - convertName (String s)
11 - cutOut(String s, String remove)
13 - startsWith (String s, String sub) and endsWith (String s, String sub)
15 - onlyDigits (String s)
16 - numCompareTo (String s1, String s2)
*/

//#2a
   public boolean endsWithStar (String s) {
      
      String s = kb.nextString();
      char last = s.charAt(s.length());
      
      if (last == '*') {
         return true;
      }
      else {
         return false;
      }
   }

//#2b
   public boolean endsWithTwoStars (String s) {
      
      String s = kb.nextString();
      char last = s.charAt(s.length());
      char secLast = s.charAt(s.length() - 1);
      int total = s.length();
      
      if (last == '*' && secLast == '*' && s.length >= 2) {
         return true;
      }
      else {
         return false;
      }
   }

//#3
   public String removeDashes(String s) {
      
      s = s.replace("-","");
      
      System.out.println(s);

   }
   
//#4b
   public String modifyDate(String dateStr) {
   
      dateStr = dateStr.replace("/", "-");
      
      //indecies of dashes
      int firstDash = dateStr.indexOf("-");
      int secondDash = dateStr.indexOf("-", firstDash + 1);
      
      //substrings for day, month, year
      String day = dateStr.subString(0, firstDash);
      String month = dateStr.subString(firstDash + 1, secondDash);
      String year = dateStr.subString(secondDash + 1); 
      
      //must convert each part date to integers
      int dayInt = Integer.parseInt(day);
      int monthInt = Integer.parseInt(month);
      int yearInt = Integer.parseInt(year);
   
      dateStr = String.format("%02d-%02d-%d", day, month, year);
   
      return dateStr;
   
   }
   
//#5b
   public String lastFive(String ccNumber) {
      
      //removes spaces
      ccNumber = ccNumber.replace(" ", "");
      
      int length = ccNumber.length(); 
      //ensures valid length (enough numbers to have a last 5 digits)
      if(length < 5 || length > 16) {
         return ccNumber;
      }
      
      length -= 5;
      //finds the last five digits
      String answ = ccNumber.subString(length);
      
      return answ; 
   }  
   
//#6
   public String scroll(String s) {
      
      //substring for first letter/character
      String firstChar = s.substring(0,1);
      //gets rid of firstChar
      s = s.replace(firstChar, "");
      //concatinates firstChar to s
      s += firstChar;
      
   return s;  
   
   }
   
//#7
   public String convertName(String s) {
   
      //index of comma
      int commaPos = s.indexOf(",");
   
      String lastname = s.substring(0, commPos);
      String firstname = s.substring(commaPos + 2);
      String fullName = firstname + " " + lastname;
   
   return fullName;
   
   }
   
//#11
   public String cutOut(String s, String remove) {
      
      //length of remove
      int removeLength = remove.length();
      
      //index of remove in s
      int removeIndex = s.indexOf(remove);
      
      //substring = beginning to first occurance of remove
      String beginning = s.substring(0, removeLength + removeIndex);
      
      //substring = part after remove
      String end = s.substring(removeLength + removeIndex);
      
      //position of remove in s
      String removeSub = s.substring(removeIndex , removeLength + removeIndex);
      
      //changes remove to "", empty string
      s = s.replace(removeSub, "");
      
      //s is now without remove
      s = beginning + end;
      
      return s;
      
      //return false if remove isn't in s or if remove is larger
      if( !(s.contains(remove)) || (remove.length() > s.length()) ) {
         return s;
      }
      
   }

//#13
   public startsWith(String s, Sring sub) {
      
      //returns false if string is empty or sub is longer than s
      if(s.isEmpty() || sub.length() > s.length()) {
         return false;
      }
      
      //length of sub
      int subLength = sub.length();
      
      //substring = 0 to sub
      String beginning = s.substring(0, subLength);
      
      //returns true if beginning equals sub
      if(prefix.equals(sub)) {
         return true;
      } 
      
      //sub != beginning
      else {
      return false;
      }
   
   }
   
   public endsWith(String s, String sub) {
      if(s.isEmpty()) //if string is empty returns false
      {
         return false;
      }
      if(sub.length() > s.length()) //if sub's length is greater than s's length returns false
      {
         return false;
      }
      int i = s.length();  //gets length of string s
      int k = sub.length(); //gets length of string sub
      int m = i-k;   //gets index of start of suffix
      s = s.substring(m);  //s becomes its suffix
      if(s.equals(sub)) //checks if the suffix is equal to string sub
      {
         return true;   //returns true if it is the same
      }
      return false;  //returns false otherwise
   
   }
  
//#15
   public boolean onlyDigits(String s) {
   
      String nums = "[0-9]";   
      //returns true if string only has numbers using matches method
      if (s.matches(nums)) {
         return true;
      }
      
      //returns false if not all numbers
      else {
      return false;
      }
   }
   
   }

//#16
   public boolean numCompareTo(String s1, String s2) {
      
      //turns String s1 into Integer n1
      int n1 = Integer.parseInt(s1);
      //turns String s2 into Integer n2
      int n2 = Integer.parseInt(s2);
      
      //Math.signum returns -1.0, 0, or 1.0 depending on the sign
      if(Math.signum(s1.compareTo(s2)) == Math.signum(n1-n2)) {
         return true;
      }
      //if not equal
      else {
         return false;
      }
   }   
   
}//end