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
        // ListNode head = null;
        // public Solution(ListNode head) {
        //     this.head = head;
        // }
        // public int getRandom() {
        //     ListNode node = head;
        //     int result = -1;
        //     int index = 0;
        //     Random random = new Random();
        //     while (node != null) {
        //         index++;
        //         // Generate random index between 0 and index-1
        //         // total possible outcome is index, but favorable outcome is 1
        //         if (random.nextInt(index) == index-1)
        //             result = node.val;
        //         node = node.next;
        //     } return result;
        // }

    int len=0;
    ListNode headNode=null;
    Random random = new Random();
    public Solution(ListNode head) {
        headNode=head;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
    }
    
    public int getRandom() {
        ListNode temp=headNode;
        int rand_index=random.nextInt(len);
        for(int i=0;i<rand_index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */