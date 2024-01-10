# Spiral Order Matrix

Given a 2D matrix, return its elements in spiral order.

## Solution Overview

The provided Java code defines a class with a method, `spiralOrder`, which traverses the matrix in a spiral order and returns the elements as a list.

### Algorithm:
**Initialization:**
- Initialize variables for top, bottom, left, and right boundaries of the matrix.
- Initialize an ArrayList called result to store the elements in spiral order.

**Spiral Traversal:**

- Use a while loop to continue traversal while top is less than or equal to bottom and left is less than or equal to right.
- Traverse the top row from left to right, adding elements to the result list.
- Increment the top boundary.
- Traverse the right column from top to bottom, adding elements to the result list.
- Decrement the right boundary.
- Check if there are more rows to traverse (top is still less than or equal to bottom), then traverse the bottom row from right to left.
- Decrement the bottom boundary.
- Check if there are more columns to traverse (left is still less than or equal to right), then traverse the left column from bottom to top.
- Increment the left boundary.

**Result:**
The while loop continues until all elements are traversed in a spiral order.

### Time and Space Complexity

- **Time Complexity:** O(m * n), where m is the number of rows and n is the number of columns in the matrix. The algorithm iterates through each element once.
- **Space Complexity:** O(m * n), where m is the number of rows and n is the number of columns in the matrix. The result list stores all matrix elements.

