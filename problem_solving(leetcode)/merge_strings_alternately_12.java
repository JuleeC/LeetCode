class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1_l = word1.length();
        int word2_l = word2.length();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < Math.max(word1_l,word2_l); i++) {
            if(i < word1_l) {
                res.append(word1.charAt(i));

    }
}