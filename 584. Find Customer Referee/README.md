# Find Customer Referee

## Algorithm:
The given MySQL query retrieves the names of customers from the "Customer" table based on certain conditions. Here's an explanation in points:

### Table Selection:
The query operates on the "Customer" table.

### Column Selection:
It selects the "name" column from the "Customer" table.

### Filtering Condition:
The WHERE clause specifies a filtering condition:
referee_id != 2: Customers whose "referee_id" is not equal to 2.
or: Logical OR operator.
referee_id is null: Customers whose "referee_id" is NULL.

The final result is a list of customer names who satisfy the conditions outlined in the WHERE clause.

![image](https://github.com/shwetasugure/LeetCode/assets/107701519/606766a4-1c2b-434e-a4f7-a76f153f818b)
