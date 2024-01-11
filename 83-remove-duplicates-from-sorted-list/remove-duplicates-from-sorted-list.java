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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode ans = new ListNode(head.val);
        ListNode temp = ans;
        head = head.next;
        while(head != null) {
            if(head.val != temp.val) {
                temp.next = new ListNode(head.val);
                head = head.next;
                temp = temp.next;
            }
            else
                head = head.next;
        }
        temp.next = null;
        return ans;
    }
}