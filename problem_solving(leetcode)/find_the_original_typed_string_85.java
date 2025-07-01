class Solution {
    public int possibleStringCount(String word) {
        int length = word.length();
        int extras = 0;
        for (int i = 1; i < length; i++) {
            if (word.charAt(i - 1) == word.charAt(i)) extras++;
        }
        return extras + 1;
    }
}
