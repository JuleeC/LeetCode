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
            while right < len(nums) and len(cnt) < distinct:
                cnt[nums[right]] = cnt.get(nums[right],0) +1
                right += 1
            if len(cnt) == distinct:
                res += len(nums) -right +1

        return res

