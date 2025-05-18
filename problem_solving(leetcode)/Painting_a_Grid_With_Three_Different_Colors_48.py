class Solution(object):
    def colorTheGrid(self, m, n):
        mod = 10**9+7
        total = 1
        for _ in range(m):
            total *= 3
        dp = [[0]*total for _ in range(n+1)]
        rowValid = [[0]*total for _ in range(total)]
        good = []
        pattern = [[] for _ in range(total)]
        for i in range(total):
            val, valid = i, 1
            for _ in range(m):
                pattern[i].append(val % 3)
                val //= 3
            for j in range(1, m):
                if pattern[i][j] == pattern[i][j-1]:
                    valid = 0
            if valid:
                good.append(i)
        for i in good:
            dp[1][i] = 1
