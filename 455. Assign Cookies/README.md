# Assign Cookies
The goal is to maximize the number of content children given an array of children's greed factors (g) and an array of cookie sizes (s).

## Sorting:
Both the g (children's greed factors) and s (cookie sizes) arrays are sorted in ascending order.

## Greedy Matching:
-Initialize count to 0, representing the number of content children.
-Use two pointers, i for the children array and j for the cookies array.
-Iterate through both arrays simultaneously.
-If the greed factor of the current child (g[i]) is less than or equal to the size of the current cookie (s[j]), it means the child can be content, so increment count, i, and j.
-If the greed factor is greater, move to the next cookie (j++).

## Result:
The final value of count represents the maximum number of content children.

## Time Complexity:
O(max(N log N, M log M)), where N is the length of the g array and M is the length of the s array. The dominant factor is the sorting step.

## Space Complexity:
O(1). The algorithm uses a constant amount of extra space regardless of the input size, as it sorts the arrays in-place.

![image](https://github.com/shwetasugure/LeetCode/assets/107701519/a340da2a-6396-4603-8580-7ea97b663e84)




