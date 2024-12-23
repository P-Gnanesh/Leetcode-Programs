class Solution {
    public boolean isValid(String s) {
        // Create a stack to hold the opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Traverse through each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If the character is a closing bracket, check if it matches the top of the stack
            else if (c == ')' || c == '}' || c == ']') {
                // If the stack is empty or the top of the stack doesn't match, return false
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // If the stack is empty, return true (all brackets matched)
        return stack.isEmpty();
    }
}
