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

<hr style="border: none; height: 4px; background-color: cyan;">

## Problem 5 Statement
**You are given the start and end times of n meetings as two arrays: start and end. Your task is to determine the maximum number of meetings that can be accommodated in a single meeting room, such that:**

Only one meeting can be held at a time.
The start time of a meeting cannot be equal to or earlier than the end time of the previous meeting.
### Approach
This problem is solved using a greedy algorithm:

Pair Start and End Times:

Combine the start and end times into a list of tuples.
Sort Meetings:

Sort the meetings by their end times (primary criterion).
If two meetings have the same end time, sort by their start time (secondary criterion).
### Select Meetings:

Initialize lastEnd as -1 to track the end time of the last selected meeting.
Iterate through the sorted list of meetings:
If the current meeting's start time is greater than lastEnd, select it.
Update lastEnd to the current meeting's end time.
Return the Count:

The total number of selected meetings is the result.
### Example
Input:

python
Copy code
start = [1, 3, 2, 5, 8, 5]
end = [2, 4, 3, 7, 9, 9]

**Execution Steps:**
Pair start and end times:
meetings = [(1, 2), (3, 4), (2, 3), (5, 7), (8, 9), (5, 9)]

Sort by end times:
meetings = [(1, 2), (2, 3), (3, 4), (5, 7), (8, 9), (5, 9)]

**Select meetings:**

Select (1, 2): lastEnd = 2
Select (2, 3): Skip (start time ≤ lastEnd).
Select (3, 4): lastEnd = 4
Select (5, 7): lastEnd = 7
Select (5, 9): Skip (start time ≤ lastEnd).
Select (8, 9): lastEnd = 9
Total meetings selected: 4


