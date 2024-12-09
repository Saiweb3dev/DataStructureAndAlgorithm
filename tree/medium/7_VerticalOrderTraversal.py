class Solution:
    def verticalTraversal(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return

        tupleList = []

        def dfs(node,row,col):
            if not node:
                return
            tupleList.append((node.val,(row,col)))

            if node.left:
                dfs(node.left,row+1,col-1)    
            if node.right:
                dfs(node.right,row+1,col+1)
        dfs(root,0,0)
        sorted_list = sorted(tupleList, key=lambda x:(x[1][1],x[1][0], x[0]))

       # Group by column value
        from collections import defaultdict
        grouped = defaultdict(list)

        for value, (row, col) in sorted_list:
          grouped[col].append(value)  # Group by column

      # Convert to nested list
        nested_list = list(grouped.values())
        return nested_list