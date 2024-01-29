# Ones Minus Zeros

Given a 2D grid `grid` consisting of 0s and 1s, return a new grid representing the difference between the count of 1s and 0s for each row and each column.

## Solution Overview

The provided Java code defines a class with a method, `onesMinusZeros`, which calculates the difference between the count of 1s and 0s for each row and each column in a 2D grid.

### Algorithm:

1. Iterate through the grid, count the number of 1s and 0s for each row and each column.
2. Update each cell in the grid with the calculated difference.

### Time and Space Complexity

- **Time Complexity:** O(m * n), where m and n are the dimensions of the input grid. The algorithm iterates through the entire grid.
- **Space Complexity:** O(m + n). The algorithm uses additional space to store arrays for row and column differences.

