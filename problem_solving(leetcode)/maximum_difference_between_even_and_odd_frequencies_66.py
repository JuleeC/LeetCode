class Solution:
    def maxDifference(self, s: str) -> int:
        freq = [0] * 26
        maxi_odd = float('-inf')
        mini_even = float('inf')

        for ch in s:
            freq[ord(ch) - ord('a')] += 1

        for count in freq:
            if count == 0:
                continue
            if count % 2 == 1:
                maxi_odd = max(maxi_odd, count)
            else:
