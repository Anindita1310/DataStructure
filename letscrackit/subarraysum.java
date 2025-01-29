///Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

//A subarray is a contiguous non-empty sequence of elements within an array.

 

//Example 1:

//Input: nums = [1,1,1], k = 2
//Output: 2
//Example 2:

//Input: nums = [1,2,3], k = 3
//Output: 2








class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        // Iterate over all possible starting points of subarrays
        for (int i = 0; i < nums.length; i++) {
            int sum = 0; // Initialize sum for the current subarray

            // Iterate over all possible ending points of subarrays
            for (int j = i; j < nums.length; j++) {
                sum += nums[j]; // Add the current element to the sum

                // Check if the current sum equals k
                if (sum == k) {
                    count++; // Increment the count if the sum equals k
                }
            }
        }

        return count; // Return the total count of subarrays that sum to k
    }
}
