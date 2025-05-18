class Solution(object):
    def colorTheGrid(self, m, n):
        mod = 10**9+7
        total = 1
        for _ in range(m):
            total *= 3
        dp = [[0]*total for _ in range(n+1)]
