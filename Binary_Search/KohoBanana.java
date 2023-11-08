package Binary_Search;
//Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.To find the minimum banana to eat before guard come
//important
import java.util.*;
public class KohoBanana {
  static int MaxBananaInPiles(int piles[],int n)
  {
    int Max = Integer.MIN_VALUE;
   for(int pile : piles)
   {
    Max = Math.max(Max,pile);
   }
    return Max;
  }
  static int totalHrsToCompletePile(int piles[],int n,int B)
  {
    int totalHr = 0;
    for(int pile : piles)
    {
      totalHr += Math.ceil((double)(pile)/(double)(B));
    }
    return totalHr;
  }
  public static void main(String[] args) {
    System.out.println("Eating banana before guard comes");
    int piles[] = {3,6,7,11};
    int n = piles.length;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the time that the guard will come");
    int h = scan.nextInt();
    int low=1;
    int high = MaxBananaInPiles(piles,n);
    int MinBananaPerPile = 1;
    while(low<=high)
    {
      int mid = (low+high)/2;
      int totalHr = totalHrsToCompletePile(piles,n,mid);
      if(totalHr <= h)
      {
        MinBananaPerPile = mid;
        high = mid - 1;
      }
      else low = mid +1;
    }
    System.out.println("The Slowest time to eat all banana in the piles before the guard arrives is "+MinBananaPerPile);
  }
}
