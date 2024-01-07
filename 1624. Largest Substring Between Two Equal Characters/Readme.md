# Largest Substring Between Two Equal Characters
The provided Java code defines a class with a method, `maxLengthBetweenEqualCharacters`, which calculates the maximum distance between two equal characters in a given string.
## Explaination:
### Initialization:
   - `ans` is initialized to -1, representing the maximum distance between equal characters found so far.
   - `n` is the length of the input string `s`.
### Nested Loop:
   - Two nested loops iterate through pairs of indices (left and right) in the string.
   - The outer loop (`left`) iterates from the beginning of the string to its end.
### Equality Check:
   - For each pair of indices, it checks if the characters at those positions are equal (`s.charAt(left) == s.charAt(right)`).

### Update Maximum Distance:
   - If the characters are equal, it updates `ans` by taking the maximum of its current value and the distance between the two indices (`right - left - 1`).

### Result:
   - After the loops complete, the final value of `ans` represents the maximum distance between equal characters in the string.

## Time Complexity:
   - O(n^2), where n is the length of the input string. The algorithm uses two nested loops to compare pairs of indices.

## Space Complexity:
   - O(1). The algorithm uses a constant amount of extra space regardless of the input size.

![image](https://github.com/shwetasugure/LeetCode/assets/107701519/9909792b-294f-44a1-be24-21f74875e313)
