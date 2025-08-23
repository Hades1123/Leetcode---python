from typing import List

#! Time: O(N) Space: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        i, j, result = 0, len(height) - 1, 0
        while i < j:
            result = max(result, min(height[i], height[j]) * (j - i))
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return result