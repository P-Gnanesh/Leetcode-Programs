class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int sign = x < 0 ? -1 : 1;  // Check the sign of the number
        x = Math.abs(x);  // Work with the absolute value of x
        
        while (x != 0) {
            int digit = x % 10;  // Get the last digit of x
            x /= 10; 
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; 
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;  
            }
            
            reversed = reversed * 10 + digit; 
        }
        
        return sign * reversed; 
    }
}
