class Solution {
    public int lengthOfLastWord(String s) {
        // Trim trailing spaces
        s = s.trim();
        
        // Find the last word by splitting the string by spaces
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // The length of the last word is the difference between the length of the string
        // and the index of the last space.
        return s.length() - lastSpaceIndex - 1;
    }
}
