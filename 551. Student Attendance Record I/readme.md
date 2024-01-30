# Check Record

You are given a string `s` representing the attendance record of a student. The record only contains the following three characters:

- 'A' : Absent.
- 'L' : Late.
- 'P' : Present.

A student could be rewarded if his attendance record doesn't contain more than two 'A' (absent) or more than three continuous 'L' (late).

Return `true` if the student could be rewarded according to the given rules, and `false` otherwise.

## Solution Overview

The provided Java code defines a class with a method, `checkRecord`, which checks if a student could be rewarded based on the given attendance record.

### Algorithm:

1. Iterate through the attendance record and maintain counts for 'A' and continuous 'L'.
2. Return `false` if there are more than two 'A' or more than three continuous 'L', otherwise return `true`.

### Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input string `s`. The algorithm iterates through the entire attendance record.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
