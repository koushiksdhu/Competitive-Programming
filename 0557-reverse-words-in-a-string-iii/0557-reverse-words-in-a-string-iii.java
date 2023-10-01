class Solution {
    public String reverseWords(String s) {
        String str[] = s.split(" ");
        for(int i = 0; i < str.length; i++){
            str[i] = rev(str[i]);
        }
        s = "";
        for(int i = 0; i < str.length; i++){
            s += str[i];
            if(i < str.length - 1)
                s += " ";
        }

        return s;
    }
    String rev(String str){
        char ch[] = str.toCharArray();
        int start = 0, end = ch.length-1;
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(ch);
    }
}