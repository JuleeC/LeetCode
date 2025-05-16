class Solution:
    def getWordsInLongestSubsequence(
            self, words: List[str], groups: List[int]) -> List[str]:
        n = len(groups)
        dp = [1] * n
        prev_ = [-1] * n
        max_index = 0

