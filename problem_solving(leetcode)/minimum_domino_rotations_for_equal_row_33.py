class Solution:
    def minDominoRotations(self, A, B):

        for i in [A[0],B[0]]:

            if all(i in d for d in zip(A, B)):

        return -1