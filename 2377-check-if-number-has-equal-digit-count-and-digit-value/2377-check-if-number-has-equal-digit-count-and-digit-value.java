class Solution {
    public boolean digitCount(String s) {
        // int arr[] = new int[10];
        // for(int i = 0; i < num.length(); i++){
        //     arr[num.charAt(i) % 48]++;
        // }
        // for(int i = 0; i < num.length(); i++){
        //     if(arr[i] != Character.getNumericValue(num.charAt(i)))
        //         return false;
        // }
        // return true;

        int freq[] = new int[10];
        for(int i = 0; i < s.length(); i++)
            freq[s.charAt(i)-'0']++;

        for(int i = 0; i < s.length(); i++){
            if(freq[i] != s.charAt(i)-'0')
                return false;
        }
        return true;
    }
}