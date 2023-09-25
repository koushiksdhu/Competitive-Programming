class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : t.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for(char ch : s.toCharArray()){
            if(hm.containsKey(ch))
                hm.put(ch, hm.get(ch) - 1);
        }

        for(char ch : hm.keySet()){
            if(hm.get(ch) == 1)
                return ch;
        }
        return '0';
    }
}