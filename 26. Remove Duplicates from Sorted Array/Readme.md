# Remove Duplicates from Sorted Array

Given a sorted array `nums`, remove the duplicates in-place such that each unique element appears only once. Return the new length of the modified array.

## Solution Overview

The provided Java code defines a class with a method, `removeDuplicates`, which removes duplicates from a sorted array in-place and returns the new length.

### Algorithm:

- Initialize an index (`index`) at 1 to track the position where unique elements will be placed. We consider index as 1 at first as first element is always in place.
- Iterate through the array, and if the current element is less than the next element, update the array at the `index` with the next element.
- Increment `index` for each unique element encountered.

### Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input array. The algorithm iterates through the array once.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
