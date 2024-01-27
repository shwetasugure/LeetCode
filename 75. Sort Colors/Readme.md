# Sort Colors

Given an array `nums` with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

## Solution Overview

The provided Java code defines a class with a method, `sortColors`, which sorts an array containing objects of three different colors.

### Algorithm:

1. Count the occurrences of each color (0, 1, and 2) in the array.
2. Overwrite the original array with the sorted colors based on the counts.

### Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input array. The algorithm iterates through the array twice.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
