//Author: Jack Ambery
//Program: Book
//Date: 11 September 2019


public class Book {
   
   //Fields
   int numPages;
   int currentPage;
   
   //Constructor
   Book(int n) {
      currentPage = 1;
      this.numPages = n;
   }
      
   //Methods
   public int getNumPages() {
      return numPages;
   }
      
   public int getCurrentPage() {
      return currentPage;
   }
      
   public int nextPage() {
      if (currentPage < numPages)
         currentPage++;
      return currentPage;
   }
   
   
}