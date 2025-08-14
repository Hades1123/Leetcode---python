package array;

import java.util.LinkedList;
import java.util.List;

//! Linked list solution time: O(n) - space: O(n)
//! Bad solution
// class Solution {
//     public void rotate(int[] nums, int k) {
//         k = k % nums.length;
//         if (k == 0) {
//             return;
//         }
//         List<Integer> list = new LinkedList<>();
//         for (int i = 0; i < nums.length - k; ++i) {
//             list.add(nums[i]);
//         }
//         for (int i = 0; i < k; ++i) {
//             list.addFirst(nums[nums.length - 1 - i]);
//         }
//         int index = 0;
//         for (Integer num : list) {
//             nums[index++] = num;
//         }
//     }
// }

//! Index equation :D - time: O(n) space: O(n)
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int[] temp = new int[nums.length];
//         for (int i = 0; i < nums.length; ++i) {
//             temp[(i + k) % nums.length] = nums[i];
//         }
//         for (int i = 0; i < nums.length; ++i) {
//             nums[i] = temp[i];
//         }
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {

    }
}