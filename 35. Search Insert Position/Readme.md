# Binary Search for Insert Position

Given a sorted array of distinct integers and a target value, implement a method `searchInsert` to return the index if the target is found. If not, return the index where it would be if it were inserted in order.

## Solution Overview

The provided Java code defines a class with a method, `searchInsert`, which uses binary search to find the index of the target in a sorted array.

### Binary Search:

- Initialize `start` and `end` pointers to the beginning and end of the array, respectively.
- Iteratively narrow down the search range by calculating the middle index (`mid`).
- If the middle element equals the target, return the index.
- If the middle element is greater than the target, update `end` to `mid - 1`.
- If the middle element is less than the target, update `start` to `mid + 1`.

### Result:

- Continue the loop until the `start` pointer is greater than the `end` pointer.
- If the target is not found, return the `start` pointer, representing the index where the target should be inserted.

## Time and Space Complexity

- **Time Complexity:** O(log n), where n is the length of the array. Binary search reduces the search space by half in each iteration.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
![image](https://github.com/shwetasugure/LeetCode/assets/107701519/22f8f202-e5a8-476b-808c-8fcd5b43ab36)

