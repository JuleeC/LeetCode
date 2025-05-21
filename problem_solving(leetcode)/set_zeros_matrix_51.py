class Solution(object):
    def setZeroes(self, matrix):
        first_col = False
        for row in range(len(matrix)):
            if matrix[row][0] == 0:

