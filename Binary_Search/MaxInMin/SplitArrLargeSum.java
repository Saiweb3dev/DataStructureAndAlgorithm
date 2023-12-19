package Binary_Search.MaxInMin;

//Split Array Largest Sum
public class SplitArrLargeSum {
  public static boolean isSubArrayCountExceedsK(int[] numbers, int k, int mid, int arrayLength) {
    int subArrayCount = 1;
    int subArraySum = 0;
    for (int number : numbers) {
      if (subArraySum + number <= mid) {
        subArraySum += number;
      } else {
        subArrayCount++;
        subArraySum = number;
        if (subArrayCount > k)
          return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println("Large Array Sum");
    int numbers[] = { 7, 2, 5, 10, 8 };
    int k = 2;
    int totalSum = 0;
    int maxNumber = Integer.MIN_VALUE;
    int arrayLength = numbers.length;
    for (int number : numbers) {
      totalSum += number;
      maxNumber = Math.max(maxNumber, number);
    }
    int left = maxNumber, right = totalSum;
    while (left <= right) {
      int mid = (left + right) / 2;
      boolean isExceedsK = isSubArrayCountExceedsK(numbers, k, mid, arrayLength);
      if (isExceedsK)
        left = mid + 1;
      else
        right = mid - 1;
    }
    System.out.print(left);
  }
}
