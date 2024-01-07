# Integer Break

Given an integer `n`, the task is to break it into positive integers and maximize the product of those integers.

## Solution Overview

The provided Java code defines a class with a method, `integerBreak`, which calculates the maximum product by breaking the input integer `n`.

### Breakdown:

- If `n` is less than or equal to 1, return 0 (no valid break).
- If `n` is 2, return 1 (break into two 1s).
- If `n` is 3, return 2 (break into two 1s and one 2).

### Iterative Break:

- For `n > 3`, the code iteratively breaks `n` into factors of 3.
- While `n > 4`, multiply the result by 3 and subtract 3 from `n`.
- After the loop, multiply the result by the remaining `n`.

## Time and Space Complexity

- **Time Complexity:** O(log n), where n is the input integer. The algorithm breaks down `n` into factors of 3.
- **Space Complexity:** O(1). The algorithm uses a constant amount of extra space regardless of the input size.
  
![image](https://github.com/shwetasugure/LeetCode/assets/107701519/27776217-48f5-496f-8e0a-ff23ab86239b)

