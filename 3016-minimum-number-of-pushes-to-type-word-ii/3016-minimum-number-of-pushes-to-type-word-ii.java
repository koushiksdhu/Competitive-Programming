class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> hm = new LinkedHashMap<>();
        HashSet<Character> hs = new LinkedHashSet<>();
        
        for(int i = 0; i < word.length(); i++)
            hs.add(word.charAt(i));
        
        String uniq = "";
        
        for(char ch : hs) 
            uniq += ""+ch;
    
        for(int i = 0; i < word.length(); i++) {
            hm.put(word.charAt(i), hm.getOrDefault(word.charAt(i), 0) + 1);
        }
        ArrayList<Map.Entry<Character, Integer>> al = new ArrayList<>(hm.entrySet());
        Collections.sort(al, (a, b) -> b.getValue() - a.getValue());

        int i = 0, inc = 1, count = 0;
        for(Map.Entry<Character, Integer> idx : al) {
            if(i > 0 && i % 8 == 0)
                inc++;
            count += inc * idx.getValue();
            i++;
        }
        return count;
    }
}