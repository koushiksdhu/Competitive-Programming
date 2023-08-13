class Solution {
    public String finalString(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'i')
                ans = reverse(ans.toCharArray());
            else
                ans += s.charAt(i);
        }
        return ans;
        }
    String reverse(char ch[]){
        int i = 0;
        int j = ch.length-1;
        
        while(i < j){
            char temp = ch[i];
            ch[i++] = ch[j];
            ch[j--] = temp;
        }
        String str = "";
        for(char c : ch)
            str += c;
        return str;
    }
}