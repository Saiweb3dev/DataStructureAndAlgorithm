package Binary_Search;

//finding a unique element in a sorted array
//tip is finding the pair arrangement and moving according to it ,even odd for right and odd even for left
public class UnqInSortArr {
  public static void main(String[] args) {
    System.out.println("Single Element in a Sorted Array");
    int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
    int n = arr.length;
    if (n == 0) {
      System.out.println("No element");
    }
    if (n == 1) {
      System.out.println(arr[0]);
    }
    if (arr[0] != arr[1]) {
      System.out.println(arr[0]);
    }
    if (arr[n - 1] != arr[n - 2]) {
      System.out.println(arr[n - 1]);
    }
    // starting one step forward for avoiding out of bound prob
    int low = 1, high = n - 2;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
        System.out.println("The unique element is " + arr[mid]);
        break;
      } else if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 >= 1 && arr[mid] == arr[mid - 1])) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

  }
}
