class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sTemp = new StringBuilder();
        StringBuilder tTemp = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#' && sTemp.length() > 0){
                sTemp.deleteCharAt(sTemp.length()-1);
            }
            else if(s.charAt(i) != '#')
                sTemp.append(s.charAt(i));
        }
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == '#' && tTemp.length() > 0){
                tTemp.deleteCharAt(tTemp.length()-1);
            }
            else if(t.charAt(i) != '#')
                tTemp.append(t.charAt(i));
        }
        return sTemp.toString().equals(tTemp.toString());
    }
}