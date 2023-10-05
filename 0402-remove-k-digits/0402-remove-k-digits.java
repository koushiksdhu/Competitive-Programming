class Solution {
    public String removeKdigits(String num, int k) {
        if(k == 0)
            return num;
        Stack<Integer> stk = new Stack<>();
        int j = 0;
        for(int i = 0; i < num.length(); i++){
            while(!stk.isEmpty() && (num.charAt(i) - '0') < stk.peek() && k > 0){
                stk.pop();
                k--;
            }
            stk.push(num.charAt(i)-'0');
        }
        while(k > 0 && !stk.isEmpty()){
            k--;
            stk.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(""+stk.pop());
        }
        sb.reverse();
        int i = 0;
        while(i < sb.length() && sb.charAt(i) == '0')
            i++;
        
        return sb.substring(i).length() == 0 ? "0" : sb.substring(i).toString();
    }
}