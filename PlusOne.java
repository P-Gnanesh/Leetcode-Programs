class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the digits from the last one to the first
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Otherwise, set the current digit to 0 and continue to carry the 1
            digits[i] = 0;
        }

        // If we exit the loop, it means all digits were 9 and we need to add an additional 1 at the beginning
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
