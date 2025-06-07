class Solution:
    def clearStars(self, s: str) -> str:
        h = []
        stacks = [[] for _ in range(26)]

