class Solution {
    public int bestClosingTime(String customers) {
        int countY = 0;
        for(int i = 0; i < customers.length(); i++){
            if(customers.charAt(i) == 'Y')
                countY++;
        }

        int minP = customers.length();
        int time = -1;
        int countN = 0;

        for(int i = 0; i < customers.length(); i++){
           int p = countY + countN;
           
            if (p < minP){
                minP = p;
                time = i;
            }

            if (customers.charAt(i) == 'N')
                countN++;
            else
                countY--;

        }
        if(countN < minP)
            time = customers.length();

        return time;
    }
}