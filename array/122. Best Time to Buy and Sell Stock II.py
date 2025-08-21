from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        result = 0
        for i in range(0, len(prices) - 1):
            if prices[i + 1] - prices[i] > 0:
                result += prices[i + 1] + prices[i]
        return result
