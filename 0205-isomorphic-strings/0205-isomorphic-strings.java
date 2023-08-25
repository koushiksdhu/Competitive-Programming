class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
       

        if(s.length() != t.length())
            return false;

        for(int i = 0; i < s.length(); i++){
            if(!hm.containsKey(s.charAt(i)) && !hm.containsValue(t.charAt(i)))
                hm.put(s.charAt(i), t.charAt(i));
        }

        for(int i = 0; i < s.length(); i++){
            if(!hm.containsKey(s.charAt(i)) || hm.get(s.charAt(i)) != t.charAt(i))
                return false;
        }
        return true;
    }
}