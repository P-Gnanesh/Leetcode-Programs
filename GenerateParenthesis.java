class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(n, 0, 0, "", result);
        return result;
    }

    private void generateParenthesisHelper(int n, int open, int close, String current, List<String> result) {
        // Base case: If the current string has n opening and n closing parentheses, it's a valid combination
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // If we can still add an opening parenthesis, add it
        if (open < n) {
            generateParenthesisHelper(n, open + 1, close, current + "(", result);
        }

        // If we can add a closing parenthesis (i.e., there are more opening parentheses than closing parentheses), add it
        if (close < open) {
            generateParenthesisHelper(n, open, close + 1, current + ")", result);
        }
    }
}
