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
  This module builds the algorithmic foundation every developer needs — working with contiguous memory, manipulating elements in-place, and searching sorted data efficiently. These patterns appear in <b>over 40% of all coding interviews</b>.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

This week introduces five fundamental paradigms that unlock the vast majority of array and string problems:

- **Two-Pointer Convergence:** Instead of brute-forcing with nested loops ($\mathcal{O}(N^2)$), we place two pointers at strategic positions (start/end, or fast/slow) and move them inward based on conditions. This collapses two-dimensional search spaces into linear time. Used in problems like reversing strings, partitioning arrays, and merging sorted data.

- **Partitioning Algorithms (Dutch National Flag):** Dijkstra's 3-way partitioning divides an array into three regions in a single pass using three pointers (`low`, `mid`, `high`). The key insight is maintaining clear invariant boundaries — everything before `low` is sorted, everything after `high` is sorted, and the `[mid, high]` region is still being processed.

- **Prefix / Suffix Accumulators:** By precomputing running totals (prefix sums), we can answer range-sum queries in $\mathcal{O}(1)$ instead of $\mathcal{O}(N)$. This technique transforms quadratic pairwise comparisons into linear-time mathematical formulas — essential for problems involving cumulative differences or subarray sums.

- **Binary Search:** The cornerstone of logarithmic-time algorithms. On any sorted or monotonic data, binary search eliminates half the search space per iteration, achieving $\mathcal{O}(\log N)$ time. The critical implementation detail is using `mid = low + (high - low) / 2` instead of `(low + high) / 2` to prevent 32-bit integer overflow.

- **Direct Hash Addressing:** When the key space is small and bounded (e.g., lowercase English letters = 26 values), a fixed-size `int[26]` array outperforms a `HashMap` by eliminating hashing overhead, auto-boxing, and collision handling.

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

**When to use:** Any time you need to partition an array into exactly 2 or 3 groups in a single pass (e.g., sort colors, separate negatives/zeros/positives, partition around a pivot).

**How it works:**
- Three pointers divide the array into four regions: `[0, low-1]` = group A, `[low, mid-1]` = group B, `[mid, high]` = unprocessed, `[high+1, n-1]` = group C.
- `mid` scans left to right. Depending on the value at `mid`, swap it to the appropriate region.
- **Critical insight:** When swapping with `high`, do **not** increment `mid` — the incoming element from the right hasn't been examined yet.

```java
int low = 0, mid = 0, high = nums.length - 1;
while (mid <= high) {
    if (nums[mid] == 0) swap(nums, low++, mid++);
    else if (nums[mid] == 1) mid++;
    else swap(nums, mid, high--);
}
```

**Why this matters:** Without this pattern, you'd need to sort the array ($\mathcal{O}(N \log N)$) or make multiple passes. The Dutch National Flag achieves $\mathcal{O}(N)$ time in a single pass with $\mathcal{O}(1)$ space.

### 2. Opposite-End Convergent Two Pointers

**When to use:** Problems involving sorted arrays where you need to compare or combine elements from both ends (reversal, merging sorted halves, finding pairs that sum to a target).

**How it works for Squares of a Sorted Array (`0977`):**
- A sorted array with negatives has the largest squared values at the extremes (far left or far right).
- Place two pointers at both ends, compare absolute magnitudes, and fill the output array **backwards** from index $N-1$ to $0$.

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

**Real-world analogy:** Think of two runners starting from opposite ends of a track — they each contribute their best, and we record results from largest to smallest.

### 3. Prefix & Suffix Mathematical Balancing

**When to use:** Any problem where you need to compute a value for each element that depends on all other elements in the array (sum of differences, product except self, contribution calculations).

**How it works for Sum of Absolute Differences (`1685`):**
- For a sorted array, the sum of absolute differences for element $i$ can be decomposed into a left contribution and a right contribution:
$$\text{res}[i] = \underbrace{(i \cdot \text{nums}[i] - \text{leftSum})}_{\text{elements before } i \text{ are all smaller}} + \underbrace{(\text{rightSum} - (n - 1 - i) \cdot \text{nums}[i])}_{\text{elements after } i \text{ are all larger}}$$
- This transforms $\mathcal{O}(N^2)$ pairwise comparisons into $\mathcal{O}(N)$ using running prefix/suffix sums.

**Why this matters:** This mathematical decomposition pattern is reusable across dozens of problems — anytime a brute-force nested loop computes a symmetric function over all pairs.

### 4. Binary Search — The Exact Boundary Template

**When to use:** Any monotonic search space — sorted arrays, answer-space binary search, peak finding.

```java
int low = 0, high = nums.length - 1;
while (low <= high) {
    int mid = low + (high - low) / 2;  // Overflow-safe midpoint
    if (nums[mid] == target) return mid;
    else if (nums[mid] < target) low = mid + 1;
    else high = mid - 1;
}
return -1;  // Target not found
```

