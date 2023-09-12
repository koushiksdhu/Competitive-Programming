class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> hm = new LinkedHashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        int deletion = 0;
        for(char ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for(char k : hm.keySet()){
            while(hs.contains(hm.get(k)) && hm.get(k) > 0){
                hm.put(k, hm.get(k)-1);
                deletion++;
            }
            hs.add(hm.get(k));
        }
        return deletion;
    }
}