class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            hm.put(list1[i], hm.getOrDefault(list1[i], 0) + i);
        }
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < list2.length; i++){
            if(hm.containsKey(list2[i])){
                hm.put(list2[i], hm.getOrDefault(list2[i], 0) + i);
                al.add(list2[i]);
            }
        }

        int min = (1<<31)-1;
        for(String s : al){
            if(hm.get(s) < min)
                min = hm.get(s);
        }
        
        for(String s : al){
            if(hm.get(s) != min)
                al.set(al.indexOf(s), "0");
        }

        int n = 0;
        for(String s : al){
             if(!s.equals("0"))
                n++;
        }
        String str[] = new String[n];
        int i = 0;
        for(String s : al){
            if(!s.equals("0"))
                str[i++] = s;
        }
        return str;
    }
}