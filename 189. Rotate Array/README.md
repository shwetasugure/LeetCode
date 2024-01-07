# Rotate Array

## Purpose:
The code rotates an array to the right by a specified number of steps using in-place operations.

## Algorithm:
It employs a three-step reversal algorithm -
 1. First, the entire array is reversed,
 2. Then the subarray before the rotation point is reversed.
 3. Then the subarray after the rotation point is reversed.

## Time Complexity: 
O(n), where n is the length of the array. The algorithm consists of three array reversal operations, each taking O(n/2) time, but constants are dropped, resulting in a linear time complexity.

## Space Complexity:
O(1). The rotations are performed in-place without using additional space that scales with the size of the input array.

![image](https://github.com/shwetasugure/LeetCode/assets/107701519/8a70b93b-c70c-460a-a689-6a01d4fa2dbd)







