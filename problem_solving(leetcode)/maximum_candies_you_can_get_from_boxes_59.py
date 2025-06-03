class Solution:
    def maxCandies(self, status, candies, keys, containedBoxes, initialBoxes):
        n = len(status)
        canOpen = [False] * n
        hasBox = [False] * n
        visited = [False] * n
        queue = []

        for i in initialBoxes:
            hasBox[i] = True
