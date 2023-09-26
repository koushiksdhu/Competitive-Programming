class Solution {
    public String removeDuplicateLetters(String s) {
        HashSet<Character> hs = new HashSet<>();
        Stack<Character> stk = new Stack<>();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            hm.put(s.charAt(i), i);
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!hs.contains(c)){
                while(!stk.isEmpty() && c < stk.peek() && i < hm.get(stk.peek())){
                    hs.remove(stk.pop());
                }
                hs.add(c);
                stk.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char c : stk){
            res.append(c);
        }
        return res.toString();
    }
}