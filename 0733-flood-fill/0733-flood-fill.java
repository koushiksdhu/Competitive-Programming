class Pair {
    int row, col;
    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}


class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int prevColor = image[sr][sc];
        image[sr][sc] = color;
        Queue<Pair> q = new LinkedList<>();
        boolean vis[][] = new boolean[image.length][image[0].length];

        q.add(new Pair(sr, sc));
        vis[sr][sc] = true;
        int dRow[] = {-1, 0, 1, 0};
        int dCol[] = {0, 1, 0, -1};

         while(!q.isEmpty()) {
             Pair data = q.poll();
             for(int i = 0; i < dRow.length; i++) {
                 int row = data.row + dRow[i];
                 int col = data.col  + dCol[i];

                 if(row >= 0 && row < image.length && col >= 0 && col < image[0].length && image[row][col] == prevColor && vis[row][col] == false){
                     q.add(new Pair(row, col));
                     vis[row][col] = true;
                     image[row][col] = color;
                 }
             }
         }
         return image;
    }
}