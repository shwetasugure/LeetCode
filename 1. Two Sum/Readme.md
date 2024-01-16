# Two Sum
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

## Solution Overview

The provided Java code defines a class with a method, `twoSum`, which finds the indices of two numbers in an array that add up to the target.

### Algorithm:

1. Use nested loops to iterate through all pairs of elements in the array.
2. Check if the sum of the current pair equals the target.
3. If a pair is found, store their indices in the result array.

### Time and Space Complexity

- **Time Complexity:** O(n^2), where n is the length of the input array. The algorithm involves nested loops to check all pairs.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.

