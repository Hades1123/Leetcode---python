from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict = {}
        result = []
        for item in strs:
            key = ''.join(sorted(list(strs[0])))
            if not dict.get(key):
                dict[key] = []
            dict[key].append(item)
        for v in dict.values():
            result.append(v)
        return result

strs = ["eat","tea","tan","ate","nat","bat"]
print((''.join(sorted(list(strs[0])))))