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
    public int countNodes(TreeNode root) {
        int c[] = new int[1];
        count(root, c);
        return c[0];
    }
    void count(TreeNode root, int[] count) {
        if(root == null)
            return;
        count(root.left, count);
        count[0]++;
        count(root.right, count);
    }
}