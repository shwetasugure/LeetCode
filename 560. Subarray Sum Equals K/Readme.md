# Subarray Sum Equals K

Given an array of integers `nums` and an integer `k`, return the total number of continuous subarrays whose sum equals to `k`.

## Solution Overview

The provided Java code defines a class with a method, `subarraySum`, which calculates the total number of subarrays whose sum equals `k`.

### Algorithm:

1. Iterate through each element in the array.
2. For each element, calculate the sum of all possible subarrays starting from that element.
3. If the sum equals `k`, increment the count.
4. Return the total count.

### Time and Space Complexity

- **Time Complexity:** O(n^2), where n is the length of the input array `nums`. The algorithm has nested loops to calculate subarray sums.
- **Space Complexity:** O(1). The algorithm uses constant space.
