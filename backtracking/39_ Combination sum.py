from typing import List


class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result = []
        candidates.sort()
        def backtracking(path, start, total):
            if total == target:
                result.append(path[:])
                return
            for i in range(start, len(candidates)):
                if total + candidates[i] > target:
                    return 
                path.append(candidates[i])
                backtracking(path, i, total + candidates[i])
                path.pop()
        backtracking([], 0, 0)
        return result