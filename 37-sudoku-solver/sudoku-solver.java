class Solution {
    static int check=0;
        public static boolean isVaild(char[][] board,int row,int col,char num){
        //chaeck row
        for(int i=0;i<9;i++){
            if(board[row][i]==num) return false;
        }
        // check column
        for(int j=0;j<9;j++){
        if(board[j][col]==num) return false;

        }
        // check the submatix find the sarting points

        int sRow=row/3*3;
        int sCol=col/3*3;
        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
    public void solve(char [][] board,int raw,int col){
        if(raw==9){
            check=1;
            return;
        }
        else if(board[raw][col]!='.'){
            if(col!=8) solve(board,raw,col+1);
            else solve(board,raw+1,0);
        }
        else{//board[raw][col]='.'
        for(char ch='1';ch<='9';ch++){
           if( isVaild(board,raw,col,ch)){
            board[raw][col]=ch;
            if(col!=8) solve(board,raw,col+1);
            else solve(board,raw+1,0);
            if(check==1) return;
            board[raw][col]='.';
           }
        }

        }
    }
    public void solveSudoku(char[][] board) {
      solve(board,0,0);
      check=0;  
    }
}