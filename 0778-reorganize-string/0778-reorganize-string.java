class Solution {
    public String reorganizeString(String s) {
        int N = s.length();
        if(N == 0)
            return "";
        
        int freq[] = new int[26];
        for(char c : s.toCharArray()){
            freq[(int)c - (int)'a']++;
        }

        char maxChar = 0;
        int maxValue = 0;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > maxValue){
                maxValue = freq[i];
                maxChar = (char)(i + (int)'a');
            }
        }

        if(maxValue > (N+1)/2)
            return "";

        String str = "";
        for(int i = 0; i < N; i++){
            str += " ";
        }

        int idx = 0;

        while(maxValue > 0){
            str = str.substring(0, idx) + maxChar + str.substring(idx+1);
            idx += 2;
            maxValue--;
        }
        freq[(int)maxChar - (int)'a'] = 0;

        for(int i = 0; i < 26; i++){
            while(freq[i] > 0){
                idx = idx >= N ? 1 : idx;
                str = str.substring(0, idx) + (char)(i+'a') + str.substring(idx+1);
                idx += 2;
                freq[i]--;
            }
        }
    return str;
    }
}