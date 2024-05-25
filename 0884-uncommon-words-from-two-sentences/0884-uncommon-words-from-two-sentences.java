class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> hm = new HashMap<>();

        String strArray1[] = s1.split(" ");
        String strArray2[] = s2.split(" ");

        for(String str : strArray1)
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        for(String str : strArray2)
            hm.put(str, hm.getOrDefault(str, 0) + 1);

        ArrayList<String> al = new ArrayList<>();
        for(Map.Entry<String, Integer> itr : hm.entrySet()) {
            if(itr.getValue() < 2)
                al.add(itr.getKey());
        }

        String ans[] = new String[al.size()];
        for(int i = 0; i < al.size(); i++)
            ans[i] = al.get(i);
        
        return ans;
    }
}