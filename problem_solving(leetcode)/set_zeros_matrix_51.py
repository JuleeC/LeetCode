class Solution(object):
    def setZeroes(self, matrix):
        first_col = False
        for row in range(len(matrix)):
            if matrix[row][0] == 0:
                first_col = True
            for col in range(1, len(matrix[0])):
                if matrix[row][col] == 0:

