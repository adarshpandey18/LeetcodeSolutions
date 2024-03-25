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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode pointer = ans;
        int sum = 0;
        while(head != null) {
            if(head.val == 0 && sum != 0) {
                ListNode node = new ListNode(sum);
                pointer.next = node;
                pointer = pointer.next;
                sum = 0;
            } 
            else 
                sum+= head.val;
            head = head.next;
        }
        return ans.next;
    }
}