from typing import List


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hash_map = {0 : 1}
        current = count = 0
        for num in nums:
            current += num
            if hash_map.get(current - k):
                count += hash_map[current - k]
            hash_map[current] = 1 + hash_map.get(current, 0)

        return count