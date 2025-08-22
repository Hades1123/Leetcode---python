from typing import List


class Solution:
    def zeroFilledSubarray(self, nums: List[int]) -> int:
        result = 0
        size = 0
        for num in nums:
            if num == 0:
                size += 1
                result += size
            else:
                size = 0
        return result