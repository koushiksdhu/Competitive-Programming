class Solution {
    public int[] findArray(int[] pref) {
        int prefix = 0;
        int xor = pref[0];
        for(int i = 1; i < pref.length; i++) {
            prefix = xor ^ pref[i];
            pref[i] = prefix;
            xor ^= prefix; 
        }
        return pref;
    }
}