class Solution(object):
    def numEquivDominoPairs(self, dominoes):
        """
        :type dominoes: List[List[int]]
        :rtype: int
        """
        seen = {}
        cnt = 0
        for a,b in dominoes:
            dummy = tuple(sorted([a,b]))
            if dummy in seen:

            else:
                seen[dummy] = 1
        return cnt

