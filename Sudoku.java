/*
Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

A partially filled sudoku which is valid.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
*/

class Sudoku {
    public boolean isValidSudoku(char[][] board) {
        short[] rows = new short[board.length];
        short[] cols = new short[board.length];
        short[] squares = new short[board.length];
        
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board.length; col++){
                if(board[row][col]=='.') continue;
                
                short value = (short)(1<<(board[row][col]-'1'));
                
                if((value & rows[row])>0) return false;
                if((value & cols[col])>0) return false;
                if((value & squares[3*(row/3)+col/3])>0) return false;
                
                rows[row]|=value;
                cols[col] |=value;
                squares[3*(row/3)+col/3] |=value;
            }
        }
        return true;
    }
}