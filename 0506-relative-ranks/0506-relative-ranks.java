class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> arrCopy = new ArrayList<>();
        for(int i: score)
            arrCopy.add(i);
        Collections.sort(arrCopy);

        String str[] = new String[score.length];
        for(int i = 0; i < str.length; i++) {
            if(arrCopy.indexOf(score[i]) == str.length - 1)
                str[i] = "Gold Medal";
            else if(arrCopy.indexOf(score[i]) == str.length - 2)
                str[i] = "Silver Medal";
            else if(arrCopy.indexOf(score[i]) == str.length - 3)
                str[i] = "Bronze Medal";
            else
                str[i] = "" + (str.length - arrCopy.indexOf(score[i]));
        }
        return str;
    }
}