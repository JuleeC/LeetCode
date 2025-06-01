

class Solution:
    def longestPalindrome(self, words):
        freq = Counter(words)
        ans = 0
        has_center = False

