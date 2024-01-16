# Single Number

Given an array of integers where every element appears twice except for one, find that single element.

## Solution Overview

The provided Java code defines a class with a method, `singleNumber`, which finds the single element in an array where every other element appears twice.

### Algorithm:

1. Sort the input array to group identical elements together.
2. Iterate through the sorted array in steps of 2.
3. Check if the current element is not equal to the next element. If true, return the current element.
4. If the loop completes without finding a single element, return the last element of the array.

### Time and Space Complexity

- **Time Complexity:** O(n log n), where n is the length of the input array. Sorting the array dominates the time complexity.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
