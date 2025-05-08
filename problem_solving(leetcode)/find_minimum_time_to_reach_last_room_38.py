class Solution(object):
    def minTimeToReach(self, moveTime):
        n = len(moveTime)
        m = len(moveTime[0])
        minh = [(0, 0, 0, 1)]
        heapq.heapify(minh)
        minTime = set((0, 0))
        direction = [(1,0), (0,1), (-1,0), (0,-1)]
