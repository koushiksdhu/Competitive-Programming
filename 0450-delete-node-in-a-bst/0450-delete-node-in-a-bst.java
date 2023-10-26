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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;

        else if(root.val == key)
            return helper(root);

        TreeNode dummy = root;
        while(dummy != null) {
            if(dummy.val > key) {
                if(dummy.left != null && dummy.left.val == key) {
                    dummy.left = helper(dummy.left);
                    break;
                }
                else {
                    dummy = dummy.left;
                }
            }
            else {
                if(dummy.right != null && dummy.right.val == key) {
                    dummy.right = helper(dummy.right);
                    break; 
                }
                else
                    dummy = dummy.right;
            }
        }
        return root;
    }

    TreeNode helper(TreeNode temp) {
        if(temp.left == null)
            return temp.right;
        else if(temp.right == null)
            return temp.left;

        TreeNode rChild = temp.right;
        TreeNode lastR = findLastRight(temp.left);
        lastR.right = rChild;
        return temp.left;
    }

    TreeNode findLastRight(TreeNode temp) {
        if(temp.right == null)
            return temp;
        return findLastRight(temp.right);
    }
}