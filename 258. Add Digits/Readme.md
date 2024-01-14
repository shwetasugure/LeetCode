# Add Digits

Given a non-negative integer `num`, repeatedly add its digits until the result is a single digit.

## Solution Overview

The provided Java code defines a class with a method, `addDigits`, which calculates the sum of the digits of a number until a single digit is obtained.

### Algorithm:

1. Check if the input `num` is already a single digit (0-9). If yes, return the number.
2. Use a while loop to repeatedly sum the digits of the number.
3. For each iteration, extract the last digit (`rem`) and add it to the running sum.
4. Update `num` by removing the last digit.
5. If `num` becomes 0 and the sum is still more than 9, set `num` to the sum and reset the sum to 0.
6. Return the final sum, which is guaranteed to be a single digit.

### Time and Space Complexity

- **Time Complexity:** O(log n), where n is the value of the input number. The algorithm involves repeatedly dividing the number by 10.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.


# Solution 2
## Solution Overview

The provided Java code defines a class with a method, `addDigits`, which calculates the digital root of a number.

### Algorithm:

1. Check if the input `num` is zero. If yes, return 0.
2. Check if `num` is divisible evenly by 9. If yes, return 9.
3. If neither of the above conditions is met, return the remainder of `num` divided by 9.

### Time and Space Complexity

- **Time Complexity:** O(1). The algorithm involves simple arithmetic operations.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.

# Solution 3
## Solution Overview

The provided Python code defines a class with a method, `addDigits`, which calculates the sum of the digits of a number until a single digit is obtained.

### Algorithm:

1. Use a while loop to repeatedly sum the digits of the number until it becomes a single digit.
2. For each iteration, extract the last digit (`r`) and add it to the running sum.
3. Update `num` by removing the last digit.
4. Continue the loop until `num` becomes less than or equal to 9.
5. Return the final sum, which is guaranteed to be a single digit.

### Time and Space Complexity

- **Time Complexity:** O(log n), where n is the value of the input number. The algorithm involves repeatedly dividing the number by 10.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
