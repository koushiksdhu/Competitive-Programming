class Pair {
    char ch = 0;
    int idx = 0;

    Pair(char ch, int idx) {
        this.ch = ch;
        this.idx = idx;
    }
}

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Pair> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')' && !stk.isEmpty() && stk.peek().ch == '(')
                stk.pop();
            else if(s.charAt(i) == '(' || s.charAt(i) == ')')    
                stk.push(new Pair(s.charAt(i), i));
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i = s.length() - 1; i >= 0; i--) {
            if(!stk.isEmpty() && i == stk.peek().idx) {
                sb.deleteCharAt(i);
                stk.pop(); 
            }
        }
        return sb.toString();
    }
}