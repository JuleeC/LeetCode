class Solution:
    def findEvenNumbers(self, digits: List[int]) -> List[int]:
        nums = set()
        n = len(digits)
        for i in range(n):
            for j in range(n):
                for k in range(n):
