package Array;

public class MissNo {
  public static void main(String[] args) {
    System.out.println("Missing number in Array");
    int arr[] = {0,2,1};
    int n = arr.length;
    
    int sum = n*(n+1)/2;
    int total = 0;
    for(int val : arr)
    {
      total+=val;
    }
    int MissNo = sum-total;
    System.out.println("The missing number is "+MissNo); 
    
  }
}
