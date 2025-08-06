from typing import List


class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        current_sum = result = 0
        dict = {0 : 1}
        for num in nums:
            current_sum += num
            if current_sum % k in dict:
                result += dict[current_sum % k]
                dict[current_sum % k] += 1
            else:
                dict[current_sum % k] = 1
        return result
            