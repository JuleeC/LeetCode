class Solution:
    def maxCandies(self, status, candies, keys, containedBoxes, initialBoxes):
        n = len(status)
        canOpen = [False] * n
        hasBox = [False] * n
        visited = [False] * n
        queue = []

        for i in initialBoxes:
            hasBox[i] = True
            if status[i] == 1:
                canOpen[i] = True
                queue.append(i)

        for i in range(n):
            if status[i] == 1:
                canOpen[i] = True

