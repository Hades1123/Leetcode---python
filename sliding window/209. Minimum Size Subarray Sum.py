class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        begin = currentSum = 0
        result = float('inf')
        for i in range(0, len(nums)):
            currentSum += nums[i]
            while currentSum >= target and begin <= i:
                result = min(result, i - begin + 1)
                currentSum -= nums[begin]
                begin += 1
        return result if result != float('inf') else 0