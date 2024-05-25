import java.math.BigInteger;
import java.util.PriorityQueue;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // Create a max heap
        PriorityQueue<BigInteger> maxHeap = new PriorityQueue<>((a, b) -> b.compareTo(a));
        
        // Add integers to the max heap
        for (String num : nums) {
            maxHeap.add(new BigInteger(num));
        }
        
        // Remove elements until we reach the kth largest element
        while (k > 1) {
            maxHeap.poll();
            k--;
        }
        
        // Return the string representation of the kth largest integer
        return maxHeap.peek().toString();
    }
}
