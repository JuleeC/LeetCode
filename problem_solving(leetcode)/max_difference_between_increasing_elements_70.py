class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        stack = []  # (value, index)
        diff = -1

        for i, num in enumerate(nums):
            if not stack or num < stack[-1][0]:
