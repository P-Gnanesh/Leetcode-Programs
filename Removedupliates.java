class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array is empty, no unique elements exist
        if (nums.length == 0) {
            return 0;
        }

        // Pointer to track the position for unique elements
        int i = 0;

        // Start traversing from the second element
        for (int j = 1; j < nums.length; j++) {
            // If the current element is not equal to the last unique element
            if (nums[j] != nums[i]) {
                // Increment i and update the element at nums[i+1]
                i++;
                nums[i] = nums[j];
            }
        }

        // i + 1 is the count of unique elements
        return i + 1;
    }
}
