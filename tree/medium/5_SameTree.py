class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:

        if not p and not q:
            return True
        
        if not p or not q:
            return False
        if p.val != q.val:
            return False
        leftTree = self.isSameTree(p.left,q.left)
        rightTree = self.isSameTree(p.right,q.right)

        return leftTree and rightTree