class Solution(object):
    def minTimeToReach(self, moveTime):
        n = len(moveTime)
        m = len(moveTime[0])
        dp = [[float('inf')] * m for _ in range(n)]
        minh = []
        heapq.heappush(minh, (0, 0, 0))
        moveTime[0][0] = 0
        directions = [(1, 0), (0, 1), (-1, 0), (0, -1)]
