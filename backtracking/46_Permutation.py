from typing import List


class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        result = []
        def backtracking(current_permutation):
            if len(current_permutation) == len(nums):
                result.append(current_permutation[:])
                return
            for num in nums:
                if num in current_permutation:
                    continue
                current_permutation.append(num)   
                backtracking(current_permutation)
                current_permutation.pop()
        backtracking([])
        return result

