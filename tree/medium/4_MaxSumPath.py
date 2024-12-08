class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        # Initialize to the smallest possible value
        self.maxSum = float('-inf')

        def dfs(node):
            if not node:
                return 0
                
            # Ignore negative contributions
            left = max(dfs(node.left),0)
            right = max(dfs(node.right),0)

            self.maxSum = max(self.maxSum,left+right+node.val)
           # Return the maximum contribution from this node
            return node.val + max(left,right)
        
        dfs(root)
        return self.maxSum