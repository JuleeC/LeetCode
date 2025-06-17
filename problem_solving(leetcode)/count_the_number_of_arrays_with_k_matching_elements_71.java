class Solution {
    public int countGoodArrays(int n, int m, int k) {
        if (fact[0] == 0)
            fact[0] = 1;
        long res = m * fastExp(m - 1, n - 1 - k) % MOD * combination(n - 1, n - 1 - k) % MOD;
        return (int) res;

}