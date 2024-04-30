class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lessThan = new ListNode();
        ListNode greaterThan = new ListNode();
        ListNode dummy = lessThan;
        ListNode dummy2 = greaterThan;
        while(head != null) {
            if(head.val < x) {
                dummy.next = head;
                dummy = dummy.next;
            } else {
                dummy2.next = head;
                dummy2 = dummy2.next;
            }
            head = head.next;
        }
        dummy.next = greaterThan.next;
        dummy2.next = null; 
        return lessThan.next; 
    }
}
