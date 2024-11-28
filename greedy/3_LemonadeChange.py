from typing import List

class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        n = len(bills)
        bill5 = 0
        bill10 = 0
        bill20 = 0
        
        for i in range(0, n):
            if bills[i] == 5:
                bill5 += 1
            elif bills[i] == 10:
                if bill5 > 0:
                    bill5 -= 1
                    bill10 += 1
                else:
                    return False
            elif bills[i] == 20:
                # Prefer giving one $10 and one $5 for change
                if bill5 > 0 and bill10 > 0: 
                    bill5 -= 1
                    bill10 -= 1
                    bill20 += 1 
                # Otherwise, use three $5 bills
                elif bill5 >= 3:
                    bill5 -= 3
                    bill20 += 1 
                else:
                    return False

        return True

    @staticmethod
    def main():
        bills = [5, 5, 5, 10, 20]
        solution = Solution()
        result = solution.lemonadeChange(bills)
        print("Can provide correct change for all customers:", result)

# Run the main function
if __name__ == "__main__":
    Solution.main()
