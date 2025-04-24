class Solution:
    def countCompleteSubarrays(self, nums: List[int]) -> int:
        res = 0
        cnt = {}
        right = 0
        distinct = len(set(nums))
        for left in range(len(nums)):
            if left > 0:
                remove = nums[left -1]
                cnt[remove] -= 1
                if cnt[remove] == 0:
                    cnt.pop(remove)

