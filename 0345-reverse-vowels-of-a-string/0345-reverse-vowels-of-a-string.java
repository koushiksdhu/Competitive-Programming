class Solution {
    public String reverseVowels(String s) {
        StringBuilder vowel = new StringBuilder();
       for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
               vowel.append(s.charAt(i));
           }
       } 
        String v = vowel.reverse().toString();
        int j = 0;
      for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
               s = s.substring(0, i) + v.charAt(j++) + s.substring(i+1, s.length()); 
           }
       } 
       return s;
    }
}