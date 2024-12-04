# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def inorderTraversal(self, root: TreeNode):
        result = []

        def dfs(node):
            if not node:
                return
            dfs(node.left)           # Visit left subtree
            result.append(node.val)  # Visit root
            dfs(node.right)          # Visit right subtree

        dfs(root)
        return result

def main():
    # Create the tree: [1, 2, 3, 4, 5, None, 8, None, None, 6, 7, 9]
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)
    root.right.right = TreeNode(8)
    root.left.right.left = TreeNode(6)
    root.left.right.right = TreeNode(7)
    root.right.right.left = TreeNode(9)

    # Perform inorder traversal
    sol = Solution()
    result = sol.inorderTraversal(root)
    print("Inorder Traversal:", result)

if __name__ == "__main__":
    main()
