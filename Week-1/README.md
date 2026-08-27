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

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory) • [🎯 CORE OBJECTIVES](#-core-learning-objectives)

---

</div>

<br/>

## 🎯 Core Learning Objectives

- **Two-Pointer Convergence:** Opposite-end convergence, in-place element swapping, and sliding window boundaries without extra allocations.
- **Partitioning Algorithms:** Dutch National Flag 3-way partitioning in $\mathcal{O}(N)$ time and $\mathcal{O}(1)$ space.
- **Prefix / Suffix Accumulators:** Precomputing cumulative sums for $\mathcal{O}(1)$ range queries and difference balances.
- **Binary Search:** Logarithmic search on sorted collections with exact boundary condition invariants.

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

<div align="center">

[⬅️ Back to Main Repository](../README.md)

</div>
