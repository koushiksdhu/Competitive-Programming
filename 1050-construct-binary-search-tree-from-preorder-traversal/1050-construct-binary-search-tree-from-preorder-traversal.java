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
    public TreeNode bstFromPreorder(int[] preorder) {
        return bst(preorder, Integer.MAX_VALUE, new int[]{0});
    }
    TreeNode bst(int arr[], int b, int i[]) {
        if(i[0] == arr.length || arr[i[0]] > b)
            return null;
        TreeNode root = new TreeNode(arr[i[0]++]);
        root.left = bst(arr, root.val, i);
        root.right = bst(arr, b, i);
        return root;
    }
}