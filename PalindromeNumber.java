class Solution {
    public boolean isPalindrome(int x) {
        // Step 1: Negative numbers and numbers ending with 0 (but not 0) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversed = 0;
        
        // Step 2: Reverse the second half of the number
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        // Step 3: Compare the first half and the reversed second half
        // For odd-length numbers, we can ignore the middle digit by `x == reversed / 10`
        return x == reversed || x == reversed / 10;
    }
}
