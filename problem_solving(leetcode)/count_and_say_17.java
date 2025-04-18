public class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String result = "1";

        for (int i = 2; i <= n; i++) {

            StringBuilder sb = new StringBuilder();
            int count = 1;
            char prevChar = result.charAt(0);

            for (int j = 1; j < result.length(); j++) {
                char currentChar = result.charAt(j);

                if (currentChar == prevChar) {
                    count++;
                } else {
                    sb.append(count).append(prevChar);
                    prevChar = currentChar;
                    count = 1;
                }
            }

            // Append the last group
            sb.append(count).append(prevChar);

            result = sb.toString(); // Prepare for next iteration
        }

        return result;
    }
}