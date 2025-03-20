class Solution {
    public boolean isValidSudoku(char[][] board) {

        //look if there are same numbers within one row
        for(int row = 0; row < 9; row++) {
            Set<Character> seen_row = new HashSet<>();
            //iterate through a row to check if there are duples



        return true;
    }
}
