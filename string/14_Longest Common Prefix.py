from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        result = strs[0]
        for str in strs[1:]:
            while not str.startswith(result):
                result = result[:-1]
                if not result:
                    return result
        return result
