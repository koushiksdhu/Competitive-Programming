class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                board[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList<>();
        search(0, board, res);
        return res;
    }

    static void search(int col, char[][] board, List<List<String>> res){
        if(col == board.length){
            res.add(construct(board));
            return;
        }

        for(int row = 0; row < board.length; row++){
            if(validate(board, row, col)){
                board[row][col] = 'Q';
                search(col+1, board, res);
                board[row][col] = '.';
            }
        }
    }

    static boolean validate(char[][] board, int row, int col){
        int dupRow = row, dupCol = col;
        while(row >= 0 && col >= 0){        // diagonal checking - Up to 'Q'
            if(board[row][col] == 'Q')
                return false;
                row--;
                col--;
        }

        row = dupRow; col = dupCol;         // Horizontal Checking
        while(col >= 0){
            if(board[row][col] == 'Q')
                return false;
            col--;
        }

        row = dupRow; col = dupCol;
        while(col >= 0 && row < board.length){      // diagonal checking - 'Q' to Down
            if(board[row][col] == 'Q')
                return false;
            col--;
            row++;
        }
        return true;
    }

    static List<String> construct(char board[][]){
        List<String> res = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}