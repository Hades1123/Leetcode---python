from typing import List

#! time: O(nlog(n)) - space: O(n)
# class Solution:
#     def countBits(self, n: int) -> List[int]:
#         result = []
#         for i in range(0, n + 1):
#             count = 0
#             while i:
#                 if i & 1:
#                     count += 1
#                 i = i >> 1
#                 result.append(count)
#         return result

class Solution:
    def countBits(self, n: int) -> List[int]:
        