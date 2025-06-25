class Solution:
    def kthSmallestProduct(self, nums1: List[int], nums2: List[int], k: int) -> int:
        nums1.sort()
        nums2.sort()

        def count_pairs(x: int) -> int:
            count = 0
            for a in nums1:
                if a > 0:
                    # a * b <= x => b <= x // a
                    count += bisect.bisect_right(nums2, x // a)
                elif a < 0:
                    # a * b <= x => b >= ceil(x / a)
                    # careful with negatives
                    target = x // a
                    if x % a != 0:
                        target += 1
                    count += len(nums2) - bisect.bisect_left(nums2, target)
                else:
                    if x >= 0:
                        count += len(nums2)  # zero * anything <= x
