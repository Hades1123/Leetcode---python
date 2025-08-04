from typing import List


class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        nonZeroList = list(filter(lambda x : x != 0, nums))
        index = 0
        for i in range(len(nums)):
            if i < len(nonZeroList):
                nums[i] = nonZeroList[index]
                index += 1
            else:
                nums[i] = 0