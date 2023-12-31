class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);

       int count = 0, j = 0;
       for(int i = 0; i < s.length; i++){
           if(j < g.length && s[i] >= g[j]){
               j++;
               count++;
           }
       }
       return count;
    }
}