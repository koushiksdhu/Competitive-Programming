class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> al = new ArrayList<>();
        char ch[] = new char[n*2];
        for(int i = 0; i < n; i++)
            ch[i] = '(';
        for(int i = n; i < n*2; i++)
            ch[i] = ')';

        paren(ch, al, 0, 0, 0, n);
        return al;
    }
    void paren(char ch[], List<String> al, int idx, int open, int close, int n){
        if(close == n){
            String str = "";
            for(int i = 0; i < ch.length; i++){
                str += ch[i];
            }
            al.add(str);
            return;
        }
        else{
            if(open > close){
                ch[idx] = ')';
                paren(ch, al, idx+1, open, close+1, n);
            }
            if(open < n){
                ch[idx] = '(';
                paren(ch, al, idx+1, open+1, close, n);
            }
        }
    }
}