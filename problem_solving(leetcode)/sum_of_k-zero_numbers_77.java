class Solution {
    public long kMirror(int k, int n) {
        long s = 0;
        for (long l = 1; n > 0; l *= 10) {
            for (long i = l; n > 0 && i < l * 10; i++) {
                long p = gp(i, true);
                if (kp(p, k)) {
                    s += p;
                    n--;
                }
            }
            for (long i = l; n > 0 && i < l * 10; i++) {
                long p = gp(i, false);
                if (kp(p, k)) {
                    s += p;
                    n--;
                }
            }
        }
        return s;
