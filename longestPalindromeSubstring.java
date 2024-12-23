class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0; // Start index of the longest palindrome
        int maxLength = 1; // Maximum length of the palindrome found

        // Helper function to expand around center
        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd length palindrome (centered at i)
            int len1 = expandAroundCenter(s, i, i);
            // Case 2: Even length palindrome (centered between i and i+1)
            int len2 = expandAroundCenter(s, i, i + 1);
            
            // Get the maximum length palindrome found
            int len = Math.max(len1, len2);
            
            if (len > maxLength) {
                maxLength = len;
                start = i - (maxLength - 1) / 2;
            }
        }

        return s.substring(start, start + maxLength);
    }

    // Expand around the center and return the length of the palindrome
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Length of the palindrome is the difference between right and left
        return right - left - 1;
    }
}
