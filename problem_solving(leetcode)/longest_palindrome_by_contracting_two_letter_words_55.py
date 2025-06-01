

class Solution:
    def longestPalindrome(self, words):
        freq = Counter(words)
        ans = 0
        has_center = False

        for word in list(freq.keys()):
            rev = word[::-1]
            if word == rev:
                pairs = freq[word] // 2
                ans += pairs * 4
                freq[word] -= pairs * 2
                if freq[word] == 1:
                    has_center = True
            else:
