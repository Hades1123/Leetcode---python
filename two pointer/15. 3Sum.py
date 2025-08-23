from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
        for i in range(0, len(nums) - 2):
            if i != 0 and nums[i] == nums[i - 1]:
                continue
            m, n = i + 1, len(nums) - 1
            while m < n:
                if nums[m] + nums[n] > -nums[i]:
                    n -= 1
                elif nums[m] + nums[n] < -nums[i]:
                    m += 1
                else:
                    result.append([nums[i], nums[m], nums[n]])
                    m += 1
                    n -= 1
                    while m < n and nums[m] == nums[m - 1] and nums[n] == nums[n - 1]:
                        m += 1
                        n -= 1
        return result
                