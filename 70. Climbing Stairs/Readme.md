# Climbing Stairs

You are climbing a staircase. It takes `n` steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

## Solution Overview

The provided Java code defines a class with a method, `climbStairs`, which calculates the number of distinct ways to climb a staircase with `n` steps.

### Algorithm:

1. Use a loop to iterate through the steps, updating the variables `first`, `second`, and `nextterm`.
2. Calculate the next term by adding `first` and `second`.
3. Update the variables for the next iteration.

### Time and Space Complexity

- **Time Complexity:** O(n), where n is the number of steps. The algorithm iterates through the steps once.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
