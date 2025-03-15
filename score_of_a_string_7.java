class Solution {
    public int scoreOfString(String s) {

        int ans = 0;
        for(int i = 0; i < s.length()-1; i++)  {
            if(s == "") return 0;
            ans += Math.abs((int)s.charAt(i) - (int)s.charAt(i+1));


        }
        return ans;
    }
}