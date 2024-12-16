from collections import deque
from typing import List

class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        n = len(grid)        # Number of rows
        m = len(grid[0])     # Number of columns
        queue = deque()
        visArr = [[0] * m for _ in range(n)]  # Visited array to track rotted oranges
        
        # Add all initially rotten oranges to the queue
        for i in range(n):
            for j in range(m):
                if grid[i][j] == 2:
                    queue.append(((i, j), 0))  # Store (coordinates, time)
                    visArr[i][j] = 2
        
        tm = 0  # Track maximum time
        drow = [-1, 0, 1, 0]  # Direction vectors for row
        dcol = [0, 1, 0, -1]  # Direction vectors for column
        
        # BFS traversal
        while queue:
            (row, col), time = queue.popleft()  # Dequeue the front element
            tm = max(tm, time)  # Update the time taken
            
            # Explore all 4 neighbors
            for i in range(4):
                nrow = row + drow[i]
                ncol = col + dcol[i]
                
                # Check boundaries, not visited, and fresh orange
                if 0 <= nrow < n and 0 <= ncol < m and visArr[nrow][ncol] != 2 and grid[nrow][ncol] == 1:
                    queue.append(((nrow, ncol), time + 1))  # Add new rotten orange to the queue
                    visArr[nrow][ncol] = 2  # Mark it as visited/rotted
                    grid[nrow][ncol] = 2  # Update grid to indicate the orange has rotted
        
        # Check if any fresh orange is left
        for i in range(n):
            for j in range(m):
                if grid[i][j] == 1:  # Fresh orange that could not rot
                    return -1
        
        return tm
