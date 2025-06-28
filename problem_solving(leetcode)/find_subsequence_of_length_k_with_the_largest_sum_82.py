class Solution:
    def maxSubsequence(self, nums: List[int], k: int) -> List[int]:
        # Step 1: Keep track of original indices
        indexed = [(num, i) for i, num in enumerate(nums)]

