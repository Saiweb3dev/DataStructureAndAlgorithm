
package sorting;

public class Selection
{
public static void main(String[] args) {
  System.out.println("Selection sorting");
  int arr[] = {12,5,3,4,10,1,6};
  int n = arr.length;
  //sorting the array
  for(int i=0;i<n;i++)
  {
    for(int j=i;j<n;j++)
    {
      if(arr[i] > arr[j])
      {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
  //printing the array
  for(int i=0;i<n;i++)
  {
    System.out.print(arr[i]+" ");
  }
}
}