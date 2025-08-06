from typing import List


class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        result = float('inf')
        window = currentSum = index = 0
        while index < len(nums):
            currentSum += nums[index]
            while currentSum >= target and window <= index:
                result = min(result, index - window + 1)
                currentSum -= nums[window]
                window += 1
            index += 1
        
        return 0 if result == float('inf') else result