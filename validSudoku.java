#include <stdbool.h>

bool isValidSudoku(char** board, int boardSize, int* boardColSize) {
    // Create sets to track numbers in rows, columns, and sub-boxes
    bool rows[9][9] = {0};    // rows[i][j] means number (j+1) is used in row i
    bool cols[9][9] = {0};    // cols[i][j] means number (j+1) is used in column i
    bool boxes[9][9] = {0};   // boxes[i][j] means number (j+1) is used in box i
    
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            char num = board[i][j];
            
            if (num == '.') {
                continue;  // Skip empty cells
            }
            
            int n = num - '1';  // Convert char '1' to '9' to index 0 to 8
            int boxIndex = (i / 3) * 3 + (j / 3);  // Compute the sub-box index
            
            if (rows[i][n] || cols[j][n] || boxes[boxIndex][n]) {
                return false;  // If the number has already appeared in the row, column or sub-box, return false
            }
            
            // Mark the number as seen in the current row, column, and sub-box
            rows[i][n] = true;
            cols[j][n] = true;
            boxes[boxIndex][n] = true;
        }
    }
    
    return true;  // All checks passed
}
