class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
       queue = deque()
       ansList = []
       queue.append(root)
       flag = 1
       if not root:
        return ansList
       while queue:
          levelList = []
          size = len(queue)
          for _ in range(size):
            node = queue.popleft()
            levelList.append(node.val)
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
          if flag == -1:
            levelList.reverse()
          ansList.append(levelList)
          flag *= -1
       return ansList