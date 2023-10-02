class Solution {
    public boolean winnerOfGame(String colors) {
        int alice = 0, bob = 0;

        char ch[] = colors.toCharArray();

        for(int i = 1; i < ch.length-1; i++){
            if(ch[i-1] == 'A' && ch[i] == 'A' && ch[i+1] == 'A'){
                alice++;
            }
            else if(ch[i-1] == 'B' && ch[i] == 'B' && ch[i+1] == 'B'){
                bob++;
            }
        }
        // if(alice > 0 && bob == 0)
        //     return true;
        // else if(bob > 0 && alice == 0)
        //     return false;
        if(alice == bob)
            return false;
        return alice >= bob;
    }
}