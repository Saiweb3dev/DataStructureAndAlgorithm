class Solution:
    def checkValidString(self, s: str) -> bool:
        low = 0  # Minimum possible open parentheses
        high = 0  # Maximum possible open parentheses
        
        for char in s:
            if char == '(':
                low += 1
                high += 1
            elif char == ')':
                low = max(low - 1, 0)  # Can't have negative open parentheses
                high -= 1
            elif char == '*':
                low = max(low - 1, 0)  # Treat '*' as ')'
                high += 1  # Treat '*' as '('
            
            # If high is negative, there are too many ')'
            if high < 0:
                return False
        
        # Check if all open parentheses are balanced
        return low == 0

    @staticmethod
    def main():
        # Example test case
        test_string = "(*))"
        solution = Solution()
        result = solution.checkValidString(test_string)
        print(f"Is the string '{test_string}' valid? {result}")

# Run the main function
if __name__ == "__main__":
    Solution.main()
