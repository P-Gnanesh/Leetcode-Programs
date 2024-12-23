class Solution {
    public String longestCommonPrefix(String[] strs) {
        // If the array is empty, return an empty string
        if (strs.length == 0) {
            return "";
        }
        
        // Start with the first string as the prefix
        String prefix = strs[0];
        
        // Compare the prefix with each of the strings in the array
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the beginning of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        // Return the longest common prefix
        return prefix;
    }
}
