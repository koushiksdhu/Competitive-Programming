class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : score)
            al.add(i);
        Collections.sort(al, Collections.reverseOrder());
        ArrayList<String> str = new ArrayList<>();
        for(int i : score){
            if(al.indexOf(i)+1 == 1)
                str.add("Gold Medal");
            else if(al.indexOf(i)+1 == 2)
                str.add("Silver Medal");
            else if(al.indexOf(i)+1 == 3)
                str.add("Bronze Medal");
            else
                str.add(""+(al.indexOf(i)+1));
        }
        String arr[] = new String[str.size()];
        int i = 0;
        for(String s : str)
            arr[i++] = s;
        return arr;
    }
}