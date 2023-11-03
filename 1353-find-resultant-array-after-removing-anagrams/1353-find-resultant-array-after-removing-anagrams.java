class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> al = new ArrayList<>();
        for(String s : words)
            al.add(s);

        for(int i = 0; i < al.size() - 1; ){
            if(anagram(al.get(i), al.get(i+1)) == true)
                al.remove(i+1);
            else 
                i++;
        }
        return al;
    }
    boolean anagram(String a, String b){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < a.length(); i++)
            hm.put(a.charAt(i), hm.getOrDefault(a.charAt(i), 0) + 1);
        for(int j = 0; j < b.length(); j++){
            hm.put(b.charAt(j), hm.getOrDefault(b.charAt(j), 0) - 1);
            if(hm.get(b.charAt(j)) == 0)
                hm.remove(b.charAt(j));
        }
        return hm.isEmpty();
    }
}