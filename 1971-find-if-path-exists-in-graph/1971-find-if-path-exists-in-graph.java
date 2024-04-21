class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            hm.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            hm.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> vis = new HashSet<>();

        q.offer(source);
        vis.add(source);

        while(!q.isEmpty()){
            int node = q.poll();
            if(node == destination)
                return true;

            List<Integer> neigh = hm.getOrDefault(node, new ArrayList<>());
            for(int ne : neigh) {
                if(!vis.contains(ne)) {
                    vis.add(ne);
                    q.offer(ne);
                }
            }
        }
        return false;
    }
}