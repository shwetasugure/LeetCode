# Kth Missing Positive Number
The code defines a Java class with a method, findKthPositive, that aims to find the kth positive integer missing from a given array of positive integers. The array is assumed to be sorted in ascending order.

## Algorithm:
- Iterate through the array.
- For each element in the array, if it is less than or equal to the current value of k, increment k (indicating that a positive integer was found).
- If the element is greater than k, break the loop as further elements won't contribute to the missing count.

## Result:
The final value of k represents the kth missing positive integer.

## Time Complexity:
O(n), where n is the length of the input array. The algorithm iterates through the array once.

## Space Complexity:
O(1). The algorithm uses a constant amount of extra space regardless of the input size.

![image](https://github.com/shwetasugure/LeetCode/assets/107701519/c99209f3-5276-4b8b-8bec-ed3864446a59)
