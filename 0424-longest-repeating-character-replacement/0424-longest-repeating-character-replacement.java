class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int len = 0, i = 0, j = 0, max = 0;

        while(j < s.length()){
            hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0) + 1);
            max = Math.max(max, hm.get(s.charAt(j)));

            while((j - i + 1 - max) > k){
                hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
                i++;
            }
            len = Math.max(len, j - i + 1);
            j++;
        }
        return len;
    }
}