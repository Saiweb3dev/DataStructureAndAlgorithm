package Binary_Search.MaxInMin;
import java.util.*; 
//need to find the maximum distance between minimum cows
public class AggressiveCows {
  static boolean possible(int stalls[],int dist , int cows,int n)
  {
    int currCow = 1;
    int last = stalls[0];
   for(int i=1;i<n;i++)
   {
    if(stalls[i] - last >= dist)
    {
      currCow+=1;
      last = stalls[i];
    }
    if(currCow >= cows) return true;
   }
    return false;
  }
  public static void main(String[] args) {
    System.out.println("Aggressive cows");
    int stalls[] = {4 ,2 ,1 ,3 ,6};
    int n = stalls.length;
    int cows = 2;
    Arrays.sort(stalls);
    int left = 1, right = stalls[n-1];
    while(left<=right)
    {
      int mid = (left+right)/2;
      if(possible(stalls,mid,cows,n) == true) left = mid+1;
      else right = mid - 1;
    }

    System.out.println("The distance is "+ right);
  }
}
