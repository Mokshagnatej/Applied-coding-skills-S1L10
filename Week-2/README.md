<div align="center">

# 📅 Week 2: Linked Lists & Pointer Manipulation
### *Applied Coding Skills (S1L10) — Module 2*

[![Problems Solved](https://img.shields.io/badge/Solved-8%2F8-6366f1?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_Easy-5-10b981?style=for-the-badge)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_Medium-1-f59e0b?style=for-the-badge)](https://leetcode.com/)
[![Hard](https://img.shields.io/badge/🔴_Hard-2-ef4444?style=for-the-badge)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/Language-Java-b07219?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)

<p align="center">
  Focuses on linked list pointer dynamics, cycle detection algorithms, in-place segment reversals, list intersections, and priority-queue powered k-way merging.
</p>

</div>

---

## 🎯 Learning Objectives

- **Fast & Slow Pointers (Floyd's Algorithm):** Locating linked list midpoints and identifying cycle entrance nodes in $O(1)$ space.
- **In-Place Pointer Reversal:** Reversing sublists and full lists by manipulating `.next` pointers without auxiliary structures.
- **K-Group Segmented Reversal:** Maintaining segment boundaries and reconnecting head/tail references dynamically.
- **Priority Queue / Divide-and-Conquer:** Merging $K$ sorted lists efficiently in $O(N \log K)$ time.

---

## 📋 Problem Directory

| # | Problem Title | Difficulty | Key Pattern / Concept | Time | Space | Performance | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| 0021 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Splicing / Recursive Merge | $O(N + M)$ | $O(1)$ | `0 ms (100.00%)` | [solution.java](0021-merge-two-sorted-lists/solution.java) | [README.md](0021-merge-two-sorted-lists/README.md) |
| 0023 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | ![Hard](https://img.shields.io/badge/Hard-red?style=flat-square) | Min-Heap / PriorityQueue K-Way Merge | $O(N \log k)$ | $O(k)$ | `5 ms (40.75%)` | [solution.java](0023-merge-k-sorted-lists/solution.java) | [README.md](0023-merge-k-sorted-lists/README.md) |
| 0025 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | ![Hard](https://img.shields.io/badge/Hard-red?style=flat-square) | Segmented In-Place Sublist Reversal | $O(N)$ | $O(1)$ | `1 ms (34.55%)` | [solution.java](0025-reverse-nodes-in-k-group/solution.java) | [README.md](0025-reverse-nodes-in-k-group/README.md) |
| 0142 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Floyd's Cycle Detection (Entry Point) | $O(N)$ | $O(1)$ | `0 ms (100.00%)` | [solution.java](0142-linked-list-cycle-ii/solution.java) | [README.md](0142-linked-list-cycle-ii/README.md) |
| 0160 | [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Two Pointers (Cycle Alignment) | $O(N + M)$ | $O(1)$ | `1 ms (99.90%)` | [solution.java](0160-intersection-of-two-linked-lists/solution.java) | [README.md](0160-intersection-of-two-linked-lists/README.md) |
| 0206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | In-Place Pointer Redirection | $O(N)$ | $O(1)$ | `0 ms (100.00%)` | [solution.java](0206-reverse-linked-list/solution.java) | [README.md](0206-reverse-linked-list/README.md) |
| 0234 | [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Fast/Slow Pointers + Half Reversal | $O(N)$ | $O(1)$ | `3 ms (99.83%)` | [solution.java](0234-palindrome-linked-list/solution.java) | [README.md](0234-palindrome-linked-list/README.md) |
| 0876 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Fast & Slow Pointers ($2x$ Step) | $O(N)$ | $O(1)$ | `0 ms (100.00%)` | [solution.java](0876-middle-of-the-linked-list/solution.java) | [README.md](0876-middle-of-the-linked-list/README.md) |

---

[⬅️ Back to Main Repository](../README.md)
