class Solution(object):
    def countBalancedPermutations(self, num):
        mod = 10**9+7
        n = len(num)
        total = sum(int(c) for c in num)
