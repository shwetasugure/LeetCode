# Missing Number

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

## Solution Overview

The provided Java code defines a class with a method, `missingNumber`, which calculates the missing number from an array containing n distinct numbers.

## Solution 1:
### Algorithm:

1. Initialize variables `xor1` and `xor2` to perform bitwise XOR operations.
2. Iterate through the array to calculate the XOR of elements up to n (stored in `xor1`) and the XOR of array elements (stored in `xor2`).
3. XOR the result of `xor1` and `xor2` to find the missing number.

### Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input array. The algorithm iterates through the array once.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.

## Solution 2:
### Algorithm:

1. Calculate the sum of elements in the array (`a`).
2. Calculate the expected sum of numbers from 0 to n using the formula `n * (n + 1) / 2` (`b`).
3. Return the difference between the expected sum and the actual sum, which represents the missing number.

### Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input array. The algorithm involves calculating the sum of elements.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.

