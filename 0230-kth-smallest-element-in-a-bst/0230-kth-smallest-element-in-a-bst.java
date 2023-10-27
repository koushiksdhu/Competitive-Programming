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
    public int kthSmallest(TreeNode root, int k) {
        int ans[] = new int[1];
        int count[] = new int[1];
        Traverse(root, count, ans, k);
        return ans[0];
    }
    void Traverse(TreeNode root, int count[], int ans[], int k){
        if(root == null)
            return;
        Traverse(root.left, count, ans, k);
        if(++count[0] == k){
            ans[0] = root.val;
            return;
        }
        Traverse(root.right, count, ans, k);
    }
}

// The Inorder in every binay search tree is always in sorted order.