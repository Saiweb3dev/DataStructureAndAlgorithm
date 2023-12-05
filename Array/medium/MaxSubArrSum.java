package medium;

public class MaxSubArrSum {
  public static void main(String[] args) {
    System.out.println("Maximum sub array sum");
    int arr[] = {1,-1,2,4,-4,-2,5};
    int max = 0;
    int sum = 0;
    for(int num : arr)
    {
      sum += num;
      if(sum > max) max = sum;
      if(sum < 0) sum = 0;
    }
    System.out.println("The maximum is "+max);
  }
}
