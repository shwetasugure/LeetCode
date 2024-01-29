# Majority Element

Given an array `nums` of size n, return the majority element, which is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

## Solution Overview

The provided Java code defines a class with a method, `majorityElement`, which finds the majority element in an array.

### Algorithm:

1. Sort the array.
2. Return the element at index `n / 2` as it is guaranteed to be the majority element.

### Time and Space Complexity

- **Time Complexity:** O(n log n), where n is the length of the input array. The algorithm sorts the array.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.

