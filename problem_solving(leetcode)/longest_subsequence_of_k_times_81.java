class Solution {
    public String longestSubsequenceRepeatedK(String s, int k)
    {

        char[] chars = s.toCharArray();
        int len = chars.length;

        int[] freq = new int[26];
        for (int i = 0; i < len; i++) {
            freq[chars[i] - 'a']++;
        }

        ArrayList<String>[] candidates = new ArrayList[8];
        candidates[1] = new ArrayList<>();
        String result = "";

        for (int i = 0; i < 26; i++)
        {
            if (freq[i] >= k)
            {
                String ch = "" + (char) ('a' + i);
                result = ch;
                candidates[1].add(ch);
            }
        }

        for (int length = 2; length < 8; length++)
        {
            candidates[length] = new ArrayList<>();
            for (String prefix : candidates[length - 1])
            {
                for (String suffix : candidates[1])
                {
                    String combo = prefix + suffix;
                    if (isRepeatedKTimes(chars, combo, k))
                    {
                        result = combo;
                        candidates[length].add(combo);
                    }
