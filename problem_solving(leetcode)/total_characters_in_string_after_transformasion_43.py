class Solution:
    def lengthAfterTransformations(self, s: str, t: int) -> int:
        mod = 10**9 +7
        ans = 0

        dp = [0] * (t +26)
        for i in range(26):
            dp[i] = 1
        for j in range(26, t + 26):
