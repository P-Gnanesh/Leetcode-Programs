class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet to store characters in the current window
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0; // To track the maximum length of the substring
        int start = 0; // Left pointer of the window
        
        // Iterate through the string with the right pointer (end)
        for (int end = 0; end < s.length(); end++) {
            // If character is already in the set, move the start pointer
            while (charSet.contains(s.charAt(end))) {
                charSet.remove(s.charAt(start)); // Remove the character at the start
                start++; // Shrink the window from the left
            }
            charSet.add(s.charAt(end)); // Add the current character to the set
            maxLength = Math.max(maxLength, end - start + 1); // Update maxLength
        }
        
        return maxLength;
    }
}
