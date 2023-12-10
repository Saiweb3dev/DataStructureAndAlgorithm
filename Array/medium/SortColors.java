package medium;
//sorting 0,1,2 with less than 0(n) time and 0(1) space
//using dutch flag method
public class SortColors {
  public static void main(String[] args) {
    System.out.println("Sorting colors");
    int nums[] = {1,2,0,2,1,0,2,1};
    int zero=0,one=0,two=0;
       int n=nums.length;
       for(int num : nums)
       {
           if(num == 0) zero++;
           else if(num == 1) one++;
           else two++;
       }
       for(int i=0;i<zero;i++) nums[i] = 0;
       for(int i=zero;i<zero+one;i++) nums[i] = 1;
       for(int i=zero+one;i<n;i++) nums[i] = 2;
       
       //output
       for(int num : nums)
       {
        System.out.print(num+" ");
       }
  }
}
