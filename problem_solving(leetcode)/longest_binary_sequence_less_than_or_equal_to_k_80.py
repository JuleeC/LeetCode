class Solution:
    def longestSubsequence(self, s: str, k: int) -> int:
        n = len(s)
        zeros = s.count('0')
