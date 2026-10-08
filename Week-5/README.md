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
  Transitioning from linear structures to <b>hierarchical structures</b>, this module dives deep into Binary Trees. The core engine here is <b>Depth-First Search (DFS)</b> using recursion. You'll master the art of top-down state passing, bottom-up result aggregation, backtracking to collect paths, and structural validation across multiple trees simultaneously.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

This week focuses heavily on recursive thinking. The challenge is learning to trust the recursive leap of faith: assuming your function works for subtrees and using those results to solve for the root.

- **Depth-First Search (DFS) Traversal Orders:** Mastering the big three: Preorder (Root-Left-Right), Inorder (Left-Root-Right), and Postorder (Left-Right-Root). Knowing which to use is critical. Preorder is for duplicating trees, Inorder sorts BSTs, and Postorder is used when a node's answer depends entirely on its children (like tree height or deletion).

- **Simultaneous Tree Validation:** Comparing two separate trees (or mirroring subtrees of the same tree) by passing nodes from both into the same recursive function. The base case checks (`null` vs `null`) handle structural differences before value differences are checked.

- **Top-Down State Accumulation:** Passing information *down* the tree via recursive function arguments. For example, passing the running path sum or the current `String` path to child nodes so they know the history of how they were reached.

- **Backtracking Path Collection:** When finding all valid paths from root to leaf, you must manage a single shared `List`. As you traverse down, you add the node. Crucially, as you return up the call stack, you must *remove* that node so it doesn't leak into sibling paths.

- **Multi-Dimensional Coordinate Tracking:** Trees don't exist purely logically; sometimes we care about physical coordinates. Combining DFS with complex Maps (e.g., `TreeMap<Col, TreeMap<Row, PriorityQueue<Val>>>`) to flatten a 2D hierarchical structure into a 1D vertical order based on geometric overlapping rules.

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

The structure of recursive DFS is remarkably consistent. The only difference is where you process the current node relative to the recursive calls.

```java
public void dfs(TreeNode node) {
    if (node == null) return;
    
    // PREORDER: Process here (Root, Left, Right)
    
    dfs(node.left);
    
    // INORDER: Process here (Left, Root, Right)
    
    dfs(node.right);
    
    // POSTORDER: Process here (Left, Right, Root)
}
```
**Complexity:** Time $\mathcal{O}(N)$, Space $\mathcal{O}(H)$ where $H$ is the height of the tree (due to the call stack).

### 2. Simultaneous Tree Validation (`0100`, `0101`)

**When to use:** Checking if two trees are identical, or if a single tree is symmetric (left subtree is mirror of right subtree).

**The Base Case Trick:** When comparing nodes `p` and `q`, handle the `null` cases first. If both are `null`, they match. If one is `null` and the other isn't, they don't. Only then is it safe to compare `p.val` and `q.val`.

```java
// For Symmetric Tree (passing left and right children of root)
private boolean isMirror(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;
    
    // Root values must match, and opposite subtrees must match
    return (t1.val == t2.val) 
        && isMirror(t1.left, t2.right) 
        && isMirror(t1.right, t2.left);
}
```

### 3. Backtracking Path Accumulation (`0113`)

**When to use:** When you need to collect elements into a single list as you walk down a tree, but you need those elements removed when you walk back up so they don't affect other branches.

