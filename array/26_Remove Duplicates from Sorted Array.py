from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 1
        for num in nums[1:]:
            if num != nums[k - 1]:
                nums[k] = num
                k += 1
        return k