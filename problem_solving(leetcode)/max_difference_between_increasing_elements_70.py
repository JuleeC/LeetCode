class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        stack = []  # (value, index)
        diff = -1

