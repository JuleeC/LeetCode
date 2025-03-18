class Solution {
  public int romanToInt(String s) {
    int resolution = 0;
    int n = s.length();

      for (int i = 0; i < n; i++) {
          //get current value from roman number to an integer
          int currentVal = roman_handler(s.charAt(i));

          //check wether i is bigger or i+1 is bigger
          if (i < n - 1 && currentVal < getValue(s.charAt(i + 1))) {
              resolution -= currentVal;
          } else {
              resolution += currentVal;
          }
      }

      return resolution;
  }

    private int roman_handler(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}