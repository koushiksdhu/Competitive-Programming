class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int j = 0, count = 0;
        for(int i : s){
            if( j < g.length && i >= g[j]){
                j++;
                count++;
           }
       }
        return count;
    }
}