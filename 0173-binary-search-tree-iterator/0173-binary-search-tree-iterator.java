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
class BSTIterator {
    ArrayList<Integer> al;
    int idx;
    public BSTIterator(TreeNode root) {
        al = new ArrayList<>();
        idx = 0;
        inorder(root);
    }
    
    public int next() {
        return al.get(idx++);
    }
    
    public boolean hasNext() {
        return al.size() > idx;
    }

    void inorder(TreeNode root){
        if(root == null)
            return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */