class Solution(object):
    def countBalancedPermutations(self, num):
        mod = 10**9+7
        n = len(num)
        total = sum(int(c) for c in num)
        if total % 2: return 0
        fact = [1]*(n+1)
        inv = [1]*(n+1)
