class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int ones = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1')
                ones++;
        }
        String ans = "";
        if(ones == 1){
            ans = "1";
            while(ans.length() != n)
                ans = "0" + ans;
            return ans;
        }
        else if(ones > 1){
            ans = "1";
            while(ans.length() != n - ones + 1)
                ans = "0" + ans;
            ones--;
            while(ones-- > 0){
                ans = "1" + ans;
            }
        }
        return ans;
    }
}