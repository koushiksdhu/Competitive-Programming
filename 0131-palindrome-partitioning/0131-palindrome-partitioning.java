class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> al = new ArrayList<>();
        helperFunc(s, 0, al, new ArrayList<>());
        return al;
    }
    void helperFunc(String s, int idx, List<List<String>> al, List<String> temp){
        if(idx == s.length()){
            al.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i < s.length(); i++){
            if(isPalin(s, idx, i)){
                temp.add(s.substring(idx, i+1));
                helperFunc(s, i + 1, al, temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    boolean isPalin(String s, int i, int j){
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }
}