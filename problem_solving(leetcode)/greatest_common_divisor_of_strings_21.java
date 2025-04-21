class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if((str1 +str2).equals(str2+str1)) { }  else return "";


        int gcdLength = gcd_checker(str1.length(), str2.length());
        return str1.substring(0,gcdLength);

    }
    public int gcd_checker(int s1,int s2) {


    }
}