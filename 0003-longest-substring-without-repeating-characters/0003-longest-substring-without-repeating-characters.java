class Solution {
    public int lengthOfLongestSubstring(String s) {
    
      int i = 0, j = 0, max = 0;
      StringBuilder sb = new StringBuilder();
      while(j < s.length()){
          if(sb.indexOf(""+s.charAt(j)) == -1){
              sb.append(s.charAt(j));
              j++;
          }
          else{
              max = Math.max(sb.length(), max);
              sb.setLength(0);
              i++;
              j = i;
          }
      }
      max = Math.max(sb.length(), max);
      return max;
    }
}