class Solution {
    public int maxDifference(String s, int k) {
        int length = s.length();
        int result = Integer.MIN_VALUE;

        for (int first = 0; first < 5; first++) {
            for (int second = 0; second < 5; second++) {
                if (first == second) continue;


}