class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < licensePlate.length(); i++) {
            if(Character.isLetter(licensePlate.charAt(i)))
                sb.append(licensePlate.charAt(i));
        }
        String temp = sb.toString().toLowerCase();        
        for(int i = 0; i < words.length; i++) {
            HashMap<Character, Integer> hm = new HashMap<>();
            for(int j = 0; j < words[i].length(); j++) 
                hm.put(words[i].charAt(j), hm.getOrDefault(words[i].charAt(j), 0) + 1);
            
            for(int k = 0; k < temp.length(); k++) {
                if(hm.containsKey(temp.charAt(k)) && hm.get(temp.charAt(k)) > 0)
                    hm.put(temp.charAt(k), hm.get(temp.charAt(k)) - 1);
                else
                    break;
                if(k == temp.length() - 1)
                    return words[i];
            }
            
            }
        return "";
    }
}