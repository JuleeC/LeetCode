class Solution {
    public int findKthNumber(int n, int k) {
        long prefix = 1;
        k--;

        while (k > 0) {
            long subtreeSize = 0;
            long current = prefix;
            long next = prefix + 1;


    }
}