package sorting;
//fastest way and less space comp way of sorting algorithm
public class Quick {
  static int pivotFunc(int arr[],int low,int high)
  {
    //setting the first value as pivot
    int pivot = arr[low];
  //pointer one from start after pivot and one at last
    int i = low+1;
    int j = high;
    //running until i crosses j
    while(i<=j)
    {
      //Main Algorithm
      //checking the value greater than pivot running loop until it finds one
      while(i<=high && arr[i] <= pivot)
      {
        i++;
      }
      //checking the value greater than pivot running loop until it finds one
      while(j>low && arr[j] > pivot)
      {
        j--;
      }
      //swapping the small val to left and large to the right of the pivot
      if(i<j)
      {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    //now we got the pivot index and storing the val there to low
    arr[low] = arr[j];
    //the pivot index to the val
    arr[j] = pivot;
    return j;
  }
  static void Qs(int arr[],int low,int high)
  {
   if(low < high)
   {
    int pivot = pivotFunc(arr,low,high);
    //separating the array into two after finding the pivot
    Qs(arr, low, pivot-1);
    Qs(arr,pivot+1,high);
   }
  }
  public static void main(String[] args) {
    System.out.println("Quick sort");
    int arr[] = {4,5,3,1,6,2};
    int n = arr.length;
    int low = 0;
    int high = n-1;
    Qs(arr, low, high);
    // printing the sorted value
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]);
    }
  }
}
