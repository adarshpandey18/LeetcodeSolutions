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
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode dummy = head;
        while(dummy != null) {
            list.add(dummy.val);
            dummy = dummy.next;
        }
        int n = list.size();
        boolean flag = (n%2==0)?true:false;
        ListNode temp = head;
        for(int i = 0; i < n / 2 ; i++) {
            temp.val = list.get(i);
            temp = temp.next;
            temp.val = list.get(n-1-i);
            temp = temp.next;
        }
        if(!flag) temp.val = list.get(n/2);
    }
}