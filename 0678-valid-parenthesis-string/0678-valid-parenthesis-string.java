class Solution {
    public boolean checkValidString(String s) {
       int openMax = 0, openMin = 0;

       for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                openMax++;
                openMin++;
            }
            else if(s.charAt(i) == ')'){
                openMax--;
                openMin--;
            }
            else if(s.charAt(i) == '*'){
                openMax++;
                openMin--;
            }
            if(openMax < 0)
                return false;
            openMin = Math.max(openMin, 0);
       }
       return openMin == 0;
    }
}