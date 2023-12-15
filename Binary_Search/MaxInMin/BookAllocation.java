package Binary_Search.MaxInMin;

public class BookAllocation {
  
  static int calculateMinimumStudents(int[] books, int maxPages, int totalBooks, int totalStudents) {
    int currentStudentCount = 1;
    int currentStudentPages = 0;
    
    for(int i = 0; i < totalBooks; i++) {
      if(currentStudentPages + books[i] <= maxPages) {
        currentStudentPages += books[i];
      } else {
        currentStudentCount++;
        currentStudentPages = books[i];
        if(currentStudentCount > totalStudents) return currentStudentCount;
      }
    }
    return currentStudentCount;
  }
  
  public static void main(String[] args) {
    int[] books = {12, 34, 67, 90};
    int totalBooks = books.length;
    int totalStudents = 2;
    
    int totalPages = 0;
    int maxPagesInBook = Integer.MIN_VALUE;
    
    for(int i = 0; i < totalBooks; i++) {
      totalPages += books[i];
      maxPagesInBook = Math.max(maxPagesInBook, books[i]);
    }
    
    int left = maxPagesInBook, right = totalPages;
    
    while(left <= right) {
      int mid = (left + right) / 2;
      int studentsRequired = calculateMinimumStudents(books, mid, totalBooks, totalStudents);
      
      if(studentsRequired > totalStudents) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    
    System.out.println("The maximum number of pages a student can have is " + left);
  }
}
