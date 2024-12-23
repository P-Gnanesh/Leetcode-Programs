class Solution {
    public int romanToInt(String s) {
        // Map of Roman numerals to their respective integer values
        int[] romanValues = new int[128];  // To hold ASCII values of Roman characters
        
        romanValues['I'] = 1;
        romanValues['V'] = 5;
        romanValues['X'] = 10;
        romanValues['L'] = 50;
        romanValues['C'] = 100;
        romanValues['D'] = 500;
        romanValues['M'] = 1000;
        
        int total = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Get the current value and the next value (if any)
            int current = romanValues[s.charAt(i)];
            int next = (i + 1 < s.length()) ? romanValues[s.charAt(i + 1)] : 0;
            
            // If the current value is less than the next value, subtract the current value
            if (current < next) {
                total -= current;
            } else {
                // Otherwise, add the current value
                total += current;
            }
        }
        
        return total;
    }
}
