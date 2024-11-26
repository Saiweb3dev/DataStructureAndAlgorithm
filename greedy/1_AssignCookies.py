from typing import List

class Solution:
    def findContentChildren(self, greedFactors: List[int], cookieSizes: List[int]) -> int:
        # Sort the greed factors and cookie sizes
        greedFactors.sort()
        cookieSizes.sort()
        print(f"Sorted greed factors: {greedFactors}")
        print(f"Sorted cookie sizes: {cookieSizes}")
        
        childIndex = 0
        cookieIndex = 0
        numChildren = len(greedFactors)
        numCookies = len(cookieSizes)
        
        # Match cookies to children
        while cookieIndex < numCookies and childIndex < numChildren:
            print(f"\nChecking child {childIndex} with greed factor {greedFactors[childIndex]} and cookie {cookieIndex} with size {cookieSizes[cookieIndex]}")
            if cookieSizes[cookieIndex] >= greedFactors[childIndex]:
                print(f"--> Cookie {cookieSizes[cookieIndex]} satisfies child {childIndex}")
                childIndex += 1  # Move to the next child
            else:
                print(f"--> Cookie {cookieSizes[cookieIndex]} does NOT satisfy child {childIndex}")
            cookieIndex += 1  # Move to the next cookie
        
        print(f"\nTotal satisfied children: {childIndex}")
        return childIndex

def main():
    # Test data
    greedFactors = [1, 2, 3]
    cookieSizes = [1, 1]
    
    # Create an instance of Solution and call the function
    solution = Solution()
    maxContentChildren = solution.findContentChildren(greedFactors, cookieSizes)
    
    # Output the result
    print(f"Maximum number of content children: {maxContentChildren}")

main()
