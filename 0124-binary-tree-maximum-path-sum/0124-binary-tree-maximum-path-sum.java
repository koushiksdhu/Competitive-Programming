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
    public int maxPathSum(TreeNode root) {
        int max[] = new int[]{Integer.MIN_VALUE};
        sum(root, max);
        return max[0];

    }
    int sum(TreeNode node, int max[]){
        if(node == null)
            return 0;

        int lSum = Math.max(0, sum(node.left, max));
        int rSum = Math.max(0, sum(node.right, max));
        max[0] = Math.max(max[0], lSum + rSum + node.val);
        return node.val + Math.max(lSum, rSum);
    }
}