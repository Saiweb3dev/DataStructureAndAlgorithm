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

<hr style="border: none; height: 4px; background-color: cyan;">

## Problem 3 Explanation - Lemonade Change

### Problem Statement
The problem involves determining whether you can provide the correct change to all customers in a lemonade stand. Each customer pays either `$5`, `$10`, or `$20` for a lemonade, which costs `$5`. You start with no money, and you must provide the correct change for each customer in the order they arrive.

- If a customer pays `$5`, you don't need to return any change.
- If a customer pays `$10`, you need to return `$5` as change.
- If a customer pays `$20`, you can return either:
  - `$10` and `$5`, or
  - Three `$5` bills, if `$10` is not available.

The goal is to determine if it's possible to provide correct change for all customers.

---

### Approach
1. **Initialization**: Use three variables (`bill5`, `bill10`, `bill20`) to keep track of the number of `$5`, `$10`, and `$20` bills you have.
2. **Iterate Through Bills**: For each customer's payment:
   - If `$5`, increase `bill5` count.
   - If `$10`, check if `bill5` is available for change. If yes, decrement `bill5` and increment `bill10`.
   - If `$20`, prioritize giving `$10` and `$5` as change. If not possible, give three `$5` bills.
3. **Validation**: If at any point you cannot provide the correct change, return `False`.

---

### Example
#### Input

bills = [5, 5, 5, 10, 20]

<hr style="border: none; height: 4px; background-color: cyan;">

## Problem 4 Explanation - Valid Parenthesis String

### Problem Statement
The problem involves determining whether a string containing `(`, `)`, and `*` is valid:
- `(` must be closed by a corresponding `)`.
- `*` can be treated as:
  - An opening parenthesis `(`.
  - A closing parenthesis `)`.
  - An empty string (ignored).
- The string must be valid at every point.

---

### Approach

This problem is solved using a **range-based greedy algorithm**:
1. **Tracking Open Parentheses**:
   - Use two variables, `low` and `high`:
     - `low`: Minimum possible open parentheses.
     - `high`: Maximum possible open parentheses.

2. **Updating for Each Character**:
   - For `(`: Increment both `low` and `high`.
   - For `)`: Decrement both `low` and `high`. Ensure `low` doesn't go below 0.
   - For `*`:
     - Treat it as `)` by decreasing `low`.
     - Treat it as `(` by increasing `high`.

3. **Validation**:
   - At any point, if `high` becomes negative, return `False` (too many `)`).
   - At the end, check if `low == 0` (all open parentheses are closed).

---

### Example

#### Input:
s = "(*))"


