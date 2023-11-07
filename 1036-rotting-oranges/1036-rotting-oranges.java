class Pair {
    int row, col, count;
    Pair(int row, int col, int count) {
        this.row = row;
        this.col = col;
        this.count = count;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new  LinkedList<>();
        boolean vis[][] = new boolean[grid.length][grid[0].length];

        int r[] = {-1, 0, 1, 0};
        int c[] = {0, 1, 0, -1};

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 2){
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = true;
                }
                // else if(grid[i][j] == 0)
                //     vis[i][j] = true;
            }
        }
        int count = 0;
        while(!q.isEmpty()) {
            Pair pairData = q.poll();
            for(int i = 0; i < r.length; i++) {
                int row = pairData.row + r[i];
                int col = pairData.col + c[i];
                count = Math.max(count, pairData.count);
            if(row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == 1 && vis[row][col] == false) {               grid[row][col] = 2;
                q.add(new Pair(row, col, count+1));
                vis[row][col] = true;
                }
            }
        }
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(vis[i][j] != true && grid[i][j] == 1)
                    return -1;
            }
        }
        return count;
    }
}