# Maximum Subarray Sum

Given an integer array `nums`, find the contiguous subarray (containing at least one number) that has the largest sum and return its sum.

## Solution Overview

The provided Java code defines a class with a method, `maxSubArray`, which finds the maximum sum of a contiguous subarray.

### Algorithm:

1. **Initialize variables:** `sum` and `maxSum` to track the running sum and the maximum sum, both initially set to `0`.
2. **Iterate through the array:**
   - Add the current element to the `sum`.
   - If the `sum` becomes greater than the `maxSum`, update `maxSum`.
   - If the `sum` becomes negative, reset it to `0`.
3. **Result:**
   - After iterating through the entire array, `maxSum` contains the maximum sum of a contiguous subarray.


### Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input array `nums`. The algorithm iterates through the entire array.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
