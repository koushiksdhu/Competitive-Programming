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
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root, al);
        Collections.sort(al);
        checkInorder(root, al, new int[]{0});
    }
    void inorder(TreeNode root, ArrayList<Integer> al) {
        if(root == null)
            return;
        inorder(root.left, al);
        al.add(root.val);
        inorder(root.right, al);
    }
    void checkInorder(TreeNode root, ArrayList<Integer> al, int idx[]) {
        if(root == null)
            return;
        checkInorder(root.left, al, idx);
        if(root.val != al.get(idx[0]))
            root.val = al.get(idx[0]);
        idx[0]++;
        checkInorder(root.right, al, idx);
    }
}