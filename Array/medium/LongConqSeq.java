package medium;
import java.util.*;
//longest consecutive sequence
public class LongConqSeq {
  public static void main(String[] args) {
    System.out.println("Longest consecutive sequence");
    int arr[] = {1,200,100,2,3,500,4,5,600};
    int n = arr.length;
    Arrays.sort(arr);
    int longestSeq = 0;
    int lastVal = Integer.MIN_VALUE;
    int count = 0;
    for(int num : arr)
    {
      if(num-1 == lastVal) count+=1;
      else if(num == lastVal) count+=0;
      else count = 1;
      lastVal = num;
      longestSeq = Math.max(longestSeq,count);
    }
    System.out.println("Longest Sequence is "+longestSeq);
  }
}
