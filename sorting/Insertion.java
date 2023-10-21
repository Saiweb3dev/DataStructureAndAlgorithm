package sorting;

public class Insertion {
  public static void main(String[] args) {
    System.out.println("Insertion Sorting");
    int arr[] = { 1, 3, 0, 5, 12, 2, 4, 7 };
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int j = i;
      // reverse check array
      while (j > 0 && arr[j - 1] > arr[j]) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        // check back value also
        j--;
      }
    }
    // printing the value
    System.out.print("[");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " , ");
    }
    System.out.print("]");
  }
}
