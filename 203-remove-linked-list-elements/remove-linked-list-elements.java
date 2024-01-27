class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node to simplify the code
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Use a separate pointer to iterate through the list
        ListNode current = dummy;
        
        while (current.next != null) {
            if (current.next.val == val) {
                // Skip the node with the specified value
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }
        
        return dummy.next; // The actual head of the modified list
    }
}
