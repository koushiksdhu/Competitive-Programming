class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int ans = 0, j = 0;

        for(int i = 0; i < s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);

            while ((i - j + 1 - Collections.max(hm.values())) > k){
                hm.put(s.charAt(j), hm.get(s.charAt(j)) - 1);
                j++;
            }
            
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}