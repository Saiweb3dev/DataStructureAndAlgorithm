package sorting;
// It is pushing the largest value to the end of array and excluding the array rotation to that point
public class Bubble {
  public static void main(String[] args) {
    System.out.println("Bubble Sorting");
    int arr[] = {2,4,55,1,12,3,24};
    int n = arr.length;
    
  //bubble sorting
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n-i-1;j++)
    {
      int p1 = j;
      int p2 = j+1;
      if(arr[p1] > arr[p2])
      {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
      }
    }
  }
  // printing the value
  System.out.print("[");
  for(int i=0;i<n;i++) 
  {
    System.out.print(arr[i] +" , ");
  }
   System.out.print("]");
  }
}
