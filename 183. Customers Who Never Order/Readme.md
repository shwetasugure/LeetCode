# SQL Query: Customers Without Orders

## Query Overview

This SQL query retrieves the names of customers who have not placed any orders. It involves a left join between the "Customers" and "Orders" tables,
filtering the result to include only rows where there is no corresponding entry in the "Orders" table.

## Query Breakdown

```sql
-- Select the name column from the Customers table and alias it as 'Customers'
SELECT Customers.name as Customers

-- From the Customers table
FROM Customers

-- Left join the Orders table based on the customer ID
LEFT JOIN Orders ON Customers.id = Orders.customerId

-- Filter the result to include only rows where Orders.CustomerId is NULL
WHERE Orders.CustomerId IS NULL;
