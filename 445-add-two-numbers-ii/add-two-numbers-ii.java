import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        StringBuilder str = new StringBuilder();
        while (temp1 != null) {
            str.append(temp1.val);
            temp1 = temp1.next;
        }

        ListNode temp2 = l2;
        StringBuilder str2 = new StringBuilder();
        while (temp2 != null) {
            str2.append(temp2.val);
            temp2 = temp2.next;
        }

        BigInteger num1 = new BigInteger(str.toString());
        BigInteger num2 = new BigInteger(str2.toString());

        BigInteger sum = num1.add(num2);

        String addition = sum.toString();
        ListNode ans = new ListNode(addition.charAt(0) - '0');
        ListNode temp3 = ans;
        for (int i = 1; i < addition.length(); i++) {
            temp3.next = new ListNode(addition.charAt(i) - '0');
            temp3 = temp3.next;
        }

        return ans;
    }
}
