# First Unique Character in a String

Given a string `s`, find the first non-repeating character and return its index. If it does not exist, return -1.

## Solution Overview

The provided Java code defines a class with a method, `firstUniqChar`, which finds the index of the first non-repeating character in the given string.

### Algorithm:

1. Iterate through each character in the string.
2. For each character, check if it is unique by comparing it with other characters in the string.
3. If a unique character is found, return its index.
4. If no unique character is found, return -1.

### Time and Space Complexity

- **Time Complexity:** O(n^2), where n is the length of the input string `s`. The algorithm has nested loops to check the uniqueness of each character.
- **Space Complexity:** O(1). The algorithm uses constant space.
