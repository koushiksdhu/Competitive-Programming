class Solution {
    public int numberOfSubstrings(String s) {
        // Brute Force: TLE
        
        // HashSet<Character> hs = new HashSet<>();
        // int count = 0;
        // for(int i = 0; i < s.length(); i++){
        //     hs.clear();
        //     for(int j = i; j < s.length(); j++){
        //         hs.add(s.charAt(j));
        //         if(hs.size() == 3)
        //             count++;
        //     }
        // }
        // return count;




        // Optimized Approach:

        int temp[] = new int[3];
        int start = 0, end = 0, count = 0;

        for(; end < s.length(); end++){
            temp[s.charAt(end) - 'a']++;
            while(arePresent(temp)){
                count += s.length() - end;
                temp[s.charAt(start++) - 'a']--;
            }
        }
        return count;
    }
    boolean arePresent(int pres[]){
        for(int i : pres){
            if(i == 0)
                return false;
        }
        return true;
    }
}