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
            }
        }


        return true;
    }
}
