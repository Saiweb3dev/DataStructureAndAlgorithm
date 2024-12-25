from collections import deque
class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        n = len(image)
        m = len(image[0])
        queue = deque()
        visArr = [[0] * m for _ in range(n)]
        queue.append((sr,sc))
        inClr = image[sr][sc]
        drow = [-1,0,1,0]
        dcol = [0,1,0,-1]
        while queue:
            row, col = queue.popleft()
            image[row][col] = color
            for i in range(4):
             nrow = row + drow[i]
             ncol = col + dcol[i]

             if 0 <= nrow < n and 0 <= ncol < m and visArr[nrow][ncol] != 2 and image[nrow][ncol] == inClr:
                queue.append((nrow,ncol))
                visArr[nrow][ncol] = 2    
        return image