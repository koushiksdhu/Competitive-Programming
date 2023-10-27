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
        ArrayList<Integer> al = new ArrayList<>();
        Traverse(root, al);
        Collections.sort(al);
        return al.get(k-1);
    }
    void Traverse(TreeNode root, ArrayList<Integer> al){
        if(root == null)
            return;
        al.add(root.val);
        Traverse(root.left, al);
        Traverse(root.right, al);
    }
}