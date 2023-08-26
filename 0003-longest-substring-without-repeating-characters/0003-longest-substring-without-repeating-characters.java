class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character, Integer> hm = new HashMap<>();
       int max = 0;
        int l = 0;
        int r = 0;
        for(r = 0; r < s.length(); r++){
           hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r), 0) + 1);
           while(hm.get(s.charAt(r)) > 1){
                hm.put(s.charAt(l), hm.get(s.charAt(l)) - 1);
                if(hm.get(s.charAt(l)) == 0)
                    hm.remove(s.charAt(l));
                l++;
           }
            max = Math.max(max, r-l+1);
           }
       return max;
    }
}