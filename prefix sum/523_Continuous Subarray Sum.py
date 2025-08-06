from typing import List


class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        dict = {0 : -1}
        current_sum = 0
        for i, num in enumerate(nums):
            current_sum += num
            if current_sum % k in dict:
                if i - dict[current_sum % k] >= 2:
                    return True
            else:
                dict[current_sum % k] = i
        
        return False