<div align="center">

```
  ███╗   ███╗ ██████╗ ██████╗ ██╗   ██╗██╗     ███████╗     ██████╗ ███████╗
  ████╗ ████║██╔═══██╗██╔══██╗██║   ██║██║     ██╔════╝    ██╔═████╗██╔════╝
  ██╔████╔██║██║   ██║██║  ██║██║   ██║██║     █████╗      ██║██╔██║███████╗
  ██║╚██╔╝██║██║   ██║██║  ██║██║   ██║██║     ██╔══╝      ████╔╝██║╚════██║
  ██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝███████╗███████╗    ╚██████╔╝███████║
  ╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝     ╚═════╝ ╚══════╝
```

### 🟢 MODULE 05 • BINARY TREES, DFS & RECURSION
#### *Applied Coding Skills (S1L10) — Hierarchical Data & Traversal Tier*

<br/>

[![Solved Status](https://img.shields.io/badge/MODULE_STATUS-9%2F9_SOLVED-00f5d4?style=for-the-badge&logo=target&logoColor=000&labelColor=0d1117)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_EASY-7-10b981?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_MEDIUM-1-f59e0b?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Hard](https://img.shields.io/badge/🔴_HARD-1-ef4444?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/RUNTIME-JAVA_21+-f78166?style=for-the-badge&logo=openjdk&logoColor=fff&labelColor=0d1117)](https://www.java.com/)

<br/>

<p align="center">
  Focuses on binary tree traversals (Inorder, Preorder, Postorder, Vertical), depth-first search paradigms, tree symmetry, and recursive path accumulation.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

- **Depth-First Search (DFS):** Navigating complex tree structures using recursion and explicit stacks for Preorder, Inorder, and Postorder traversals.
- **Tree Symmetry & Equivalence:** Validating structural and value-based equivalence across distinct subtrees.
- **Path Accumulation:** Top-down recursive state passing to accumulate running sums and collect root-to-leaf paths.
- **Multi-Dimensional Sorting:** Utilizing custom comparators and Data Structures (Maps of TreeMaps/PriorityQueues) for complex traversals like Vertical Order.
- **Time/Space Tradeoffs:** Achieving $\mathcal{O}(N)$ traversal times with optimal $\mathcal{O}(H)$ recursive call stack space bounds.

<br/>

---

## 📋 Problem Directory & Performance

| # | Problem Title | Tier | Key Pattern / Concept | Time | Space | Performance (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| `0094` | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | DFS / Recursive Left-Root-Right | $\mathcal{O}(N)$ | $\mathcal{O}(H)$ | `⚡ 0 ms (100.00%)` | [solution.java](0094-binary-tree-inorder-traversal/solution.java) | [README.md](0094-binary-tree-inorder-traversal/README.md) |
| `0100` | [Same Tree](https://leetcode.com/problems/same-tree/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | DFS / Simultaneous Traversal | $\mathcal{O}(N)$ | $\mathcal{O}(H)$ | `⚡ 0 ms (100.00%)` | [solution.java](0100-same-tree/solution.java) | [README.md](0100-same-tree/README.md) |
| `0101` | [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | DFS / Mirrored Subtree Validation | $\mathcal{O}(N)$ | $\mathcal{O}(H)$ | `⚡ 0 ms (100.00%)` | [solution.java](0101-symmetric-tree/solution.java) | [README.md](0101-symmetric-tree/README.md) |
| `0112` | [Path Sum](https://leetcode.com/problems/path-sum/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | DFS / Top-Down Accumulation | $\mathcal{O}(N)$ | $\mathcal{O}(H)$ | `⚡ 0 ms (100.00%)` | [solution.java](0112-path-sum/solution.java) | [README.md](0112-path-sum/README.md) |
| `0113` | [Path Sum II](https://leetcode.com/problems/path-sum-ii/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Backtracking / Path Collection | $\mathcal{O}(N^2)$ | $\mathcal{O}(H)$ | `⚡ 1 ms (99.99%)` | [solution.java](0113-path-sum-ii/solution.java) | [README.md](0113-path-sum-ii/README.md) |
| `0144` | [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | DFS / Recursive Root-Left-Right | $\mathcal{O}(N)$ | $\mathcal{O}(H)$ | `⚡ 0 ms (100.00%)` | [solution.java](0144-binary-tree-preorder-traversal/solution.java) | [README.md](0144-binary-tree-preorder-traversal/README.md) |
| `0145` | [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | DFS / Recursive Left-Right-Root | $\mathcal{O}(N)$ | $\mathcal{O}(H)$ | `⚡ 0 ms (100.00%)` | [solution.java](0145-binary-tree-postorder-traversal/solution.java) | [README.md](0145-binary-tree-postorder-traversal/README.md) |
| `0257` | [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | DFS / String Building | $\mathcal{O}(N)$ | $\mathcal{O}(H)$ | `⚡ 1 ms (99.87%)` | [solution.java](0257-binary-tree-paths/solution.java) | [README.md](0257-binary-tree-paths/README.md) |
| `0987` | [Vertical Order Traversal of a Binary Tree](https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/) | ![Hard](https://img.shields.io/badge/🔴_Hard-ef4444?style=flat-square&labelColor=0d1117) | DFS + TreeMap / Custom Sorting | $\mathcal{O}(N \log N)$ | $\mathcal{O}(N)$ | `⚡ 3 ms (94.34%)` | [solution.java](0987-vertical-order-traversal-of-a-binary-tree/solution.java) | [README.md](0987-vertical-order-traversal-of-a-binary-tree/README.md) |

<br/>

---

## 💡 Pattern Deep Dive & Cheat Sheet

### 1. Depth-First Search (DFS) Traversal Orders
- **Preorder (Root, Left, Right):** Useful for duplicating trees or prefix expression generation.
- **Inorder (Left, Root, Right):** Essential for Binary Search Trees (BSTs) to retrieve elements in sorted order.
- **Postorder (Left, Right, Root):** Optimal for deleting trees or calculating aggregate subtree properties (e.g., height, sum).

### 2. Simultaneous Tree Validation (`0100`, `0101`)
- For comparing two trees, pass both nodes into the recursive function.
- **Base Case Checks:**
  - Both `null` $\implies$ valid.
  - One `null` (but not the other) $\implies$ invalid.
  - Values differ $\implies$ invalid.
- For symmetry, validate `left.left` against `right.right` and `left.right` against `right.left`.

### 3. Backtracking Path Accumulation (`0113`)
- When collecting paths from root to leaf, add the current node to the `path` list.
- If it's a leaf and the sum matches, append a **copy** of the `path` list to the `result`.
- **Crucial Step:** Remove the current node from the `path` list before returning up the call stack (backtracking).

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0094`, `0144`, `0145` • Basic Traversals
- **Concept:** Standard recursive implementations covering all three primary DFS visitation orders.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(H)$ where $H$ is tree height (recursive stack).
- **Edge Cases:** Empty tree, degenerate (skewed) tree where $\mathcal{O}(H)$ approaches $\mathcal{O}(N)$.

### `0100` • Same Tree
- **Concept:** Recursive structural and value-based comparison of two independent binary trees.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(H)$.
- **Edge Cases:** Trees with same structure but different values, identical values but different structure.

### `0101` • Symmetric Tree
- **Concept:** Compare left and right subtrees of a single root acting as mirror images of each other.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(H)$.
- **Edge Cases:** Asymmetric tree with identical values but differing node placements.

### `0112` • Path Sum
- **Concept:** Top-down recursive subtraction of node values from the `targetSum`. If leaf reached and remaining sum equals leaf value, return true.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(H)$.
- **Edge Cases:** Empty tree (returns false even if target is 0), negative values in nodes or target.

### `0113` • Path Sum II
- **Concept:** Full root-to-leaf path extraction using backtracking to manage the state of the current path list.
- **Complexity:** Time: $\mathcal{O}(N^2)$ (due to path copying) | Space: $\mathcal{O}(H)$ auxiliary.
- **Edge Cases:** Multiple valid paths, no valid paths.

### `0257` • Binary Tree Paths
- **Concept:** DFS accumulation of string paths. `StringBuilder` can be used to optimize string concatenations during recursive descents.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(H)$.
- **Edge Cases:** Single node tree.

### `0987` • Vertical Order Traversal of a Binary Tree
- **Concept:** Advanced traversal tracking explicit `(row, col)` coordinates. Utilizes a nested map structure like `TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>>` to automatically sort columns left-to-right, rows top-to-bottom, and values smallest-to-largest when coordinates tie.
- **Complexity:** Time: $\mathcal{O}(N \log N)$ (due to sorting/tree operations) | Space: $\mathcal{O}(N)$.
- **Edge Cases:** Nodes overlapping at identical coordinates (handled via PriorityQueue value sorting).

<br/>

---

<div align="center">

[⬅️ Back to Main Repository](../README.md)

</div>
