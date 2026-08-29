<div align="center">

```
  ███╗   ███╗ ██████╗ ██████╗ ██╗   ██╗██╗     ███████╗     ██████╗ ██╗  ██╗
  ████╗ ████║██╔═══██╗██╔══██╗██║   ██║██║     ██╔════╝    ██╔═████╗██║  ██║
  ██╔████╔██║██║   ██║██║  ██║██║   ██║██║     █████╗      ██║██╔██║███████║
  ██║╚██╔╝██║██║   ██║██║  ██║██║   ██║██║     ██╔══╝      ████╔╝██║╚════██║
  ██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝███████╗███████╗    ╚██████╔╝     ██║
  ╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝     ╚═════╝      ╚═╝
```

### 🟡 MODULE 04 • QUEUES, MONOTONIC DEQUES & TREE BFS
#### *Applied Coding Skills (S1L10) — FIFO, Monotonic Window & Hierarchical Traversal Tier*

<br/>

[![Solved Status](https://img.shields.io/badge/MODULE_STATUS-4%2F4_SOLVED-00f5d4?style=for-the-badge&logo=target&logoColor=000&labelColor=0d1117)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_EASY-1-10b981?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_MEDIUM-2-f59e0b?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Hard](https://img.shields.io/badge/🔴_HARD-1-ef4444?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/RUNTIME-JAVA_21+-f78166?style=for-the-badge&logo=openjdk&logoColor=fff&labelColor=0d1117)](https://www.java.com/)

<br/>

<p align="center">
  Focuses on FIFO queue dynamics, stack simulation via queue rotations, sliding window boundary optimizations using monotonic double-ended queues (Deques), and breadth-first level-order tree traversals.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory) • [🎯 CORE OBJECTIVES](#-core-learning-objectives)

---

</div>

<br/>

## 🎯 Core Learning Objectives

- **FIFO vs LIFO State Simulation:** Simulating stack push/pop semantics using single or double queue cycles in $\mathcal{O}(N)$ push and $\mathcal{O}(1)$ pop.
- **Monotonic Deque Window Optimization:** Maintaining elements in monotonic decreasing/increasing order within a sliding window to achieve $\mathcal{O}(1)$ amortized extrema queries in $\mathcal{O}(N)$ total time.
- **Dual Deque Difference Maintenance:** Tracking simultaneous minimum and maximum values over an expanding/contracting subarray window to satisfy strict limit constraints.
- **Level-by-Level Tree Traversal (BFS):** Processing hierarchical tree nodes level-by-level using size-bounded queue iterations in $\mathcal{O}(N)$ time and $\mathcal{O}(W)$ space.

<br/>

---

## 📋 Problem Directory & Performance

| # | Problem Title | Tier | Key Pattern / Concept | Time | Space | Performance (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| `0102` | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | BFS / Queue Level-Order Traversal | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 1 ms (95.86%)` | [solution.java](0102-binary-tree-level-order-traversal/solution.java) | [README.md](0102-binary-tree-level-order-traversal/README.md) |
| `0225` | [Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | FIFO Queue Cycle Rotation | $\mathcal{O}(N)$ push / $\mathcal{O}(1)$ pop | $\mathcal{O}(N)$ | `⚡ 1 ms (82.98%)` | [solution.java](0225-implement-stack-using-queues/solution.java) | [README.md](0225-implement-stack-using-queues/README.md) |
| `0239` | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | ![Hard](https://img.shields.io/badge/🔴_Hard-ef4444?style=flat-square&labelColor=0d1117) | Monotonic Decreasing Deque (Indices) | $\mathcal{O}(N)$ | $\mathcal{O}(k)$ | `42 ms (14.62%)` | [solution.java](0239-sliding-window-maximum/solution.java) | [README.md](0239-sliding-window-maximum/README.md) |
| `1438` | [Longest Continuous Subarray With Diff Limit](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Sliding Window + Dual Monotonic Deques | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 28 ms (98.47%)` | [solution.java](1438-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/solution.java) | [README.md](1438-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/README.md) |

<br/>

---

<div align="center">

[⬅️ Back to Main Repository](../README.md)

</div>
