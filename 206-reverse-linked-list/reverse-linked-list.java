class Solution {
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        if(list.size()== 0)
            return head;
        ListNode ans = new ListNode();
        ListNode node = ans;

        node.val = list.get(list.size() - 1);
        for (int i = list.size() - 2; i >= 0; i--) {
            ListNode temp = new ListNode(list.get(i));
            node.next = temp;
            node = node.next;
        }

        return ans;
    }
}
