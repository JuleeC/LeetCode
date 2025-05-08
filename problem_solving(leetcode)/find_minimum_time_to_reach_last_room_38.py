class Solution(object):
    def minTimeToReach(self, moveTime):
        n = len(moveTime)
        m = len(moveTime[0])
        minh = [(0, 0, 0, 1)]
