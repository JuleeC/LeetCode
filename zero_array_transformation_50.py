class Solution(object):
    def isZeroArray(self, nums, queries):
        """
        :type nums: List[int]
        :type queries: List[List[int]]
        :rtype: bool
        """

        diff = [0] * (len(nums) + 1)
        for l, r in queries:
            diff[l] += 1
