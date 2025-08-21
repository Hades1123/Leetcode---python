from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        result = 0
        current_max = prices[-1]
        for i in range(1, len(prices)):
            if result < current_max - prices[-1 - i]:
                result = current_max - prices[-1 - i]
            if current_max < prices[-1 - i]:
                current_max = prices[-1 - i]
        return result