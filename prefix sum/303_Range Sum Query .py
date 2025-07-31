from typing import List


class NumArray:

    def __init__(self, nums: List[int]):
        self.prefix = []
        sum = 0
        for num in nums:
            sum += num
            self.prefix.append(sum)

    def sumRange(self, left: int, right: int) -> int:
        leftSum = 0 if left - 1 < 0 else self.prefix[left - 1]
        rightSum = self.prefix[right]
        return rightSum - leftSum       
        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)