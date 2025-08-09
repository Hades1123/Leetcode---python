from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        nums = nums1[:m]
        i = j = index = 0
        while i < m and j < n:
            if nums[i] < nums2[j]:
                nums1[index] = nums[i]
                i += 1
                index += 1
            else:
                nums1[index] = nums2[j]
                j += 1
                index += 1
        
        while i < m:
            nums1[index] = nums[i]
            index += 1
            i += 1
        
        while j < n:
            nums1[index] = nums2[j]
            index += 1
            j += 1
        