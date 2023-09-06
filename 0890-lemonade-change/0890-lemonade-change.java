class Solution {
    public boolean lemonadeChange(int[] arr) {
        int fives = 0, tens = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 5)
                fives++;
            else if(arr[i] == 10){
                tens++;
                fives--;
            }
            else if(arr[i] == 20){
                if(tens > 0){
                    tens--;
                    fives--;
                }
                else
                    fives -= 3;
            }
            if(tens < 0 || fives < 0)
                return false;
        }
        return true;
    }
}