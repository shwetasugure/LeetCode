# Rotate Image

You are given an `n x n` 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

## Solution Overview

The provided Java code defines a class with a method, `rotate`, which rotates an image represented by a 2D matrix by 90 degrees clockwise.

### Algorithm:

1. Transpose the matrix by swapping matrix[i][j] with matrix[j][i].
2. Reverse each row of the transposed matrix.

### Time and Space Complexity

- **Time Complexity:** O(n^2), where n is the number of rows (or columns) in the matrix. The algorithm performs two passes through the matrix.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
