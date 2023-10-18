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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        if(root == null)
            return al;

        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        boolean leftToRight = true;

        while(!Q.isEmpty()){
            int size = Q.size();
            List<Integer> temp = new ArrayList<>(size+1);
            for(int i = 0; i < size; i++){
                TreeNode t = Q.peek();
                Q.poll();

                if(leftToRight == true)
                    temp.add(t.val);
                else
                    temp.add(0, t.val);

                if(t.left != null)
                    Q.add(t.left);
                if(t.right != null)
                    Q.add(t.right);
            }
            leftToRight = !leftToRight;
            al.add(temp);
        }
        return al;
    }
}