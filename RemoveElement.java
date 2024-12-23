class Solution {
    public int removeElement(int[] nums, int val) {
        // Pointer to track where to put the next valid element
        int i = 0;

        // Traverse the array with pointer j
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                // If nums[j] is not equal to val, place it at index i
                nums[i] = nums[j];
                i++; // Increment i to track the next position for a valid element
            }
        }

        // Return the number of elements not equal to val
        return i;
    }
}
