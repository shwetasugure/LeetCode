# House Robber

The goal is to maximize the total amount of money that can be robbed from a row of houses, where no two adjacent houses can be robbed.

## Solution Overview

The provided Java code defines a class with a method, `rob`, which uses dynamic programming to solve the "House Robber" problem.

### Base Cases:

- If there are no houses (length `n` is 0), the total amount that can be robbed is 0.
- If there is only one house (length `n` is 1), the total amount that can be robbed is the value of that single house.

### Dynamic Programming Loop:

- Initialize two variables, `prev` and `curr`, to keep track of the maximum amount of money that can be robbed up to the previous house and the current house, respectively.

### Loop through Houses:

- Iterate through the houses using a for loop.
- For each house, calculate a temporary variable `temp` to store the current value of `curr`.
- Update `curr` to be the maximum between the sum of `prev` and the current house value (`prev + nums[i]`) and the current `curr`.
- Update `prev` to the previous value of `curr` stored in `temp`.

### Result:

- After the loop completes, the final value of `curr` represents the maximum amount of money that can be robbed from the row of houses.

## Time and Space Complexity

- **Time Complexity:** O(n), where n is the number of houses. The algorithm iterates through the houses once.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.

