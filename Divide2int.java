class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) != (divisor < 0);

        // Work with absolute values to simplify the logic
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int quotient = 0;

        // Perform division using bit shifting
        while (absDividend >= absDivisor) {
            long temp = absDivisor, multiple = 1;

            // Double the divisor using left shift until it is larger than the dividend
            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest multiple of divisor
            absDividend -= temp;
            quotient += multiple;
        }

        // Apply the sign to the quotient
        return negative ? -quotient : quotient;
    }
}
