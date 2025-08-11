import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> hashMap = new HashMap<>();
        ListNode current = headA;
        while (current != null) {
            hashMap.put(current, current.val);
            current = current.next;
        }
        current = headB;
        while (current != null) {
            if (hashMap.get(current) != null) {
                return current;
            }
            current = current.next;
        }

        return null;
    }
}
