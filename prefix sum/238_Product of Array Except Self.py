from typing import List

# time = O(n) - space = O(n)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix = [0] * len(nums)
        prefix[-1] = nums[-1]
        for i in range(1, len(nums) - 1):
            prefix[-1 - i] = prefix[-i] * nums[-1 - i]
        result = []
        result.append(prefix[1])
        current_product = nums[0]
        for i in range(1, len(nums) - 1):
            result.append(current_product * prefix[i + 1])
            current_product *= nums[i]
        result.append(current_product)
        return result