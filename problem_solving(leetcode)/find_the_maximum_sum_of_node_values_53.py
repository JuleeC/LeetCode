class Solution(object):
    def maximumValueSum(self, nums, k, edges):
        """
        :type nums: List[int]
        :type k: int
        :type edges: List[List[int]]
        :rtype: int
        """
        # Step 1: Calculate base sum
        base_sum = sum(nums)

        # Step 2: Calculate gains for XORing each number
        gains = [(num ^ k) - num for num in nums]

        # Step 3: Sort gains descending
        gains.sort(reverse=True)

