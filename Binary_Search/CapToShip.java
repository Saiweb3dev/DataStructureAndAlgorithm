package Binary_Search;
//the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days
public class CapToShip {
  static int shipCap(int weights[],int cap , int day,int n)
    {
        int days = 1;
        int load = 0;
        for(int i=0;i<n;i++)
        {
            if(weights[i] > cap) {
                return day + 1;
            }
            if(load + weights[i] > cap)
            {
             days += 1;
             load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }

  public static void main(String[] args) {
    int weights[] = {5, 4, 5, 2, 3, 4, 5, 6};
    int d = 5;//days
    int min = Integer.MAX_VALUE;
        int max = 0;
        int n = weights.length;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,weights[i]);
            max += weights[i];
        }
        int low = min,high=max;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int totalDays = shipCap(weights,mid,d,n);
            if(totalDays <= d)
            {
                high = mid -1;
            }
            else low = mid +1;
        }
        System.out.println("Minimum Capacity of ship to the load the weight is "+low);
  }
}
