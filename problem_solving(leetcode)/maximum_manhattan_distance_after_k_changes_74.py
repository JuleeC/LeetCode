class Solution:
    def maxDistance(self, s: str, k: int) -> int:
        ans = 0
        north = south = east = west = 0

        for i in range(len(s)):
            c = s[i]
            if c == 'N':
                north += 1
