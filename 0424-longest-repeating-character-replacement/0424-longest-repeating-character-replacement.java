class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int ans = 0, j = 0, max = 0;

        for(int i = 0; i < s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            max = Math.max(max, hm.get(s.charAt(i)));
            while ((i - j + 1 - max) > k){
                hm.put(s.charAt(j), hm.get(s.charAt(j)) - 1);
                j++;
            }

            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}