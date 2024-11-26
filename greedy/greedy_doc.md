# Greedy Problems

## Problem 1 Explanation - Assign Cookies
The problem involves finding the maximum number of children that can be satisfied with a given number of cookies. Each child has a *greed factor* (minimum cookie size that will satisfy them), and each cookie has a specific size. A cookie can only satisfy one child, and a child can only consume one cookie. The goal is to maximize the number of satisfied children.

### Approach
- Use a **greedy algorithm**:
  1. Sort both the greed factors of children and the sizes of cookies.
  2. Assign the smallest available cookie that satisfies a child's greed factor.
  3. Continue until there are no more cookies or all children are satisfied.

### Example
- **Input**:
  - Greed Factors: [1, 2, 3]
  - Cookie Sizes: [1, 1]
- **Output**: 1 (Maximum satisfied children)

<hr style="border: none; height: 4px; background-color: cyan;">


## Problem 2 Explanation - Fractional Knapsack
The Fractional Knapsack problem involves selecting items with given weights and values to maximize the total value without exceeding a given capacity. Unlike the 0/1 Knapsack problem, you can take fractional parts of items.

### Problem Statement
- Given:
  - A list of values `val` and weights `wt` of items.
  - A maximum capacity of the knapsack `capacity`.
- Goal: 
  - Maximize the total value of items placed in the knapsack, where fractions of items can be taken.

### Approach
- Use a **greedy algorithm**:
  1. Calculate the value-to-weight ratio for each item.
  2. Sort items by this ratio in descending order.
  3. Iteratively add items to the knapsack:
     - If the knapsack can accommodate the entire item, add it.
     - Otherwise, take as much of the item as possible to fill the remaining capacity.

### Example
- **Input**:
  - Values: [60, 100, 120]
  - Weights: [10, 20, 30]
  - Capacity: 50
- **Process**:
  - Ratios: [6.0, 5.0, 4.0]
  - Sorted Items: [(6.0, 60, 10), (5.0, 100, 20), (4.0, 120, 30)]
  - Step-by-step:
    1. Take the first item fully (value = 60, weight = 10).
    2. Take the second item fully (value = 100, weight = 20).
    3. Take 2/3 of the third item (value = 80, weight = 20).
- **Output**: Total value = 240.