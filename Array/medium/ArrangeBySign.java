package medium;
public class ArrangeBySign {
  public static void main(String[] args) {
    System.out.println("Rearrange element by sign");
    int nums[] = {3,1,-2,-5,2,-4};
    int n = nums.length;
    int pos = 0, neg = 1;
    int ans[] = new int[n];
    for(int num : nums)
    {
        if(num < 0)
        {
            ans[neg] = num;
            neg+=2;
        }
        else
        {
            ans[pos] = num;
            pos+=2;
        }
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(ans[i]+" ");
    }
  }
}
