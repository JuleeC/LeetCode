class Solution(object):
    def minTimeToReach(self, moveTime):
        n = len(moveTime)
        m = len(moveTime[0])
        minh = [(0, 0, 0, 1)]
        heapq.heapify(minh)
        minTime = set((0, 0))
        direction = [(1,0), (0,1), (-1,0), (0,-1)]
        while minh :
            currTime, x, y, i  = heapq.heappop(minh)
            if x == n - 1 and y == m - 1 :
                return currTime
            for dx,dy in direction :
                nx,ny  = x + dx , y + dy
