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

class Node {
    TreeNode node;
    int row, col;
    Node (TreeNode node, int row, int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> tm = new TreeMap<>();
        Queue<Node> Q = new LinkedList<>();

        Q.offer(new Node(root, 0, 0));
        while(!Q.isEmpty()){
            Node n = Q.poll();
            TreeNode tNode = n.node;
            int i = n.row;
            int j = n.col;

            if(!tm.containsKey(i))
                tm.put(i, new TreeMap<>());

            if(!tm.get(i).containsKey(j))
                tm.get(i).put(j, new PriorityQueue<>());

            tm.get(i).get(j).offer(tNode.val);

            if(tNode.left != null)
                Q.offer(new Node(tNode.left, i-1, j+1));

            if(tNode.right != null)
                Q.offer(new Node(tNode.right, i+1, j+1));
        }
        List<List<Integer>> al = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> idx : tm.values()) {
            al.add(new ArrayList<>());
            for(PriorityQueue<Integer> n : idx.values()) {
                while(!n.isEmpty()){
                    al.get(al.size()-1).add(n.poll());
                }
            }
        }
        return al;
    }
}