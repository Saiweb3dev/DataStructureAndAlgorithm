from typing import List
from collections import deque
class Solution:
    #Function to detect cycle in an undirected graph.
	def isCycle(self, V: int, adj: List[List[int]]) -> bool:
		#Code here
	  visArr = [0] * V
	  def bfs(start):
	      queue = deque()
	      queue.append((start,-1))
	      visArr[start] = 1
	      while queue:
	          curr,prev = queue.popleft()
	          for i in adj[curr]:
	              if not visArr[i]:
	                  queue.append((i,curr))
	                  visArr[i] = 1
	              elif i != prev:
	                   return True
	      return False
	  for i in range(V):
	       if not visArr[i]:
	           if bfs(i):
	               return True
	  return False