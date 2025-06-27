class Solution {
    public String longestSubsequenceRepeatedK(String s, int k)
    {

        char[] chars = s.toCharArray();
        int len = chars.length;

        int[] freq = new int[26];
        for (int i = 0; i < len; i++) {
            freq[chars[i] - 'a']++;
