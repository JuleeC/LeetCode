class Solution:
    def maxDifference(self, s: str) -> int:
        freq = [0] * 26
        maxi_odd = float('-inf')
        mini_even = float('inf')

