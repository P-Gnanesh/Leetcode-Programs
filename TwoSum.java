class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Hash map to store the number and its index
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of the complement and the current number
                return new int[] {map.get(complement), i};
            }
            
            // Otherwise, store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // No solution should be found according to the problem statement
        throw new IllegalArgumentException("No solution found");
    }
}
