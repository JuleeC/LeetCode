class Solution:
    def clearStars(self, s: str) -> str:
        h = []
        stacks = [[] for _ in range(26)]

        for i, c in enumerate(s):
            if c == "*":
                while h and not stacks[h[0]]:
                    heapq.heappop(h)
                if h:
                    stacks[h[0]].pop()
                    if not stacks[h[0]]:
                        heapq.heappop(h)
            else:
                x = ord(c) - ord('a')
