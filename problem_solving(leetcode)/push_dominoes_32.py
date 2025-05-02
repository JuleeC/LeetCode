class Solution(object):
    def pushDominoes(self, s):
        s = 'L' + s + 'R'
        res = ''
        prev = 0
        for curr in range(1, len(s)):
            if s[curr] == '.':
                continue