```java
public void backtrack(TreeNode node, int currentSum, List<Integer> path, List<List<Integer>> res) {
    if (node == null) return;
    
    path.add(node.val); // Add current state
    
    // Check if leaf node
    if (node.left == null && node.right == null && currentSum == node.val) {
        res.add(new ArrayList<>(path)); // MUST add a copy of the path!
    } else {
        // Continue exploring
        backtrack(node.left, currentSum - node.val, path, res);
        backtrack(node.right, currentSum - node.val, path, res);
    }
    
    path.remove(path.size() - 1); // BACKTRACK: Remove current state before returning
}
```
**Why copy the path?** If you do `res.add(path)`, you add a reference to the same list. By the end of traversal, that list will be empty (due to backtracking), and your result will be a list of empty lists.

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0094`, `0144`, `0145` • Basic Traversals
- **What it's really asking:** Traverse the tree in a specific order and return the node values in a list.
- **Concept:** Standard recursive implementations covering Preorder, Inorder, and Postorder. 
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(H)$ for the recursive call stack (can be $\mathcal{O}(N)$ in the worst case of a skewed tree).
- **Edge Cases:** Empty tree (`null`), completely skewed tree (linked list equivalent).

### `0100` • Same Tree
- **What it's really asking:** Do these two independent tree roots point to structurally identical trees with identical node values?
- **Concept:** Recursive simultaneous traversal. Base cases handle structural disparities, recursive calls handle value/subtree comparisons.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(H)$.
- **Edge Cases:** Trees with same structure but different values, identical values but different structure (e.g., node 1 with left child 2 vs node 1 with right child 2).

### `0101` • Symmetric Tree
- **What it's really asking:** Is the tree a mirror reflection of itself across the center axis?
- **Concept:** Compare left and right subtrees of a single root acting as mirror images. `left.left` must match `right.right`, and `left.right` must match `right.left`.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(H)$.
- **Edge Cases:** Asymmetric tree with identical values but differing node placements.

### `0112` • Path Sum
- **What it's really asking:** Does ANY root-to-leaf path exist where the node values sum exactly to `targetSum`?
- **Concept:** Top-down recursive subtraction. As you visit each node, subtract its value from the `targetSum`. If you hit a leaf and the remaining target equals the leaf's value, you've found a path.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(H)$.
- **Edge Cases:** Empty tree (returns false even if target is 0), negative values in nodes or target (can't prune early just because sum drops below 0).

### `0113` • Path Sum II
- **What it's really asking:** Find ALL root-to-leaf paths that sum to `targetSum` and return them as lists of values.
- **Concept:** Path accumulation using backtracking. The key is sharing a single `List<Integer>` across recursive calls, adding nodes on the way down, and removing them on the way up.
- **Complexity:** Time: $\mathcal{O}(N^2)$ worst case (when tree is a balanced tree full of valid paths, creating copies of length $H$ takes time) | Space: $\mathcal{O}(H)$ auxiliary.
- **Edge Cases:** Multiple valid paths, no valid paths.

### `0257` • Binary Tree Paths
- **What it's really asking:** Return all root-to-leaf paths as formatted strings like `"1->2->5"`.
- **Concept:** DFS accumulation of string paths. Instead of a list with backtracking, strings are immutable in Java. Passing `path + node.val + "->"` creates a new string for each branch naturally avoiding the need to backtrack manually.
- **Complexity:** Time: $\mathcal{O}(N^2)$ (due to string concatenation copying) | Space: $\mathcal{O}(N \log N)$ for string storage in call stack.
- **Optimization:** For peak performance, use `StringBuilder` and manually backtrack its length.
- **Edge Cases:** Single node tree (no arrows).

### `0987` • Vertical Order Traversal of a Binary Tree
- **What it's really asking:** Group nodes by vertical column (from left to right). Within a column, order them from top to bottom. If nodes overlap at the exact same row/col, sort them by value.
- **Concept:** Combine DFS with geometric coordinates `(row, col)`. Root is `(0, 0)`, left child is `(row + 1, col - 1)`, right child is `(row + 1, col + 1)`. Use a nested map structure: `TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>>` to automatically sort columns (outer key), rows (inner key), and overlapping values (PriorityQueue).
- **Complexity:** Time: $\mathcal{O}(N \log N)$ (due to map/heap sorting) | Space: $\mathcal{O}(N)$.
- **Edge Cases:** Overlapping nodes (handled properly by the PriorityQueue).

<br/>

---

## 🔗 Connections to Other Weeks

| This Week's Pattern | Where It Reappears |
|:---|:---|
| Recursion & Backtracking | → Backtracking through Graphs (Week 7, Week 8) |
| DFS | → Graph DFS (Week 7) |
| Inorder Traversal | → Binary Search Trees (Week 6) |
| Postorder Traversal | → Evaluating ASTs, tree deletion |

<br/>

---

<div align="center">

[⬅️ Week 4 — Queues & Deques](../Week-4/) • [⬅️ Back to Main Repository](../README.md) • [➡️ Week 6 — BSTs & Heaps](../Week-6/)

</div>
