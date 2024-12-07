class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        queue = deque()
        ansCount = 0
        queue.append(root)
        if not root:
            return ansCount
        while queue:
            size = len(queue)
            for _ in range(size):
                node = queue.popleft()
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            ansCount += 1
        return ansCount
    
    # Or Recursion

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
