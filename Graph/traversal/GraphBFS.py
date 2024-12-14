class Solution:
    # Function to return Breadth First Traversal of a given graph.
    def bfsOfGraph(self, adj: List[List[int]]) -> List[int]:
        V = len(adj)
        visArr = [0] * V  # Visited array initialized to 0
        bfs = []  # To store BFS traversal result
        queue = deque()

        # Start BFS from the first vertex (0)
        visArr[0] = 1
        queue.append(0)

        while queue:
            node = queue.popleft()
            bfs.append(node)
            
            # Visit all unvisited adjacent vertices
            for i in adj[node]:
                if not visArr[i]:
                    visArr[i] = 1
                    queue.append(i)
        
        return bfs