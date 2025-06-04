class Solution(object):
    def answerString(self, word, numFriends):
        if numFriends == 1:
            return word
        res = ""
