class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []

        for i, item in enumerate(nums):
            if item > 0:
                break
            if i and item == nums[i - 1]:
                continue
            left, right = i + 1, len(nums) - 1
            while left < right:
                s = nums[left] + nums[right] + item
                if (s < 0):
                    left += 1
                elif s > 0:
                    right -= 1
                else:
                    result.append([nums[left], nums[right], item])
                    left += 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
        return result
                

