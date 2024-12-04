# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def preorderTraversal(self, root):
        result = []

        def dfs(node, depth=0):
            if not node:
                print(f"{'  ' * depth}Backtracking from None")
                return
            
            # Print the current node being visited
            print(f"{'  ' * depth}Visiting Node: {node.val}")
            result.append(node.val)  # Visit the root
            
            # Traverse the left subtree
            print(f"{'  ' * depth}Going left from Node: {node.val}")
            dfs(node.left, depth + 1)
            
            # Traverse the right subtree
            print(f"{'  ' * depth}Going right from Node: {node.val}")
            dfs(node.right, depth + 1)
            
            # Print when backtracking
            print(f"{'  ' * depth}Backtracking from Node: {node.val}")

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

    # Perform preorder traversal
    sol = Solution()
    result = sol.preorderTraversal(root)
    print("Preorder Traversal:", result)

if __name__ == "__main__":
    main()
