class Solution:
    
    #Function to return a list containing the DFS traversal of the graph.
    def dfsOfGraph(self, adj):
        V = len(adj)
        visArr = [0] * V
        List = []
        
        def dfs(node):
            visArr[node] = 1
            List.append(node)
            for i in adj[node]:
                if not visArr[i]:
                    dfs(i)
        
        dfs(0)
        return List
       