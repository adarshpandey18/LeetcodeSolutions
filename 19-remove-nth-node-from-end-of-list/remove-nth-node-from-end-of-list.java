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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = new ListNode(); 
        ans.next = head;
        ListNode temp = ans;
        
        int index = 0;
        ListNode ind = head;
        while (ind != null) {
            ind = ind.next;
            index++;
        }

        for (int i = 0; i < index - n; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;  

        return ans.next;  
    }
}
