class Solution {
    public String makeGood(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(!stk.isEmpty() && Math.abs(s.charAt(i) - stk.peek()) == 32)
                stk.pop();
            else
                stk.push(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty())
            sb.insert(0, stk.pop());

        return sb.toString();
    }
}