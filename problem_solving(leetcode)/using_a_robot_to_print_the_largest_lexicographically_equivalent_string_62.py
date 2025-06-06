class Solution(object):
    def robotWithString(self, s):
        """
        :type s: str
        :rtype: str
        """

        freq = Counter(s)
        st = []
        res = []
