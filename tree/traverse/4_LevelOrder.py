from typing import Optional, List

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
       queue = deque()
       ansList = []
       queue.append(root)
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
          ansList.append(levelList)
       return ansList