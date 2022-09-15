class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length != 9 || board[0].length != 9) return false;
        if(!validRows(board)) return false;
        if(!validColumns(board)) return false;
        for(int i =0; i<9; i+=3){
            for(int j =0; j<9; j+=3){
                if(!validSubBox(board, i, j)) return false;
            }
        }
        return true;
    }
    
    private boolean validRows(char[][] board){
        for(int i=0; i<9; i++){
            Set<Integer> nums = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j] == '.') continue;
                int num = (int)(board[i][j] - '0');
                if(nums.contains(num)) return false;
                nums.add(num);
            }
        }
        return true;
    }
    
    private boolean validColumns(char[][] board){
        for(int j=0; j<9; j++){
            Set<Integer> nums = new HashSet<>();
            for(int i=0; i<9; i++){
                if(board[i][j] == '.') continue;
                int num = (int)(board[i][j] - '0');
                if(nums.contains(num)) return false;
                nums.add(num);
            }
        }
        return true;
    }
    
    private boolean validSubBox(char[][] board, int i, int j){
         Set<Integer> nums = new HashSet<>();
        for(int k = i; k<i+3; k++){
            for(int l = j; l<j+3; l++){
                if(board[k][l] == '.') continue;
                int num = (int)(board[k][l] - '0');
                if(nums.contains(num)) return false;
                nums.add(num);
            }
        }
        return true;
    }
}