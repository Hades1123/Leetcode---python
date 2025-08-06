from typing import List


class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        current = 0
        minSum = float('inf')
        for num in nums:
            current += num
            minSum = min(current, minSum)

        return max(1, 1 - minSum)