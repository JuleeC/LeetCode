class Solution:
    def getWordsInLongestSubsequence(
            self, words: List[str], groups: List[int]) -> List[str]:
        n = len(groups)
        dp = [1] * n
        prev_ = [-1] * n
        max_index = 0

        for i in range(1, n):
            for j in range(i):
                if (
