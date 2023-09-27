class Solution {
    public int minBitFlips(int start, int goal) {
        // String num1 = String.format("%32s", Integer.toBinaryString(start)).replaceAll(" ", "0");
        // String num2 = String.format("%32s", Integer.toBinaryString(goal)).replaceAll(" ", "0");
        // int count = 0;
        // for(int i = 0; i < num1.length(); i++){
        //     if(num1.charAt(i) != num2.charAt(i))
        //         count++;
        // }
        // return count;

        int count = 0;
        while(start > 0 || goal > 0){
            if(((start & 1)^(goal & 1)) == 1)
                count++;
            start >>= 1;
            goal >>= 1;
        }
        return count;
    }
}