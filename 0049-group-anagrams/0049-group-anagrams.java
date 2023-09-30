class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        List<List<String>> al = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String temp = String.valueOf(ch);
            if(hm.containsKey(temp))
                hm.get(temp).add(strs[i]);
            else
                hm.put(temp, new ArrayList<>(Arrays.asList(strs[i])));
        }

        for(ArrayList<String> a : hm.values()){
            al.add(a);
        }
        return al;
    }
}