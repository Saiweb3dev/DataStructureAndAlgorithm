package sorting;

import java.util.ArrayList;

//dividing and merging the array
public class Merge {
  static void merge(int arr[], int low, int mid, int high) {
    // creating a temp array for storing the sorted value
    ArrayList<Integer> temp = new ArrayList<>();
    // creating 2 pointer for both array
    // pointer for left array
    int left = low;
    // pointer for right array
    int right = mid + 1;
    // looping with the condition of running until a array gets empty
    while (left <= mid && right <= high) {
      if (arr[left] < arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }
    // it is for the unfinished array
    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }
    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }
    // adding the sorted array to main array
    int n = high - low + 1;
    for (int i = 0; i < n; i++) {
      arr[i + low] = temp.get(i);
    }
  }

  static void Ms(int arr[], int low, int high) {
    // base condition ,like the final value is divided
    if (low == high)
      return;
    int mid = (low + high) / 2;
    // dividing the array into two parts
    // function left
    Ms(arr, low, mid);
    // function right
    Ms(arr, mid + 1, high);
    // merging the divided array in sorted order
    merge(arr, low, mid, high);
   
  }

  public static void main(String[] args) {
    System.out.println("Merge sorting");
    int arr[] = { 1, 3, 5, 4, 2, 6 };
    int n = arr.length;
    int low = 0;
    int high = n - 1;
    Ms(arr, low, high);
    // printing the sorted array
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]);
    }
  }
}
