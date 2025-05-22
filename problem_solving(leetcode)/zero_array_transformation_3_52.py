class Solution(object):
    def maxRemoval(self, nums, queries):
        """
        :type nums: List[int]
        :type queries: List[List[int]]
        :rtype: int
        """

        queries.sort(key=lambda x: x[0])
        available = []
        assigned = []
        count = 0
