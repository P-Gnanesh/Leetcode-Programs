class Solution {
    public String countAndSay(int n) {
        // Base case
        String result = "1";
        
        // Build the sequence iteratively for each n
        for (int i = 2; i <= n; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;
            char prev = result.charAt(0);
            
            // Traverse the current result string
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == prev) {
                    count++; // If the same character, increment the count
                } else {
                    // Append the count and the previous character to the next string
                    next.append(count).append(prev);
                    prev = result.charAt(j); // Update the previous character
                    count = 1; // Reset count to 1 for the new character
                }
            }
            
            // After the loop, we need to append the last group
            next.append(count).append(prev);
            
            // Update the result to be the next sequence
            result = next.toString();
        }
        
        return result;
    }
}
