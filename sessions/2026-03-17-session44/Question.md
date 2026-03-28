# String Merge Problem

## Problem Statement

You are given:

- A string `s` consisting of lowercase English letters  
- An integer `k`

Two equal characters in the string are considered **close** if the distance between their indices is at most `k`.

---

## Merge Rules

- When two equal characters are close:
  - The **right character merges into the left**
  - The right character is removed
- The string updates after each merge
- Continue merging until no more valid merges are possible

---

## Merge Priority

If multiple merges are possible:

1. Choose the pair with the **smallest left index**
2. If multiple pairs share the same left index, choose the one with the **smallest right index**

---

## Return

Return the final string after performing all possible merges.

---

## Examples

### Example 1

**Input:**
s = "abca", k = 3

**Output:**
"abc"


**Explanation:**

- Characters `'a'` at indices `0` and `3` are close (`3 - 0 = 3 <= k`)
- Merge them → `"abc"`
- No further merges possible

---

### Example 2

**Input:**
s = "aabca", k = 2


**Output:**
"abca"


**Explanation:**

- Characters `'a'` at indices `0` and `1` are close (`1 - 0 = 1 <= k`)
- Merge them → `"abca"`
- Remaining `'a'` at indices `0` and `3` are not close (`3 > k`)
- No further merges possible

---

### Example 3

**Input:**
s = "yybyzybz", k = 2


**Output:**
"ybzybz"


**Explanation:**

1. `'y'` at indices `0` and `1` → merge → `"ybyzybz"`
2. `'y'` at indices `0` and `2` → merge → `"ybzybz"`
3. No further merges possible

---

## Constraints

- `1 <= s.length <= 100`
- `1 <= k <= s.length`
- `s` contains only lowercase English letters