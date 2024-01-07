# Search in 2D Matrix

Given a 2D matrix where each row is sorted in ascending order and the first element of each row is greater than the last element of the previous row, implement a method `searchMatrix` to determine if a target value exists in the matrix.

## Solution Overview

The provided Java code defines a class with a method, `searchMatrix`, which performs a search for the target value in the given 2D matrix.

### Iterative Search:

- The code iterates through each row of the matrix.
- For each row, it checks if the target value falls within the range of the row's first and last elements.

### Inner Loop:

- If the target is within the range of a row, the code iterates through the elements of that row to find the target.

### Result:

- If the target is found during the inner loop, the method returns `true`.
- If the entire matrix is searched and the target is not found, the method returns `false`.

## Time and Space Complexity

- **Time Complexity:** O(m + n), where m is the number of rows and n is the number of columns in the matrix. In the worst case, the code iterates through all elements of the matrix.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.

![image](https://github.com/shwetasugure/LeetCode/assets/107701519/1e4c62c7-500d-4983-ba07-b0ff95728347)

