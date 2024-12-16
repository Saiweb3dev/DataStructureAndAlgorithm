# Finding the Graph Components

class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        n = len(isConnected)
        visArr = [False] * n
        province = 0
        def dfs(city):
            for neighbor in range(n):
                if isConnected[city][neighbor] == 1 and not visArr[neighbor]:
                    visArr[neighbor] = True
                    dfs(neighbor)

        for city in range(n):
            if not visArr[city]:
                province += 1
                visArr[city] = True
                dfs(city)
        return province