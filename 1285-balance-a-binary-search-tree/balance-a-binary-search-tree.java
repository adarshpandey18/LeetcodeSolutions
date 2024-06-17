import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sortedList = new ArrayList<>();
        inorderTraversal(root, sortedList);
        return sortedArrayToBST(sortedList, 0, sortedList.size() - 1);
    }

    private void inorderTraversal(TreeNode node, List<Integer> sortedList) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, sortedList);
        sortedList.add(node.val);
        inorderTraversal(node.right, sortedList);
    }

    private TreeNode sortedArrayToBST(List<Integer> sortedList, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(sortedList.get(mid));
        node.left = sortedArrayToBST(sortedList, start, mid - 1);
        node.right = sortedArrayToBST(sortedList, mid + 1, end);
        return node;
    }
}
