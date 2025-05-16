class Solution:
    def lengthAfterTransformations(self, s: str, t: int) -> int:
        mod = 10**9 +7
        ans = 0

        dp = [0] * (t +26)
        for i in range(26):
            dp[i] = 1
        for j in range(26, t + 26):
            dp[j] = (dp[j-26]+dp[j-25]) % mod

        for k in s:
            ans= (ans +dp[ord(k) -ord('a') + t]) %mod
        return ans