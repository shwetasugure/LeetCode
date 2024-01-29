# Find Intersection Values

## Problem Description

Given two arrays, `nums1` and `nums2`, return an array containing the count of common elements in both arrays. The result array should have two elements - the count of common elements in `nums1` and the count of common elements in `nums2`.

## Solution Overview

The provided Java code defines a class with a method, `findIntersectionValues`, which finds the count of common elements in two arrays.

### Algorithm:

1. Use nested loops to iterate through both arrays and count common elements.
2. Return an array containing the counts of common elements in `nums1` and `nums2`.

### Time and Space Complexity

- **Time Complexity:** O(m * n), where m and n are the lengths of `nums1` and `nums2` respectively. The algorithm involves nested loops.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.

## Usage

```java
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        // Implementation here
    }
}
