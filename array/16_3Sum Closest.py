from typing import List


class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        i = 0
        result = float("infinity")

        while i < len(nums):
            while i != 0 and i < len(nums)  and nums[i] == nums[i - 1]:
                i += 1
            left, right = i + 1, len(nums) - 1
            while left < right:
                s = nums[left] + nums[right] + nums[i]
                result = s if abs(result - target) > abs(s - target) else result
                if s > target:
                    right -= 1
                elif s < target:
                    left += 1
                else:
                    return result
            i += 1
        return result
        