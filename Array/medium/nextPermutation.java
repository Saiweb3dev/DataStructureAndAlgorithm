package medium;
// next permutation of number 
//if there is no next then sort it
public class nextPermutation {
  public static void main(String[] args) {
    System.out.println("Next Permutation");
    int arr[] = {1,3,2};
    int n = arr.length;
    int prev = arr[n-1];
    for(int i=n-2;i>=0;i--)
    {
      if(arr[i] < prev)
      {
        for(int j=n-1;j>i;j--)
        {
          if(arr[j] > arr[i])
          {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            break;
          }
        }
        int left = i+1,right = n-1;
        while(left<right)
        {
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
          left++;
          right--;
        }
        break;
      }
      prev = arr[i];
    }
    System.out.println("Output");
    for(int a : arr)
    {
      System.out.print(a+" ");
    }
  }
}
