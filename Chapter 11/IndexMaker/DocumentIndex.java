//Name: Jack Ambery
//Assignment: DocumentIndex from IndexMaker Lab
//Date: 23 February 2020

public class DocumentIndex extends ArrayList<IndexEntry> {
   
   //-----Constructors-----
   
   public DocumentIndex() {
      super();
   }
   
   public DocumentIndex(int size) {
      super(size);
   }
   
   //-----Methods-----
   
   private int foundOrInserted(String word) {
   
      IndexEntry temp = new IndexEntry(word); //Instantiates IndexEntry with word
      
      for(IndexEntry element : IndexEntry) {
      
         if(element == get(indexOf(element))) {
            return 0;
         }
      
         if(word.compareTo(element.getWord()) > 0) {
            add(indexOf(element) - 1, temp);
            return indexOf(element) - 1;
         }
      }
      return -1;
   }
   
   public void addWord(String word, int num) {
      IndexEntry.add(num);   
   }
}