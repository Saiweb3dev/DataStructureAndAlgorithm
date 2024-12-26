class Solution:
    def largest(self, arr):
        # code here
        n = len(arr)
        maxVal = 0
        for i in range(n):
            maxVal = max(maxVal,arr[i])
        return maxVal    
        