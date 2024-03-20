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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode pointer1 = list1;
        ListNode pointer2 = list1;
        while(a-1 > 0) {
            pointer1 = pointer1.next;
            --a;
        }
        while(b > 0) {
            pointer2 = pointer2.next;
            --b;
        }
        pointer2 = pointer2.next;

        ListNode pointer = list2;    
        while(pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = pointer2;
        pointer1.next = list2;
        

        return list1;
    }
}