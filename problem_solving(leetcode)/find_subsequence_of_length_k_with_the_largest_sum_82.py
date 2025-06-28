class Solution:
    def maxSubsequence(self, nums: List[int], k: int) -> List[int]:
        # Step 1: Keep track of original indices
        indexed = [(num, i) for i, num in enumerate(nums)]

        # Step 2: Sort by value (descending) and take top k
        top_k = sorted(indexed, key=lambda x: x[0], reverse=True)[:k]
