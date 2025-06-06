class Solution(object):
    def robotWithString(self, s):
        """
        :type s: str
        :rtype: str
        """

        freq = Counter(s)
        st = []
        res = []

        def min_char(freq):
            for i in range(26):
                ch = chr(ord('a') + i)
                if freq[ch] > 0:
                    return ch
            return 'a'

        for ch in s:
            st.append(ch)
            freq[ch] -= 1
