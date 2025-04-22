class Solution {
    int MOD = 1000000007;
    int[][] cnt = new int[10001][14];
    int[][] comb = new int[10001][14];

    public Solution() {
        for (int s = 0; s < 10001; s++) {
            for (int r = 0; r <= Math.min(s, 13); r++) {
