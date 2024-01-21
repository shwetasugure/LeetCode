# Check if Array is Sorted and Rotated

Given an array `nums`, return true if the array is sorted in non-decreasing order and can be rotated to become sorted.

## Solution Overview

The provided Java code defines a class with a method, `check`, which checks if the array is sorted in non-decreasing order and can be rotated to become sorted.

### Algorithm:

1. Iterate through the array and count the number of elements where the previous element is greater than the current element.
2. If the count is 0, the array is already sorted. Return true.
3. If the count is greater than 1, return false.
4. If the first element is greater than or equal to the last element, return true.

### Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input array. The algorithm iterates through the array once.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
