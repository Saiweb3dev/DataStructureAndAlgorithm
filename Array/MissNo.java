package Array;

public class MissNo {
  public static void main(String[] args) {
    System.out.println("Missing number in Array");
    int arr[] = {0,1};
    int n = arr.length;
    int hash[] = new int[n+1];
    for(int i=0;i<n;i++)
    {
      hash[arr[i]]++;
    }
    for(int i=0;i<n;i++)
    {
      if(hash[i] == 0)
      {
        System.out.println(i);
      }
    }
  }
}
