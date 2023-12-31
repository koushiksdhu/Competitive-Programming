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
    public int minDepth(TreeNode root) {
        int ans = handlerFunction(root);
        return ans == Integer.MAX_VALUE ? 0 : ans; 
    }
    int handlerFunction(TreeNode root){
         if(root == null)
            return Integer.MAX_VALUE;

        else if(root.left == null && root.right == null)
            return 1;

        return 1 + Math.min(handlerFunction(root.left), handlerFunction(root.right));
    }
}
