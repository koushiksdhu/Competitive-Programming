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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        inorder(root, hm);
        int mode = 0;
        for(int v : hm.values()) {
            mode = Math.max(mode, v);
        }
        int count = 0;
        for(int v : hm.values()) {
            if(v == mode)
                count++;
        }
        int ans[] = new int[count];
        int i = 0;
        for(int key : hm.keySet()){
            if(hm.get(key) == mode)
                ans[i++] = key;
        }
        return ans;
    }
    void inorder(TreeNode root, HashMap<Integer, Integer> hm) {
        if(root == null)
            return;
        inorder(root.left, hm);
        hm.put(root.val, hm.getOrDefault(root.val, 0) + 1);
        inorder(root.right, hm);
    }
}