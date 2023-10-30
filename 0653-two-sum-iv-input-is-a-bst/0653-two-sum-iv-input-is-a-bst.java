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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root, al);
        for(int i = 0; i < al.size(); i++){
            int r = al.remove(i);
            if(al.contains(k - r))
                return true;
            al.add(i, r);
        }
        return false;
    }
    void inorder(TreeNode root, ArrayList<Integer> al) {
        if(root == null)
            return;
        inorder(root.left, al);
        al.add(root.val);
        inorder(root.right, al);
    }
}