<div align="center">

# 🚀 Applied Coding Skills (S1L10)
### *Curated LeetCode Mastery & Data Structures Roadmap*

[![Total Solved](https://img.shields.io/badge/Total_Solved-27%2F27-6366f1?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_Easy-16-10b981?style=for-the-badge)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_Medium-9-f59e0b?style=for-the-badge)](https://leetcode.com/)
[![Hard](https://img.shields.io/badge/🔴_Hard-2-ef4444?style=for-the-badge)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/Language-Java_100%25-b07219?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Top Performance](https://img.shields.io/badge/⚡_Top_Speed-0ms_(100%25_Beats)-blueviolet?style=for-the-badge)](https://leetcode.com/)

<p align="center">
  A systematically structured repository containing optimal solutions, time & space complexity analysis, and pattern-based breakdowns for <b>Applied Coding Skills (S1L10)</b>.
</p>

[📌 Weekly Curriculum](#-weekly-curriculum) • [📊 Progress Matrix](#-progress-matrix) • [📁 Problem Directory](#-problem-directory) • [💡 Pattern Deep Dives](#-key-algorithmic-patterns-mastered) • [📂 Structure](#-repository-structure)

</div>

---

## 📌 Weekly Curriculum & Module Overview

```
Week 1 ──► [Arrays, Two Pointers, Prefix Sums & Binary Search] ──► 10 Problems (8 Easy, 2 Medium)
Week 2 ──► [Linked Lists, Fast & Slow Pointers, In-Place Reversal] ─► 8 Problems (5 Easy, 1 Medium, 2 Hard)
Week 3 ──► [Stacks, Monotonic Stacks & Sequence Simulation] ─────► 9 Problems (3 Easy, 6 Medium)
```

---

## 📊 Progress Matrix

| Module | Core Focus / Topics | 🟢 Easy | 🟡 Medium | 🔴 Hard | Total | Status |
| :--- | :--- | :---: | :---: | :---: | :---: | :---: |
| [**Week 1**](#-week-1-arrays-strings-two-pointers--binary-search) | Arrays, Two Pointers, Prefix Sum, Sliding Window, Binary Search | 8 | 2 | 0 | **10** | ![Completed](https://img.shields.io/badge/Completed-100%25-success?style=flat-square) |
| [**Week 2**](#-week-2-linked-lists--pointer-manipulation) | Singly & Doubly Linked Lists, Fast/Slow Pointers, K-Group Reversal | 5 | 1 | 2 | **8** | ![Completed](https://img.shields.io/badge/Completed-100%25-success?style=flat-square) |
| [**Week 3**](#-week-3-stacks-monotonic-stacks--simulation) | Stacks, Monotonic Decreasing Stacks, String Balancing, Simulation | 3 | 6 | 0 | **9** | ![Completed](https://img.shields.io/badge/Completed-100%25-success?style=flat-square) |
| **Total** | **All Modules Completed** | **16** | **9** | **2** | **27** | ![100% Solved](https://img.shields.io/badge/Overall-27%2F27-blue?style=flat-square) |

---

## 📁 Problem Directory

### 🔹 Week 1: Arrays, Strings, Two Pointers & Binary Search
> **Core Concepts:** Dutch National Flag Partitioning, Sliding Window, Prefix Sum Running Accumulation, Binary Search on Sorted Arrays.

| # | Problem | Difficulty | Key Pattern | Time | Space | Runtime (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| 0075 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Dutch National Flag (3-Way Partition) | $O(N)$ | $O(1)$ | `0 ms (100.00%)` | [Java](Week-1/0075-sort-colors/solution.java) | [Notes](Week-1/0075-sort-colors/README.md) |
| 0121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Greedy / Single Pass Min-Tracking | $O(N)$ | $O(1)$ | `1 ms (99.96%)` | [Java](Week-1/0121-best-time-to-buy-and-sell-stock/solution.java) | [Notes](Week-1/0121-best-time-to-buy-and-sell-stock/README.md) |
| 0219 | [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Sliding Window / Hash Map | $O(N)$ | $O(k)$ | `24 ms (71.34%)` | [Java](Week-1/0219-contains-duplicate-ii/solution.java) | [Notes](Week-1/0219-contains-duplicate-ii/README.md) |
| 0283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Two Pointers (In-place Swap) | $O(N)$ | $O(1)$ | `2 ms (92.03%)` | [Java](Week-1/0283-move-zeroes/solution.java) | [Notes](Week-1/0283-move-zeroes/README.md) |
| 0344 | [Reverse String](https://leetcode.com/problems/reverse-string/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Two Pointers (Opposite Ends) | $O(N)$ | $O(1)$ | `0 ms (100.00%)` | [Java](Week-1/0344-reverse-string/solution.java) | [Notes](Week-1/0344-reverse-string/README.md) |
| 0387 | [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Frequency Array / Hash Table | $O(N)$ | $O(1)$ | `31 ms (38.93%)` | [Java](Week-1/0387-first-unique-character-in-a-string/solution.java) | [Notes](Week-1/0387-first-unique-character-in-a-string/README.md) |
| 0704 | [Binary Search](https://leetcode.com/problems/binary-search/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Binary Search (Divide & Conquer) | $O(\log N)$ | $O(1)$ | `0 ms (100.00%)` | [Java](Week-1/0704-binary-search/solution.java) | [Notes](Week-1/0704-binary-search/README.md) |
| 0977 | [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Two Pointers (Extreme Magnitudes) | $O(N)$ | $O(N)$ | `1 ms (100.00%)` | [Java](Week-1/0977-squares-of-a-sorted-array/solution.java) | [Notes](Week-1/0977-squares-of-a-sorted-array/README.md) |
| 1480 | [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Prefix Sum Accumulation | $O(N)$ | $O(1)$ | `0 ms (100.00%)` | [Java](Week-1/1480-running-sum-of-1d-array/solution.java) | [Notes](Week-1/1480-running-sum-of-1d-array/README.md) |
| 1685 | [Sum of Absolute Differences in a Sorted Array](https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Prefix & Suffix Sum Balance | $O(N)$ | $O(1)$ | `4 ms (85.17%)` | [Java](Week-1/1685-sum-of-absolute-differences-in-a-sorted-array/solution.java) | [Notes](Week-1/1685-sum-of-absolute-differences-in-a-sorted-array/README.md) |

---

### 🔹 Week 2: Linked Lists & Pointer Manipulation
> **Core Concepts:** Floyd's Cycle-Finding Algorithm (Tortoise and Hare), In-Place Linked List Reversal, Merge Techniques, PriorityQueue K-Way Merge.

| # | Problem | Difficulty | Key Pattern | Time | Space | Runtime (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| 0021 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Splicing / Recursive Merge | $O(N + M)$ | $O(1)$ | `0 ms (100.00%)` | [Java](Week-2/0021-merge-two-sorted-lists/solution.java) | [Notes](Week-2/0021-merge-two-sorted-lists/README.md) |
| 0023 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | ![Hard](https://img.shields.io/badge/Hard-red?style=flat-square) | Min-Heap / PriorityQueue K-Way Merge | $O(N \log k)$ | $O(k)$ | `5 ms (40.75%)` | [Java](Week-2/0023-merge-k-sorted-lists/solution.java) | [Notes](Week-2/0023-merge-k-sorted-lists/README.md) |
| 0025 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | ![Hard](https://img.shields.io/badge/Hard-red?style=flat-square) | Segmented In-Place Sublist Reversal | $O(N)$ | $O(1)$ | `1 ms (34.55%)` | [Java](Week-2/0025-reverse-nodes-in-k-group/solution.java) | [Notes](Week-2/0025-reverse-nodes-in-k-group/README.md) |
| 0142 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Floyd's Cycle Detection (Entry Point) | $O(N)$ | $O(1)$ | `0 ms (100.00%)` | [Java](Week-2/0142-linked-list-cycle-ii/solution.java) | [Notes](Week-2/0142-linked-list-cycle-ii/README.md) |
| 0160 | [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Two Pointers (Cycle Alignment) | $O(N + M)$ | $O(1)$ | `1 ms (99.90%)` | [Java](Week-2/0160-intersection-of-two-linked-lists/solution.java) | [Notes](Week-2/0160-intersection-of-two-linked-lists/README.md) |
| 0206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | In-Place Pointer Redirection | $O(N)$ | $O(1)$ | `0 ms (100.00%)` | [Java](Week-2/0206-reverse-linked-list/solution.java) | [Notes](Week-2/0206-reverse-linked-list/README.md) |
| 0234 | [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Fast/Slow Pointers + Half Reversal | $O(N)$ | $O(1)$ | `3 ms (99.83%)` | [Java](Week-2/0234-palindrome-linked-list/solution.java) | [Notes](Week-2/0234-palindrome-linked-list/README.md) |
| 0876 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Fast & Slow Pointers ($2x$ Step) | $O(N)$ | $O(1)$ | `0 ms (100.00%)` | [Java](Week-2/0876-middle-of-the-linked-list/solution.java) | [Notes](Week-2/0876-middle-of-the-linked-list/README.md) |

---

### 🔹 Week 3: Stacks, Monotonic Stacks & Simulation
> **Core Concepts:** Monotonic Decreasing Stack for Next Greater / Smaller Queries, Stack-based String Balancing, Simulation of LIFO State Transitions.

| # | Problem | Difficulty | Key Pattern | Time | Space | Runtime (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| 0020 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | LIFO Bracket Matching | $O(N)$ | $O(N)$ | `3 ms (86.07%)` | [Java](Week-3/0020-valid-parentheses/solution.java) | [Notes](Week-3/0020-valid-parentheses/README.md) |
| 0155 | [Min Stack](https://leetcode.com/problems/min-stack/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Dual Stack / Paired Min State | $O(1)$ | $O(N)$ | `34 ms (61.77%)` | [Java](Week-3/0155-min-stack/solution.java) | [Notes](Week-3/0155-min-stack/README.md) |
| 0496 | [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Monotonic Decreasing Stack + Map | $O(N + M)$ | $O(N)$ | `2 ms (99.48%)` | [Java](Week-3/0496-next-greater-element-i/solution.java) | [Notes](Week-3/0496-next-greater-element-i/README.md) |
| 0735 | [Asteroid Collision](https://leetcode.com/problems/asteroid-collision/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Stack Collision Simulation | $O(N)$ | $O(N)$ | `5 ms (67.32%)` | [Java](Week-3/0735-asteroid-collision/solution.java) | [Notes](Week-3/0735-asteroid-collision/README.md) |
| 0739 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Monotonic Decreasing Stack (Indices) | $O(N)$ | $O(N)$ | `71 ms (38.95%)` | [Java](Week-3/0739-daily-temperatures/solution.java) | [Notes](Week-3/0739-daily-temperatures/README.md) |
| 0901 | [Online Stock Span](https://leetcode.com/problems/online-stock-span/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Monotonic Stack with Span Compression | $O(1)$ *amortized* | $O(N)$ | `31 ms (60.14%)` | [Java](Week-3/0901-online-stock-span/solution.java) | [Notes](Week-3/0901-online-stock-span/README.md) |
| 0946 | [Validate Stack Sequences](https://leetcode.com/problems/validate-stack-sequences/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Greedy Push-Pop Simulation | $O(N)$ | $O(N)$ | `2 ms (88.46%)` | [Java](Week-3/0946-validate-stack-sequences/solution.java) | [Notes](Week-3/0946-validate-stack-sequences/README.md) |
| 1249 | [Minimum Remove to Make Valid Parentheses](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Index Stack / Two-Pass Filter | $O(N)$ | $O(N)$ | `6 ms (97.91%)` | [Java](Week-3/1249-minimum-remove-to-make-valid-parentheses/solution.java) | [Notes](Week-3/1249-minimum-remove-to-make-valid-parentheses/README.md) |
| 1475 | [Final Prices With a Special Discount in a Shop](https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Monotonic Stack (Next Smaller Element) | $O(N)$ | $O(N)$ | `1 ms (99.79%)` | [Java](Week-3/1475-final-prices-with-a-special-discount-in-a-shop/solution.java) | [Notes](Week-3/1475-final-prices-with-a-special-discount-in-a-shop/README.md) |

---

## 💡 Key Algorithmic Patterns Mastered

<details>
<summary><b>1. Dutch National Flag & 3-Way Partitioning (Week 1)</b></summary>
<br>

Used when an array needs to be partitioned in-place into three distinct segments (e.g., `< pivot`, `== pivot`, `> pivot`) in a single pass $O(N)$ with $O(1)$ space.
- Maintain 3 pointers: `low`, `mid`, `high`.
- If `nums[mid] == 0`: swap `nums[low]` and `nums[mid]`, increment both `low++` and `mid++`.
- If `nums[mid] == 1`: increment `mid++`.
- If `nums[mid] == 2`: swap `nums[mid]` and `nums[high]`, decrement `high--`.
</details>

<details>
<summary><b>2. Floyd's Cycle Finding & Fast/Slow Pointers (Week 2)</b></summary>
<br>

Used for cycle detection, finding linked list midpoints, and checking palindromes in $O(1)$ space.
- **Midpoint:** Advance `fast` by 2 steps and `slow` by 1 step. When `fast == null || fast.next == null`, `slow` is at the middle.
- **Cycle Entry Point:** Once `slow` meets `fast`, reset `slow` to `head`. Move both 1 step at a time; their collision point is the cycle start.
</details>

<details>
<summary><b>3. In-Place Linked List Reversal & K-Group (Week 2)</b></summary>
<br>

Reverses pointer directions without allocating extra nodes:
```java
ListNode prev = null, curr = head;
while (curr != null) {
    ListNode next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
}
return prev;
```
For **K-Group Reversal**, count $k$ nodes in advance. If sufficient nodes exist, reverse the subsegment and connect the boundary pointers recursively or iteratively.
</details>

<details>
<summary><b>4. Monotonic Decreasing Stack for Next Greater Element (Week 3)</b></summary>
<br>

Finds the next greater or smaller element in $O(N)$ linear time by maintaining elements in sorted monotonic order inside the stack:
- While `!stack.isEmpty()` and current element is greater than `nums[stack.peek()]`, pop the index and record the answer for that index.
- Push the current index onto the stack.
- Guarantees each element is pushed and popped at most once.
</details>

---

## 📂 Repository Structure

```
Applied-coding-skills-S1L10/
├── README.md                                  # Root Documentation & Navigation Index
├── Week-1/                                    # Module 1: Arrays, Strings, Two Pointers, Binary Search
│   ├── README.md                              # Week 1 Module Overview & Index
│   ├── 0075-sort-colors/                      # Problem Solutions & Notes
│   ├── 0121-best-time-to-buy-and-sell-stock/
│   ├── 0219-contains-duplicate-ii/
│   ├── 0283-move-zeroes/
│   ├── 0344-reverse-string/
│   ├── 0387-first-unique-character-in-a-string/
│   ├── 0704-binary-search/
│   ├── 0977-squares-of-a-sorted-array/
│   ├── 1480-running-sum-of-1d-array/
│   └── 1685-sum-of-absolute-differences-in-a-sorted-array/
├── Week-2/                                    # Module 2: Linked Lists & Multi-Pointer Techniques
│   ├── README.md                              # Week 2 Module Overview & Index
│   ├── 0021-merge-two-sorted-lists/
│   ├── 0023-merge-k-sorted-lists/
│   ├── 0025-reverse-nodes-in-k-group/
│   ├── 0142-linked-list-cycle-ii/
│   ├── 0160-intersection-of-two-linked-lists/
│   ├── 0206-reverse-linked-list/
│   ├── 0234-palindrome-linked-list/
│   └── 0876-middle-of-the-linked-list/
└── Week-3/                                    # Module 3: Stacks, Monotonic Stacks & Simulation
    ├── README.md                              # Week 3 Module Overview & Index
    ├── 0020-valid-parentheses/
    ├── 0155-min-stack/
    ├── 0496-next-greater-element-i/
    ├── 0735-asteroid-collision/
    ├── 0739-daily-temperatures/
    ├── 0901-online-stock-span/
    ├── 0946-validate-stack-sequences/
    ├── 1249-minimum-remove-to-make-valid-parentheses/
    └── 1475-final-prices-with-a-special-discount-in-a-shop/
```

---

## 🛠️ How to Compile & Run Solutions

All solutions are written in pure **Java (JDK 8+)** without external dependencies.

```bash
# Example: Navigate to any problem directory
cd Week-1/0075-sort-colors

# Compile Java solution
javac solution.java
```

---

<div align="center">

*Maintained with ❤️ for Applied Coding Skills (S1L10) • Clean Code • Optimal Complexities*

</div>