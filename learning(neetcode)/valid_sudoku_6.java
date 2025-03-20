class Solution {
    public boolean isValidSudoku(char[][] board) {

        //look if there are same numbers within one row
        for(int row = 0; row < 9; row++) {
            Set<Character> seen_row = new HashSet<>();
            //iterate through a row to check if there are duples
            for(int i = 0; i < 9;i++) {

                if(board[row][i] == '.') continue;
                if(seen_row.contains(board[row][i])) return false;
                seen_row.add(board[row][i]);
            }
        }
        //look if there are same numbers within one column
        for(int col = 0; col < 9; col++) {
            Set<Character> seen_col = new HashSet<>();
            //iterate through a row to check if there are duples
            for(int i = 0; i < 9;i++) {
                if(board[i][col] == '.') continue;
                if(seen_col.contains(board[i][col])) return false;
                seen_col.add(board[i][col]);
            }
        }
        //check if in one box, there arent a set of the same numbers
        for(int nines = 0; nines < 9; nines++) {
            Set<Character> boxes = new HashSet<>();
            for(int i =0; i<3;i++) {
                for(int j = 0; j<3; j++) {
                    int row = (nines / 3) * 3 + i;
                    int col = (nines % 3) * 3 + j;
                    if(board[row][col]=='.') continue;
                    if(boxes.contains(board[row][col])) return false;
                    boxes.add(board[row][col]);
                }
            }
        }


        return true;
    }
}
