class Solution {
    public boolean isPalindrome(int x) {
          String s = String.valueOf(x);
          int n = s.length();

        for (int i=0; i<(n/2); i++) {
            //if the elements are from the beginning or the ending are not the same, we return false
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
    }
