package medium;
//Longest Sub Array with k sum
//solved using sliding window approach
public class LongSubArr {
  public static void main(String[] args) {
    System.out.println("Longest Sub Array");
    int arr[] = {1,2,3,1,1,1,1};
    int k = 3;
    int n = arr.length;
    int left = 0, right = 0;
    int maxi = Integer.MIN_VALUE;
    int sum = arr[0];
    while(right<n)
    {
      while(sum > k)
      {
      sum -= arr[left];
      left++;
      }
      if(sum == k) maxi = Math.max(maxi, right-left+1);
      right++;
      if(right<n)
      {
        sum += arr[right];
      }
    }
    System.out.println("The Longest SubArray is "+maxi);
  }
}
