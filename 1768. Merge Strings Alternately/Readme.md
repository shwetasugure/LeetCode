# Merge Alternately

Given two strings `word1` and `word2`, merge the strings alternatively, starting with `word1`. If one string is longer than the other, append the remaining characters.

## Solution Overview

The provided Java code defines a class with a method, `mergeAlternately`, which merges two strings alternatively.

### Algorithm:

1. Initialize a StringBuilder `ans` to store the merged result.
2. Initialize pointers `i` and `j` for `word1` and `word2` respectively.
3. Use a while loop to iterate until both pointers reach the end of their respective strings.
4. If either pointer reaches the end, append the remaining characters from the other string.
5. If both pointers are within the bounds, append characters alternatively.

### Time and Space Complexity

- **Time Complexity:** O(max(len1, len2)), where `len1` and `len2` are the lengths of `word1` and `word2` respectively.
- **Space Complexity:** O(max(len1, len2)). The algorithm uses a StringBuilder to store the merged result.
