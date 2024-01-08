# Range Sum of BST

Given the root of a binary search tree and integers low and high, return the sum of values of all nodes with a value in the range [low, high].

## Solution Overview

The provided Java code defines a class with a method, `rangeSumBST`, which recursively calculates the sum of node values within the specified range.

### Algorithm:

- If the current node is null, return 0.
- If the current node's value is within the range [low, high], include it in the sum and recursively traverse both left and right subtrees.
- If the current node's value is less than low, traverse only the right subtree.
- If the current node's value is greater than high, traverse only the left subtree.

### Time and Space Complexity

- **Time Complexity:** O(N), where N is the number of nodes in the tree. The algorithm traverses each node once.
- **Space Complexity:** O(H), where H is the height of the tree. The space complexity is based on the maximum depth of the recursive call stack.
![image](https://github.com/shwetasugure/LeetCode/assets/107701519/ef17eb79-8267-4847-ba69-4c32b960b1d8)

