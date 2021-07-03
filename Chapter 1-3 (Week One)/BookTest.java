//Author: Jack Ambery
//Program: BookTest
//Date: 16 September 2019

public class BookTest
{
   public static void main(String[] args) {
   
      //Book object with 3 pages
      Book userBook = new Book(3);
      
      //Print Page Numbers
      System.out.println("The current page number is:" + userBook.nextPage());
      System.out.println("The current page number is:" + userBook.nextPage());
      System.out.println("The current page number is:" + userBook.nextPage());
   }
}
