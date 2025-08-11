# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        dict = {}
        current = headA
        while current:
            dict[current] = current.val
            current = current.next
        current = headB
        while current:
            if current in dict:
                return current
            current = current.next
        return None