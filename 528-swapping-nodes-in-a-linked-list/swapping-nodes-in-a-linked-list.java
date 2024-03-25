/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        for(int i = 0; i < k-1; i++) {
            left = left.next;
        }
        ListNode right = head;
        for(int i = 0; i < size - k; i++ ) {
            right = right.next;
        }
        int store = left.val;
        left.val = right.val;
        right.val = store;

        return head;
    }
}