**Common pitfall:** Using `(low + high) / 2` causes integer overflow when `low + high > 2^31 - 1`. Always use `low + (high - low) / 2`.

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0075` • Sort Colors
- **What it's really asking:** Partition the array into three groups (0s, 1s, 2s) in-place, in a single pass.
- **Concept:** Dijkstra's three-way partitioning — three pointers maintain invariant boundaries as `mid` scans left to right.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ in-place.
- **Edge Cases:** All identical elements (`[2,2,2]`), already sorted (`[0,1,2]`), two-element arrays, empty array.
- **Interview Tip:** If asked "can you do better than sort?", this is the answer — single-pass $\mathcal{O}(N)$ partitioning.

### `0121` • Best Time to Buy and Sell Stock
- **What it's really asking:** Find the maximum difference `prices[j] - prices[i]` where `j > i` (you must buy before you sell).
- **Concept:** Greedy single-pass: maintain a running minimum price seen so far. At each step, the potential profit is `current_price - min_price_so_far`. Track the maximum of all such profits.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Strictly decreasing prices (`[7,6,4,3,1]` → profit is `0`), single-day array, all prices identical.
- **Why greedy works:** You always want to buy at the cheapest past price — there's no benefit to tracking anything other than the global minimum.

### `0219` • Contains Duplicate II
- **What it's really asking:** Are there two indices `i` and `j` such that `nums[i] == nums[j]` and `|i - j| <= k`?
- **Concept:** Sliding window of size $k$ using a `HashSet`. As the window slides right, add the new element and remove the element that just fell out of the window. If the element being added is already in the set, we found our duplicate within distance $k$.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(\min(N, k))$.
- **Edge Cases:** $k \ge N$ (entire array is the window), duplicates separated by more than $k$, $k = 0$.

### `0283` • Move Zeroes
- **What it's really asking:** Move all zeroes to the end while preserving the relative order of non-zero elements, in-place.
- **Concept:** Fast-slow pointer technique. `slow` marks the insertion position for the next non-zero element. `fast` scans ahead looking for non-zeroes. When `fast` finds one, swap it into position `slow` and advance both. This naturally pushes all zeroes to the end.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ in-place.
- **Edge Cases:** No zeroes, all zeroes, zeroes already at the back, single element.

### `0344` • Reverse String
- **What it's really asking:** Reverse a character array in-place using $\mathcal{O}(1)$ extra memory.
- **Concept:** Classic two-pointer convergence — pointers at positions `0` and `N-1` swap characters and move inward until they meet or cross.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Single character (no-op), even vs odd length strings (both work identically because the middle character of an odd-length string stays in place).

### `0387` • First Unique Character in a String
- **What it's really asking:** Find the index of the first character that appears exactly once.
- **Concept:** Two-pass approach with a direct-addressed frequency table `int[26]`. Pass 1 counts character frequencies. Pass 2 scans left-to-right and returns the first index with count `1`. Using `int[26]` instead of `HashMap` avoids auto-boxing overhead and is cache-friendly.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ (fixed 26-character alphabet = constant space).
- **Edge Cases:** No unique characters, unique character at index 0 or $N-1$, single character string.

### `0704` • Binary Search
- **What it's really asking:** Find the index of a target value in a sorted array, or return -1.
- **Concept:** Classical divide-and-conquer on sorted ranges. Each comparison eliminates half the remaining candidates. The key implementation detail is the overflow-safe midpoint calculation.
- **Complexity:** Time: $\mathcal{O}(\log N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Target smaller than minimum, larger than maximum, not present, single element array, array of length 1 where element equals target.

### `0977` • Squares of a Sorted Array
- **What it's really asking:** Square every element and return the result in sorted order, in $\mathcal{O}(N)$ time.
- **Concept:** In a sorted array with negatives, the largest squares live at the extremes. Two pointers compare absolute magnitudes from both ends, placing the larger squared value at the current tail of the result array. This avoids an $\mathcal{O}(N \log N)$ post-sort.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$ for output.
- **Edge Cases:** All negative, all positive, mixed with zero, single element.

### `1480` • Running Sum of 1d Array
- **What it's really asking:** Compute the prefix sum array where `result[i] = sum(nums[0..i])`.
- **Concept:** Simplest prefix sum: `nums[i] += nums[i - 1]` in-place. This builds the running total incrementally — each element becomes the sum of itself and everything before it.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ in-place.
- **Edge Cases:** Single element, large values close to integer overflow (use `long` if needed).

### `1685` • Sum of Absolute Differences in a Sorted Array
- **What it's really asking:** For each element, compute the sum of `|nums[i] - nums[j]|` for all `j ≠ i`. The array is sorted.
- **Concept:** Since the array is sorted, we can decompose each element's contribution using prefix and total sums. Elements to the left are all smaller (no absolute value needed — just `i * nums[i] - leftSum`), and elements to the right are all larger (`rightSum - (n-1-i) * nums[i]`). This mathematical insight transforms $\mathcal{O}(N^2)$ brute force into $\mathcal{O}(N)$.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ auxiliary.
- **Edge Cases:** All identical elements (all results are 0), two-element array.

<br/>

---

## 🔗 Connections to Future Weeks

The patterns in this module form the building blocks for everything that follows:

| This Week's Pattern | Future Application |
|:---|:---|
| Two Pointers | → Linked list fast/slow (Week 2), sliding window deques (Week 4) |
| Prefix Sum | → BFS distance matrices (Week 8), subarray problems |
| Binary Search | → BST ordered lookup (Week 6), answer-space search |
| Frequency Arrays | → Monotonic stack maps (Week 3), heap frequency counting (Week 6) |

<br/>

---

<div align="center">

[⬅️ Back to Main Repository](../README.md) • [➡️ Next: Week 2 — Linked Lists](../Week-2/)

</div>
