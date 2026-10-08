<div align="center">

```
  ███╗   ███╗ ██████╗ ██████╗ ██╗   ██╗██╗     ███████╗     ██████╗  ██████╗
  ████╗ ████║██╔═══██╗██╔══██╗██║   ██║██║     ██╔════╝    ██╔═████╗██╔════╝
  ██╔████╔██║██║   ██║██║  ██║██║   ██║██║     █████╗      ██║██╔██║███████╗
  ██║╚██╔╝██║██║   ██║██║  ██║██║   ██║██║     ██╔══╝      ████╔╝██║██╔═══██╗
  ██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝███████╗███████╗    ╚██████╔╝╚██████╔╝
  ╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝     ╚═════╝  ╚═════╝ 
```

### 🟠 MODULE 06 • BSTS, HEAPS & PRIORITY QUEUES
#### *Applied Coding Skills (S1L10) — Ordered Data & Extremes Tier*

<br/>

[![Solved Status](https://img.shields.io/badge/MODULE_STATUS-6%2F6_SOLVED-00f5d4?style=for-the-badge&logo=target&logoColor=000&labelColor=0d1117)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_MEDIUM-6-f59e0b?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/RUNTIME-JAVA_21+-f78166?style=for-the-badge&logo=openjdk&logoColor=fff&labelColor=0d1117)](https://www.java.com/)

<br/>

<p align="center">
  This module introduces specialized data structures designed for <b>order and extremes</b>. Binary Search Trees (BSTs) provide logarithmic time lookups by maintaining strict sorted relationships. Priority Queues (Heaps) relax this restriction to focus purely on keeping the absolute minimum or maximum element at the top. Mastering these unlocks efficient solutions to "Top K" and scheduling problems.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

This week connects sorting algorithms with tree data structures to solve optimization problems:

- **BST Properties & Inorder Traversal:** A Binary Search Tree is defined by a strict invariant: all values in the left subtree are smaller, all values in the right are larger. The most critical corollary of this property is that an **Inorder Traversal of a valid BST always yields elements in sorted, strictly increasing order**.

- **Lowest Common Ancestor (LCA):** Finding where two paths diverge in a tree. In a general Binary Tree, this requires a bottom-up postorder traversal. However, in a BST, the structural invariant turns this into a top-down $\mathcal{O}(H)$ search — the LCA is simply the first node whose value falls *between* the two target values.

- **The Heap Property (Min-Heap & Max-Heap):** A complete binary tree where the parent is always smaller (or larger) than its children. This guarantees $\mathcal{O}(1)$ access to the extreme element, with $\mathcal{O}(\log N)$ insertions and deletions. Java's `PriorityQueue` implements a min-heap by default.

- **The "Top K" Pattern:** Whenever a problem asks for the "kth largest", "top k frequent", or "k closest", your first instinct should be a Heap. By maintaining a Min-Heap of size $K$, you can find the Top $K$ elements in a stream of size $N$ in $\mathcal{O}(N \log K)$ time, which is vastly superior to full sorting ($\mathcal{O}(N \log N)$).

- **Bucket Sort / Frequency Arrays:** For problems bounded by a fixed maximum frequency (like "Top K Frequent Elements"), bucket sort achieves $\mathcal{O}(N)$ time. Instead of sorting by frequency, create an array of lists where the index *is* the frequency, and the values are the elements.

<br/>

---

## 📋 Problem Directory & Performance

| # | Problem Title | Tier | Key Pattern / Concept | Time | Space | Performance (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| `0215` | [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Min-Heap / QuickSelect | $\mathcal{O}(N \log K)$ | $\mathcal{O}(K)$ | `31 ms (86.35%)` | [solution.java](0215-kth-largest-element-in-an-array/solution.java) | [README.md](0215-kth-largest-element-in-an-array/README.md) |
| `0230` | [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | DFS Inorder Traversal | $\mathcal{O}(N)$ | $\mathcal{O}(H)$ | `⚡ 0 ms (100.00%)` | [solution.java](0230-kth-smallest-element-in-a-bst/solution.java) | [README.md](0230-kth-smallest-element-in-a-bst/README.md) |
| `0235` | [LCA of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | BST Value Comparison Traversal | $\mathcal{O}(H)$ | $\mathcal{O}(1)$ | `⚡ 6 ms (97.07%)` | [solution.java](0235-lowest-common-ancestor-of-a-binary-search-tree/solution.java) | [README.md](0235-lowest-common-ancestor-of-a-binary-search-tree/README.md) |
| `0236` | [LCA of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | DFS Postorder Traversal | $\mathcal{O}(N)$ | $\mathcal{O}(H)$ | `17 ms (23.99%)` | [solution.java](0236-lowest-common-ancestor-of-a-binary-tree/solution.java) | [README.md](0236-lowest-common-ancestor-of-a-binary-tree/README.md) |
| `0347` | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Hash Map + Bucket Sort | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 11 ms (96.10%)` | [solution.java](0347-top-k-frequent-elements/solution.java) | [README.md](0347-top-k-frequent-elements/README.md) |
| `0373` | [Find K Pairs with Smallest Sums](https://leetcode.com/problems/find-k-pairs-with-smallest-sums/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Min-Heap / Matrix BFS | $\mathcal{O}(K \log K)$ | $\mathcal{O}(K)$ | `40 ms (30.86%)` | [solution.java](0373-find-k-pairs-with-smallest-sums/solution.java) | [README.md](0373-find-k-pairs-with-smallest-sums/README.md) |

<br/>

---

## 💡 Pattern Deep Dive & Cheat Sheet

### 1. The "Top K" Min-Heap Pattern

**When to use:** Finding the $K$ largest elements without sorting the entire array.

**The clever trick:** To find the $K$ *largest* elements, use a *Min-Heap* of size $K$. Why? Because the Min-Heap keeps the *smallest* of the "top contenders" at the root. If a new element is larger than the root, it knocks out the smallest contender. What remains in the heap at the end are the $K$ largest elements.

```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Default is min-heap
for (int num : nums) {
    minHeap.offer(num);
    if (minHeap.size() > k) {
        minHeap.poll(); // Evict the smallest element seen so far
    }
}
return minHeap.peek(); // The root is the Kth largest element
```

### 2. Lowest Common Ancestor (LCA) in a BST

**When to use:** Finding the first shared parent of two nodes in a sorted tree structure.

**The logic:** Since left values are smaller and right values are larger, the LCA is the *first* node whose value lies strictly between $p$ and $q$ (inclusive). If both $p$ and $q$ are smaller than the root, the LCA must be in the left subtree. If both are larger, it's in the right. If they split (one smaller, one larger), the current node is the LCA.

```java
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    int small = Math.min(p.val, q.val);
    int large = Math.max(p.val, q.val);
    while (root != null) {
        if (root.val > large) root = root.left;         // Go left
        else if (root.val < small) root = root.right;   // Go right
        else return root;                               // Split point found!
    }
    return null;
}
```

### 3. Bucket Sort for Frequencies

**When to use:** When you need to sort by frequency, and the maximum possible frequency is bounded by the array length $N$.

**The concept:** Instead of sorting a map's entries by value ($\mathcal{O}(N \log N)$), create an array of lists: `List<Integer>[] buckets = new ArrayList[N + 1]`. Let the index of the array represent the frequency. Iterate through your map and put each key into the bucket matching its frequency. Finally, iterate the buckets backwards (from highest frequency to lowest) to gather the top $K$. This is true $\mathcal{O}(N)$.

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0215` • Kth Largest Element in an Array
- **What it's really asking:** Find the $K$th largest without fully sorting.
- **Concept:** Using a PriorityQueue (Min-Heap) of size $K$ gives $\mathcal{O}(N \log K)$. Alternatively, QuickSelect achieves $\mathcal{O}(N)$ average time. The provided solution uses standard array sorting which is $\mathcal{O}(N \log N)$, acceptable but not the optimal heap pattern.
- **Complexity:** Time: $\mathcal{O}(N \log N)$ (Sort) or $\mathcal{O}(N \log K)$ (Heap) | Space: $\mathcal{O}(1)$ or $\mathcal{O}(K)$.
- **Edge Cases:** $K = 1$ (max element), $K = N$ (min element).

### `0230` • Kth Smallest Element in a BST
- **What it's really asking:** Traverse the BST in sorted order and stop at the $K$th element.
- **Concept:** Inorder Traversal (Left, Root, Right). Use a global/class variable to keep track of the count of visited nodes. When `count == k`, record the answer and return early to prune the search.
- **Complexity:** Time: $\mathcal{O}(H + K)$ (where $H$ is height) | Space: $\mathcal{O}(H)$ for call stack.
- **Edge Cases:** $K = 1$ (leftmost leaf).

### `0235` • Lowest Common Ancestor of a Binary Search Tree
- **What it's really asking:** Find the split point where path to $p$ and path to $q$ diverge, leveraging BST sorted properties.
- **Concept:** Simple magnitude comparison. If both targets are on the same side of the current node, move that direction. The first node where they span across the value (or equal it) is the LCA.
- **Complexity:** Time: $\mathcal{O}(H)$ | Space: $\mathcal{O}(1)$ (iterative).
- **Edge Cases:** $p$ is a descendant of $q$ (returns $q$).

### `0236` • Lowest Common Ancestor of a Binary Tree
- **What it's really asking:** Find the LCA without BST properties (nodes are unordered).
- **Concept:** DFS Postorder traversal. A node is the LCA if it receives a non-null return from *both* its left and right recursive calls. If only one call returns a node, pass that node up.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(H)$.
- **Edge Cases:** Target nodes are deep in the tree on opposite sides.

### `0347` • Top K Frequent Elements
- **What it's really asking:** Count frequencies, then return the $K$ elements with the highest counts.
- **Concept:** Two parts: (1) `HashMap` to count frequencies. (2) Bucket Sort (array of lists where index = frequency) or a Max-Heap to extract the top $K$. Bucket sort guarantees $\mathcal{O}(N)$ time.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** All elements have same frequency, multiple elements tied for $K$th place.

### `0373` • Find K Pairs with Smallest Sums
- **What it's really asking:** Given two sorted arrays, find the $K$ pairs with the minimum combined sum.
- **Concept:** Treat the pairs as a matrix where `matrix[i][j] = nums1[i] + nums2[j]`. Because arrays are sorted, the matrix is sorted across rows and columns. Use a Min-Heap initialized with the first column `(nums1[i] + nums2[0])`. Extract the minimum, then push its neighbor `(nums1[i] + nums2[j+1])`.
- **Complexity:** Time: $\mathcal{O}(K \log K)$ | Space: $\mathcal{O}(K)$.
- **Edge Cases:** $K$ is larger than all possible combinations (return all pairs).

<br/>

---

<div align="center">

[⬅️ Week 5 — Binary Trees](../Week-5/) • [⬅️ Back to Main Repository](../README.md) • [➡️ Week 7 — Graphs](../Week-7/)

</div>
