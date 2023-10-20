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

// JUST APPLY REVERSE PRE-ORDER TRAVERSAL: Root -> Left -> Right

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        rightView(root, 0, al);
        return al;
    }

    void rightView(TreeNode node, int level, ArrayList<Integer> al) {
        if(node == null)
            return;

        if(al.size() == level)
            al.add(node.val);

        rightView(node.right, level+1, al);
        rightView(node.left, level+1, al);
    }
}