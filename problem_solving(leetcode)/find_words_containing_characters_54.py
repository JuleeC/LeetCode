class Solution(object):
    def findWordsContaining(self, words, x):
        res = []
        for i, w in enumerate(words):
            for ch in w:
