from typing import List


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        result = current = 0
        prefix = {0 : -1}
        for i in range(len(nums)):
            current += (1 if nums[i] == 1 else -1)
            if current in prefix:
                result = max(result, i - prefix.get(current))
            else:
                prefix[current] = i
        
        return result
            