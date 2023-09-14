class Solution {
    public String reverseStr(String s, int k) {
        char ch[] = s.toCharArray();
        if(s.length() == 1)
            return s;
        
        else if(k > ch.length){
            reverseK(ch, 0, ch.length-1);
        }

        else if(ch.length < 2*k && ch.length >= k){
            reverseK(ch, 0, k-1);
        }

        else{
            for(int i = 0; i < s.length(); i+= k*2)
                reverseK(ch, i, i+k-1);
        }

        return String.valueOf(ch);
    }
    void reverseK(char ch[], int i, int j){
        j = Math.min(j, ch.length-1);
        while(i < j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}