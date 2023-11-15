package Binary_Search;
public class KthMissNum
{
  public static void main(String[] args) {
    System.out.println("Finding the missing number");
    int arr[] = {1,2,3,4,5,7,8};
    int n = arr.length;
    int k = 1;
    int low = 0,high = n-1;
    while(low<=high)
    {
      int mid = (low+high)/2;
      //checking the value is in its crt index number
      int missing = arr[mid] - (mid+1);
      if(missing<k) low = mid + 1;
      else high = mid - 1;
    }
    //printing the index + k for the actual value
    System.out.println(low+k);
  }
}