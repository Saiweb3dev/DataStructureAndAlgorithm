class Solution:
    def getSecondLargest(self, arr):
        # Code Here
        maxVal = float('-inf')
        secMax = float('-inf')
        
        for val in arr:
            if val > maxVal:
                secMax = maxVal
                maxVal = val
            elif val > secMax and val != maxVal:
                secMax = val
        return secMax if secMax != float('-inf') else -1