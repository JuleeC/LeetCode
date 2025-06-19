class Solution:
    def partitionArray(self, nums: list[int], k: int) -> int:
        nums.sort()

        count = 1

