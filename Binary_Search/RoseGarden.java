package Binary_Search;
// You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
public class RoseGarden {
    static int LowestVal(int arr[], int n)
    {
        int lowVal = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) lowVal = Math.min(lowVal,arr[i]);
        return lowVal;
    }
     static int highestVal(int arr[], int n)
    {
        int highVal = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) highVal = Math.max(highVal,arr[i]);
        return highVal;
    }
    static boolean Possible(int arr[],int day,int n,int roses, int boq)
    {
        int count = 0;
        int boqCreated = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] <= day)
            {
                count++;
                if(count == roses) 
                {
                    boqCreated++;
                    count = 0;
                }
            }
            else
            {
             count = 0;
            }
        }
        if(boqCreated >= boq) return true;
        else return false;
    }
    public static void main(String arsg[]) {
        // Write your code here.
        int arr[] = {1 ,2, 1, 2, 7, 2, 2, 3, 1};
        int r = 3;
        int b = 2;
        int n = arr.length;
        int minDays = -1;
        int low = LowestVal(arr,n);
        int high = highestVal(arr,n);
        if(r*b > n) System.out.println("Cant do the operation");
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(Possible(arr,mid,n,r,b) == true)
            {
                minDays = mid;
                high = mid - 1;
            }
            else low = mid +1;
        }
        System.out.println("The minimum days to make a bouquet is "+minDays);
    }
}
