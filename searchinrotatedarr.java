class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // If target is found, return its index
            if (nums[mid] == target) {
                return mid;
            }

            // If the left part is sorted
            if (nums[left] <= nums[mid]) {
                // Check if target lies in the left sorted part
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;  // Search in the left part
                } else {
                    left = mid + 1;   // Search in the right part
                }
            }
            // If the right part is sorted
            else {
                // Check if target lies in the right sorted part
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;  // Search in the right part
                } else {
                    right = mid - 1; // Search in the left part
                }
            }
        }

        // If the target is not found
        return -1;
    }
}
