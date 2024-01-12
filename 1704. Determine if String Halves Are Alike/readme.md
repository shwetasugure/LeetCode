# Halves Are Alike

Given a string `s`, determine if the two halves of the string have the same number of vowels. The comparison is case-insensitive.

## Solution Overview

The provided Java code defines a class with a method, `halvesAreAlike`, which checks if the two halves of the string have an equal number of vowels.

### Algorithm:

1. Convert the input string to lowercase for case-insensitivity.
2. Initialize counters `count1` and `count2` to track the number of vowels in the first and second halves of the string.
3. Iterate through the first half of the string and increment `count1` for each vowel.
4. Iterate through the second half of the string and increment `count2` for each vowel.
5. Return `true` if `count1` equals `count2`, indicating an equal number of vowels in both halves.

### Time and Space Complexity

- **Time Complexity:** O(n), where n is the length of the input string. The algorithm iterates through each character of the string.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.

