class Solution(object):
    def pushDominoes(self, s):
        s = 'L' + s + 'R'
        res = ''
        prev = 0
