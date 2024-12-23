class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1;  // Pointer for string a
        int j = b.length() - 1;  // Pointer for string b
        int carry = 0;  // Carry variable
        
        // Loop until both strings are fully processed or there is no carry left
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i) - '0';  // Add digit from string a
                i--;
            }
            
            if (j >= 0) {
                sum += b.charAt(j) - '0';  // Add digit from string b
                j--;
            }
            
            result.append(sum % 2);  // Append the result bit (sum % 2)
            carry = sum / 2;  // Update the carry (sum / 2)
        }
        
        return result.reverse().toString();  // Reverse the result and convert to string
    }
}

