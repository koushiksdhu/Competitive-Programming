class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new LinkedHashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for(char ch : hm.keySet()){
            if(hm.get(ch) == 1)
                return s.indexOf(""+ch);
        }
        return -1;
    }
}