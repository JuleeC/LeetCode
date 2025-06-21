class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }

        int minDel = Integer.MAX_VALUE;
        for (int base = 0; base < 26; base++) {
            if (freq[base] == 0)
