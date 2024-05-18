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
    public int distributeCoins(TreeNode root) {
        int moves[] = new int[1];
        count(root, moves);
        return moves[0];
    }

    int count(TreeNode root, int moves[]) {
        if(root == null)
            return 0;

        int lCoins = count(root.left, moves);
        int rCoins = count(root.right, moves);
        moves[0] += Math.abs(lCoins) + Math.abs(rCoins);
        return (root.val - 1) + lCoins + rCoins;
    }
}