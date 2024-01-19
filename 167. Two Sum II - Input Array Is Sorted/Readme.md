# Two Sum II - Input array is sorted

Given an array of integers `numbers` that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.

## Solution Overview

The provided Java code defines a class with a method, `twoSum`, which finds two numbers in a sorted array that add up to the target.

### Algorithm:

1. Initialize two pointers, `l` at the beginning and `r` at the end of the array.
2. Use a while loop to iterate until `l` is less than `r`.
3. Calculate the sum of the elements at `l` and `r`.
4. If the sum equals the target, store the indices and break out of the loop.
5. If the sum is greater than the target, move the `r` pointer to the left.
6. If the sum is less than the target, move the `l` pointer to the right.

### Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input array. The algorithm involves a single pass through the array.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
