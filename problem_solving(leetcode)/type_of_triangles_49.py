class Solution(object):
    def triangleType(self, nums):
        if nums[0] == nums[1] and nums[1] == nums[2]:
            return "equilateral"
