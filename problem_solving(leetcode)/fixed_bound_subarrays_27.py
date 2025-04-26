class Solution(object):
    def countSubarrays(self, nums, minK, maxK):
        count = 0
        start = -1
        mini = -1
        maxi = -1
        for i in range(len(nums)):
            