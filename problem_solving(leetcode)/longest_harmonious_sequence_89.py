class Solution:
    def findHLS(self,nums):
        from collections import Counter
        if nums == 0:
            return 0
        freq = Counter(nums)
        ans = 0
        for k in freq:
            if k + 1 in freq:
                ans = max(ans, freq[k] + freq[k + 1])
                
        return ans





