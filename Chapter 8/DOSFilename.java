//Author: Jack Ambery
//Assignment: DOS FILE pg. 232 Ex. 17
//Date: 24 November 2019

public class DOSFilename {

   //A vaild file name must be no more than 8 characters, have an extension no more than 3, and not contain .:\?*   
   public static String validFileName(String fileName) {
   
      //substring for name of file (before the period)
      String title = fileName.substring(0,fileName.indexOf("."));
      //substring for extention (after period)
      String extension = fileName.substring(fileName.indexOf(".") + 1);
   
      //fileName can not contain ., :, \, ?, * also extention can not be more than 3
      if (extension.length() > 3 || fileName.contains("..") || fileName.contains(":") || fileName.contains("\\") || fileName.contains("?") || fileName.contains("*")) {
         return null;
      }
      
      //for a title that has correct length already for title and extension
      //extension can not be blank
      if (title.length() <= 8 && extension.length() <= 3 && !(extension.equals(""))) {
         //only has to convert fileName to uppercase
         fileName = fileName.toUpperCase();
         return fileName;
      }
      
      //if extension is blank, this removes the period and capitalizes title (for test #4)
      if (extension.equals("")) {
         fileName = fileName.replace(".", "");
         fileName = fileName.toUpperCase();
         return fileName;
      }
   
   //if input does not fall in either method, it is not valid        
   return null;
         
   }
}