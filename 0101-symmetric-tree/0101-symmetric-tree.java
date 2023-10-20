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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        
        return isMirror(root.left, root.right);
    }
    boolean isMirror(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        else if(left == null || right == null || left.val != right.val)
            return false;
        
        return isMirror(left.left, right.right) && isMirror(right.left,left.right);
    }
}