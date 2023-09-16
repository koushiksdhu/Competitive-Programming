class Solution {
    public boolean canWinNim(int n) {
    //    for(int i = 0; n > 0; i++){
    //        if (i % 2 == 0){
    //            if(n <= 3)
    //                 return true;
    //        }
    //        else{
    //             if(n <= 3)
    //                 return false;
                
    //        }
    //        n -= 3;
    //    }
    //    return true;
    return !(n % 4 == 0);
    }
}