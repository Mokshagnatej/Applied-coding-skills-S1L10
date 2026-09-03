<div align="center">

```
  ███╗   ███╗ ██████╗ ██████╗ ██╗   ██╗██╗     ███████╗     ██████╗  ██╗
  ████╗ ████║██╔═══██╗██╔══██╗██║   ██║██║     ██╔════╝    ██╔═████╗███║
  ██╔████╔██║██║   ██║██║  ██║██║   ██║██║     █████╗      ██║██╔██║╚██║
  ██║╚██╔╝██║██║   ██║██║  ██║██║   ██║██║     ██╔══╝      ████╔╝██║ ██║
  ██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝███████╗███████╗    ╚██████╔╝ ██║
  ╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝     ╚═════╝  ╚═╝
```

### 🔷 MODULE 01 • ARRAYS, STRINGS, TWO POINTERS & BINARY SEARCH
#### *Applied Coding Skills (S1L10) — Algorithmic Foundation Tier*

<br/>

[![Solved Status](https://img.shields.io/badge/MODULE_STATUS-10%2F10_SOLVED-00f5d4?style=for-the-badge&logo=target&logoColor=000&labelColor=0d1117)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_EASY-8-10b981?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_MEDIUM-2-f59e0b?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/RUNTIME-JAVA_21+-f78166?style=for-the-badge&logo=openjdk&logoColor=fff&labelColor=0d1117)](https://www.java.com/)

<br/>

<p align="center">
  Focuses on foundational array manipulations, in-place pointer traversals, sliding window frequency tracking, prefix sums, and logarithmic search paradigms.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

- **Two-Pointer Convergence:** Opposite-end convergence, in-place element swapping, and sliding window boundaries without auxiliary heap allocations.
- **Partitioning Algorithms:** Dutch National Flag 3-way partitioning in $\mathcal{O}(N)$ time and $\mathcal{O}(1)$ space.
- **Prefix / Suffix Accumulators:** Precomputing cumulative sums for $\mathcal{O}(1)$ range queries and difference balances.
- **Binary Search:** Logarithmic search on sorted collections with exact boundary condition invariants (`mid = low + (high - low) / 2`).
- **Direct Hash Addressing:** Replacing heavy hash tables with fixed-size `int[26]` frequency arrays for constant-time lookup.

<br/>

---

## 📋 Problem Directory & Performance

| # | Problem Title | Tier | Key Pattern / Concept | Time | Space | Performance (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| `0075` | [Sort Colors](https://leetcode.com/problems/sort-colors/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Dutch National Flag (3-Way Partition) | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 0 ms (100.00%)` | [solution.java](0075-sort-colors/solution.java) | [README.md](0075-sort-colors/README.md) |
| `0121` | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Greedy / Single Pass Min-Tracking | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 1 ms (99.96%)` | [solution.java](0121-best-time-to-buy-and-sell-stock/solution.java) | [README.md](0121-best-time-to-buy-and-sell-stock/README.md) |
| `0219` | [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Sliding Window / Spatial Hash Map | $\mathcal{O}(N)$ | $\mathcal{O}(k)$ | `24 ms (71.34%)` | [solution.java](0219-contains-duplicate-ii/solution.java) | [README.md](0219-contains-duplicate-ii/README.md) |
| `0283` | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Two Pointers (In-place Swap) | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 2 ms (92.03%)` | [solution.java](0283-move-zeroes/solution.java) | [README.md](0283-move-zeroes/README.md) |
| `0344` | [Reverse String](https://leetcode.com/problems/reverse-string/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Two Pointers (Opposite Ends) | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 0 ms (100.00%)` | [solution.java](0344-reverse-string/solution.java) | [README.md](0344-reverse-string/README.md) |
| `0387` | [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Frequency Array / Direct Hash Table | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `31 ms (38.93%)` | [solution.java](0387-first-unique-character-in-a-string/solution.java) | [README.md](0387-first-unique-character-in-a-string/README.md) |
| `0704` | [Binary Search](https://leetcode.com/problems/binary-search/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Binary Search (Divide & Conquer) | $\mathcal{O}(\log N)$ | $\mathcal{O}(1)$ | `⚡ 0 ms (100.00%)` | [solution.java](0704-binary-search/solution.java) | [README.md](0704-binary-search/README.md) |
| `0977` | [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Two Pointers (Extreme Magnitudes) | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 1 ms (100.00%)` | [solution.java](0977-squares-of-a-sorted-array/solution.java) | [README.md](0977-squares-of-a-sorted-array/README.md) |
| `1480` | [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Prefix Sum Accumulation | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 0 ms (100.00%)` | [solution.java](1480-running-sum-of-1d-array/solution.java) | [README.md](1480-running-sum-of-1d-array/README.md) |
| `1685` | [Sum of Absolute Differences](https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Prefix & Suffix Sum Balance | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 4 ms (85.17%)` | [solution.java](1685-sum-of-absolute-differences-in-a-sorted-array/solution.java) | [README.md](1685-sum-of-absolute-differences-in-a-sorted-array/README.md) |

<br/>

---

## 💡 Pattern Deep Dive & Cheat Sheet

### 1. Dutch National Flag (3-Way Partitioning)
- **Invariant:** `[0, low - 1]` contains `0`s, `[low, mid - 1]` contains `1`s, `[high + 1, n - 1]` contains `2`s. The unsorted region is `[mid, high]`.
- **Key Insight:** When swapping with `high`, do **not** increment `mid` because the incoming element from index `high` has not yet been processed.

```java
int low = 0, mid = 0, high = nums.length - 1;
while (mid <= high) {
    if (nums[mid] == 0) swap(nums, low++, mid++);
    else if (nums[mid] == 1) mid++;
    else swap(nums, mid, high--);
}
```

### 2. Opposite-End Convergent Two Pointers
- Used when comparing extremes of a sorted or symmetric array (e.g. `0344` String Reversal, `0977` Squares of Sorted Array).
- For squared sorting: Since input is sorted, largest squares exist at either the far left (negative) or far right (positive). Fill output array backwards from index $N-1$ to $0$.

```java
int left = 0, right = nums.length - 1, idx = nums.length - 1;
int[] result = new int[nums.length];
while (left <= right) {
    int leftSq = nums[left] * nums[left];
    int rightSq = nums[right] * nums[right];
    if (leftSq > rightSq) {
        result[idx--] = leftSq;
        left++;
    } else {
        result[idx--] = rightSq;
        right--;
    }
}
```

### 3. Prefix & Suffix Mathematical Balancing
- For an array sorted in non-decreasing order, the sum of absolute differences for element $i$ is:
$$\text{res}[i] = (i \cdot \text{nums}[i] - \text{leftSum}) + (\text{rightSum} - (n - 1 - i) \cdot \text{nums}[i])$$
- Allows calculating all differences in $\mathcal{O}(N)$ without quadratic pairwise comparisons.

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0075` • Sort Colors
- **Concept:** Three-way partitioning in a single pass.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ in-place.
- **Edge Cases:** Array with all identical elements (`[2,2,2]`), already sorted arrays (`[0,1,2]`), two-element arrays.

### `0121` • Best Time to Buy and Sell Stock
- **Concept:** Keep running track of the global minimum price seen so far. At each step, potential profit is `current_price - min_price`.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Strictly decreasing prices (`[7,6,4,3,1]` $\implies 0$), single-day array.

### `0219` • Contains Duplicate II
- **Concept:** Sliding window of size $k$ using a `HashSet` or a `HashMap<Integer, Integer>` storing the latest index of each number.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(\min(N, k))$.
- **Edge Cases:** $k \ge N$, duplicate values situated further apart than $k$.

### `0283` • Move Zeroes
- **Concept:** Fast-slow pointer: `slow` tracks the position for the next non-zero element, `fast` scans the array.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ in-place.
- **Edge Cases:** No zeroes in array, all zeroes, zeroes already at the back.

### `0344` • Reverse String
- **Concept:** Two pointers initialized at `0` and `N - 1`, swapping characters and moving inward until they cross.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Single character string, even vs odd length strings.

### `0387` • First Unique Character in a String
- **Concept:** Two-pass direct hash frequency table using `int[26]`. First pass counts frequencies; second pass finds the first character with count `1`.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ (fixed 26-character alphabet).
- **Edge Cases:** No unique characters (all duplicates), unique character is at index 0 or $N-1$.

### `0704` • Binary Search
- **Concept:** Classical divide-and-conquer on sorted ranges using invariant `mid = low + (high - low) / 2` to prevent 32-bit integer overflow.
- **Complexity:** Time: $\mathcal{O}(\log N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Target is smaller than minimum or larger than maximum, target not present, single element array.

### `0977` • Squares of a Sorted Array
- **Concept:** Two pointers converging inward from the outer boundaries, placing the larger squared value at the current tail index of the result array.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$ for output.
- **Edge Cases:** All negative numbers, all positive numbers, mixed negative/positive with zero.

### `1480` • Running Sum of 1d Array
- **Concept:** Prefix sum recurrence: `nums[i] = nums[i] + nums[i - 1]`.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ in-place.
- **Edge Cases:** Single element array, large values subject to overflow (use long if required by constraints).

### `1685` • Sum of Absolute Differences in a Sorted Array
- **Concept:** Prefix and total sum caching to decompose absolute differences into left and right sub-formulas.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ auxiliary space.
- **Edge Cases:** All identical elements, two-element array.

<br/>

---

<div align="center">

[⬅️ Back to Main Repository](../README.md)

</div>
