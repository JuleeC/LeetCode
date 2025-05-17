class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        low = mid = 0
        high = len(nums) - 1
        while mid <= high:
            if nums[mid] == 0:

