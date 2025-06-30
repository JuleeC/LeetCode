class Solution:
    def findHLS(self,nums):
        from collections import Counter
        if nums == 0:
            return 0
        freq = Counter(nums)
        ans = 0
        for k in freq:




