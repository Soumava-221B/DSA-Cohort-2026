Consider a rat placed at position `(0, 0)` in an `n x n` square matrix `maze[][]`. The rat's goal is to reach the destination at position `(n-1, n-1)`. The rat can move in four possible directions:

- `'U'` (up)
- `'D'` (down)
- `'L'` (left)
- `'R'` (right)

## Matrix Values

The matrix contains only two possible values:

- `0`: A blocked cell through which the rat cannot travel.
- `1`: A free cell that the rat can pass through.

## Task

Find all possible paths the rat can take to reach the destination, starting from `(0, 0)` and ending at `(n-1, n-1)`, under the following conditions:

- The rat cannot revisit any cell along the same path.
- The rat can only move to adjacent cells that are within the bounds of the matrix and not blocked.

If no path exists, return an empty list.

**Note:** Return the final result vector in lexicographically smallest order.

---

## Examples

### Example 1

**Input:**

maze[][] = [
[1, 0, 0, 0],
[1, 1, 0, 1],
[1, 1, 0, 0],
[0, 1, 1, 1]
]


**Output:**

["DDRDRR", "DRDDRR"]


**Explanation:**
The rat can reach the destination at `(3, 3)` from `(0, 0)` by two paths - `DRDDRR` and `DDRDRR`. When printed in sorted order, we get:

DDRDRR DRDDRR


---

### Example 2

**Input:**

maze[][] = [
[1, 0],
[1, 0]
]


**Output:**

[]


**Explanation:**
No path exists as the destination cell `(1, 1)` is blocked.

---

### Example 3

**Input:**

maze[][] = [
[1, 1, 1],
[1, 0, 1],
[1, 1, 1]
]


**Output:**

["DDRR", "RRDD"]


**Explanation:**
The rat has two possible paths to reach the destination: `DDRR` and `RRDD`.

---

## Constraints

- `2 ≤ n ≤ 5`
- `0 ≤ maze[i][j] ≤ 1`