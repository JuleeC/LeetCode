class Solution {
    public int maxDifference(String s, int k) {
        int length = s.length();
        int result = Integer.MIN_VALUE;

        for (int first = 0; first < 5; first++) {
            for (int second = 0; second < 5; second++) {
                if (first == second) continue;

                int[] diff = new int[length + 1];
                int[] parityA = new int[length + 1];
                int[] parityB = new int[length + 1];
                int[] countB = new int[length + 1];

                for (int i = 1; i <= length; i++) {
                    int digit = s.charAt(i - 1) - '0';
                    diff[i] = diff[i - 1] + (digit == first ? 1 : 0) - (digit == second ? 1 : 0);
                    parityA[i] = (parityA[i - 1] + (digit == first ? 1 : 0)) & 1;
                    parityB[i] = (parityB[i - 1] + (digit == second ? 1 : 0)) & 1;
                    countB[i] = countB[i - 1] + (digit == second ? 1 : 0);
                }


}