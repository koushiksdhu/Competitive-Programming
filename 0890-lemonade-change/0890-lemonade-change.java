class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for(int i = 0; i < bills.length; i++){
            switch(bills[i]){
                case 5 : five++;
                        break;
                case 10: ten++;
                    if(five > 0)
                        five--;
                    else
                        return false;
                    break;
                case 20: if(ten > 0 && five > 0){
                            ten--;
                            five--;
                        }
                        else if(five > 2){
                            five -= 3;
                        }
                        else
                            return false;
                        break;
            }
        }
        return true;
    }
}