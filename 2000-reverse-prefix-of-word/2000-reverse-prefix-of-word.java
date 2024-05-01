class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        return idx == -1 ? word : reverse(word.substring(0, idx+1)) + word.substring(idx+1, word.length());
    }
    String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }
}