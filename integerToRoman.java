class Solution {
    public String intToRoman(int num) {
        // Define the Roman numerals and their corresponding values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder result = new StringBuilder();
        
        // Iterate through the values and symbols
        for (int i = 0; i < values.length; i++) {
            // While num is greater than or equal to the current value, append the corresponding symbol
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        
        // Return the final Roman numeral
        return result.toString();
    }
}
