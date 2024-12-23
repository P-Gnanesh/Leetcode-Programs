class Solution {
    public String convert(String s, int numRows) {
        // If numRows is 1, the result is just the string itself
        if (numRows == 1) {
            return s;
        }

        // Create a list to hold strings for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;      // Current row we're placing characters in
        boolean goingDown = false;  // Direction flag: true means going down, false means going up

        // Traverse the string and place each character in the appropriate row
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);  // Append the character to the current row

            // If we are at the top or bottom row, reverse the direction
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to the next row based on the direction
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into one string and return it
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
