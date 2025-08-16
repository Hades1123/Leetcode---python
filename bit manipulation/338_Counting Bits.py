from typing import List

#! time: O(nlog(n)) - space: O(n)
class Solution:
    def countBits(self, n: int) -> List[int]:
        result = []
        for i in range(0, n + 1):
            count = 0
            while i:
                if i & 1:
                    count += 1
                i = i >> 1
                result.append(count)
        return result

#! time: O(n)
class Solution:
    def countBits(self, n: int) -> List[int]:
        ans = [0] * (n + 1)
        for i in range(1, n + 1):
            ans[i] = ans[i >> 1] + (i & 1)  # shift right and add last bit
        return ans
        