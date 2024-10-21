class Solution {
    public int maxUniqueSplit(String s) {
        return handler(0, s, new HashSet<>());
    }

    private int handler(int i, String s, HashSet<String> hs) {
        if(i == s.length())
            return 0;

        int max = 0;

        for(int j = i + 1; j <= s.length(); j++) {
            String str = s.substring(i, j);
            if(!hs.contains(str)) {
                hs.add(str);
                max = Math.max(max, 1 + handler(j, s, hs));
                hs.remove(str);
            }
        }
        return max;
    }
}