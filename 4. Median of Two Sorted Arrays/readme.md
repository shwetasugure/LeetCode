# Median of Two Sorted Arrays

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the median of the two sorted arrays.


## Solution 1:

The provided Java code defines a class with a method, `findMedianSortedArrays`, which calculates the median of two sorted arrays.

### Algorithm:

1. Merge the two sorted arrays into a new array.
2. Calculate the median based on the merged array.

### Time and Space Complexity

- **Time Complexity:** O(m + n), where m and n are the lengths of the input arrays `nums1` and `nums2`. The algorithm iterates through both arrays during the merging process.
- **Space Complexity:** O(m + n). The algorithm uses additional space for the merged array.

## Solution 2
The provided Java code defines a class with a method, `findMedianSortedArrays`, which calculates the median of two sorted arrays.

### Algorithm:

1. Merge the two sorted arrays into a new array.
2. Sort the merged array.
3. Calculate the median based on the sorted array.

### Time and Space Complexity

- **Time Complexity:** O((m + n) log(m + n)), where m and n are the lengths of the input arrays `nums1` and `nums2`. The algorithm involves merging and sorting the arrays.
- **Space Complexity:** O(m + n). The algorithm uses additional space for the merged array.
