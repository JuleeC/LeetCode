class Solution {
    static public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < 10; i++)
            helper(i, n, ans);
        return ans;
    }

    static void helper(int prod, int n, List<Integer> ans) {
        if (prod > n) return;
        ans.add(prod);
        for (int j = 0; j < 10; j++) {
            helper(prod * 10 + j, n, ans);
        }
    }
}