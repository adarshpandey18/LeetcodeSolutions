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
    public ListNode reverseList(ListNode head) {
        //finding Index 
        ListNode temporary = head;
        int size =0;
        while(temporary != null) {
            size++;
            temporary = temporary.next;
        }
        if (size == 0) {
            ListNode ans = null;
            return ans;
        }
        int[]nodes = new int[size];
        ListNode temp = head;
        int index = 0;
        while(temp != null) {
            nodes[index++] = temp.val;
            temp = temp.next;
        }
        ListNode ans = new ListNode(nodes[size-1]);
        ListNode pointer = ans;
        for(int i = nodes.length - 2; i >=0; i--) {
            ListNode t = new ListNode(nodes[i]);
            ans.next = t;
            ans = ans.next;
        }
        return pointer;
    }
}