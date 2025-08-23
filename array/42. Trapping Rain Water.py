from typing import List

# Array
#! Time : O(n) ; Space : O(n)
class Solution:
    def trap(self, height: List[int]) -> int:
        result, rMax, lMax = 0, [0] * len(height), [0] * len(height)
        temp = height[0]
        for i in range(0, len(height)):
            if temp < height[i]:
                temp = lMax[i] = height[i]
            else:
                lMax[i] = temp
        temp = height[-1]
        for i in range(0, len(height)):
            if temp < height[-1 - i]:
                rMax[-1 - i] = temp = height[-1 - i]
            else:
                rMax[-1 - i] = temp
        for i in range(0, len(height)):
            result += max(0, min(lMax[i], rMax[i]) - height[i])
        return result
        