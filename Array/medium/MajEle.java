package medium;
//Boyer-Moore Voting Algorithm.
// it only works on array which has n/2 majority element
public class MajEle {
  public static void main(String[] args) {
    System.out.println("Majority Element in Array");
    int arr[] = {1,1,3,1,5,1,7,1,9,1,1,12};
    int count = 0;
    Integer value = null;
    for(int num : arr)
    {
     if(count == 0)
     {
      value = num;
     }
     count += (num == value) ? 1 : -1;
    }
    System.out.println("Majority Element is "+value);
  }
}
