/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        if(root1 == null) {
            List<Integer> list = new ArrayList<>();
            inOrder(root2, list);
            return list;
        }
        if(root2 == null) {
            List<Integer> list = new ArrayList<>();
            inOrder(root1, list);
            return list;
        }
        List<Integer> list1 = new ArrayList<>();
        inOrder(root1, list1);
        List<Integer> list2 = new ArrayList<>();
        inOrder(root2, list2);
        return mergeList(list1, list2);
        
    }
    public static void inOrder(TreeNode node, List<Integer> list) {
        if(node == null) {
            return;
        }
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }
    public static List<Integer> mergeList(List<Integer> l1, List<Integer> l2) {
        int i = 0; 
        int j = 0;
        List<Integer> sortedList = new ArrayList<>();
        while(i < l1.size() && j < l2.size()) {
            if(l1.get(i) < l2.get(j)) {
                sortedList.add(l1.get(i));
                i++;
            } else {
                sortedList.add(l2.get(j));
                j++;
            }
        }
        while(i < l1.size()) {
            sortedList.add(l1.get(i));
            i++;
        }
        
        while(j < l2.size()) {
            sortedList.add(l2.get(j));
            j++;
        }

        return sortedList;
    }
}