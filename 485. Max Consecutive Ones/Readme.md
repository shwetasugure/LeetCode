# Max Consecutive Ones
Given a binary array `nums`, return the maximum number of consecutive 1's in the array.

## Solution Overview

The provided Java code defines a class with a method, `findMaxConsecutiveOnes`, which calculates the maximum number of consecutive 1's in a binary array.

### Algorithm:

1. Initialize variables `count` and `max1` to keep track of the consecutive ones and the maximum count.
2. Iterate through the array and update the count when encountering a 1.
3. When encountering a 0, update the `max1` with the current count if it is greater.
4. Return the maximum count.

### Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input array. The algorithm iterates through the array once.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
