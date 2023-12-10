package easy;

public class MaxCon {
  public static void main(String[] args) {
    System.out.println("Maximum Consecutive of 1");
    int arr[] = {0,1,1,1,0,1,1,0,1};
    
    int count = 0;
    int max = 0;
    for(int num : arr)
    {
      if(num == 1)
      {
        count++;
        max = Math.max(max,count);
      }
      else if(num == 0) count = 0;
    }
    System.out.println("The maximum consecutive of 1 is "+max);
  }
}
