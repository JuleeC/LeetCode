class Solution {

    public int numberOfArrays(int[] differences, int lower, int upper) {
        int x = 0, y = 0, dummy = 0;
        for (int i : differences) {
            dummy += i;
            x = Math.min(x, dummy);
            y = Math.max(y, dummy);
            if (y - x > upper - lower) {
                return 0;
            }
        }
        return (upper - lower) - (y - x) + 1;
    }
}