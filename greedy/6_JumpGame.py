from typing import List

class Solution:
    def canJump(self, nums: List[int]) -> bool:
        n = len(nums)
        jumpDis = 0

        for i in range(n):

          if i > jumpDis:
            return False
          
          jumpDis = max(jumpDis,nums[i]+i)
          print("Current index --> ",i,"jumpDistance --> ",jumpDis)

          if jumpDis >= n - 1:
            return True
        return False
        


def main():
    # Input data
    nums = [3,2,1,1, 0]

    # Instantiate the Solution class and call the method
    sol = Solution()
    result = sol.canJump(nums)
    print("Solution --> ", result)


# Run the main function
main()
