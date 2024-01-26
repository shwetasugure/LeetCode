# Set Matrix Zeroes

Given an `m x n` matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

## Solution 1:
### Solution Overview

The provided Java code defines a class with a method, `setZeroes`, which modifies a matrix in-place by setting rows and columns to zero based on the presence of zero elements.

### Algorithm:

1. Create boolean arrays `zeroRow` and `zeroCol` to track rows and columns containing zero elements.
2. Iterate through the matrix to mark rows and columns with zero elements.
3. Update the matrix by setting rows and columns to zero based on the boolean arrays.

### Time and Space Complexity

- **Time Complexity:** O(m * n), where m and n are the dimensions of the matrix. The algorithm iterates through the entire matrix.
- **Space Complexity:** O(m + n). The algorithm uses additional space to store boolean arrays for zero rows and columns.

- ## Solution 2:
### Solution Overview

The provided Java code defines a class with a method, `setZeroes`, which modifies a matrix in-place by setting rows and columns to zero based on the presence of zero elements.

### Algorithm:

1. Create arrays `row` and `col` to track rows and columns containing zero elements.
2. Iterate through the matrix to mark rows and columns with zero elements.
3. Update the matrix by setting rows and columns to zero based on the arrays.
4. Optional: Print the modified matrix.

### Time and Space Complexity

- **Time Complexity:** O(m * n), where m and n are the dimensions of the matrix. The algorithm iterates through the entire matrix.
- **Space Complexity:** O(m + n). The algorithm uses additional space to store arrays for zero rows and columns.

