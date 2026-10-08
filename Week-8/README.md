<div align="center">

```
  ███╗   ███╗ ██████╗ ██████╗ ██╗   ██╗██╗     ███████╗     ██████╗  █████╗ 
  ████╗ ████║██╔═══██╗██╔══██╗██║   ██║██║     ██╔════╝    ██╔═████╗██╔══██╗
  ██╔████╔██║██║   ██║██║  ██║██║   ██║██║     █████╗      ██║██╔██║╚█████╔╝
  ██║╚██╔╝██║██║   ██║██║  ██║██║   ██║██║     ██╔══╝      ████╔╝██║██╔══██╗
  ██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝███████╗███████╗    ╚██████╔╝╚█████╔╝
  ╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝     ╚═════╝  ╚════╝ 
```

### 🔴 MODULE 08 • ADVANCED GRAPHS, UNION-FIND & MULTI-SOURCE BFS
#### *Applied Coding Skills (S1L10) — Complex Network Algorithms Tier*

<br/>

[![Solved Status](https://img.shields.io/badge/MODULE_STATUS-9%2F9_SOLVED-00f5d4?style=for-the-badge&logo=target&logoColor=000&labelColor=0d1117)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_EASY-3-10b981?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_MEDIUM-5-f59e0b?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Hard](https://img.shields.io/badge/🔴_HARD-1-ef4444?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/RUNTIME-JAVA_21+-f78166?style=for-the-badge&logo=openjdk&logoColor=fff&labelColor=0d1117)](https://www.java.com/)

<br/>

<p align="center">
  The final module tackles complex graph scenarios. You'll master the <b>Disjoint Set (Union-Find)</b> structure for lightning-fast connected component queries, handle graphs where edges have properties (colors/states), build multi-level topological sorts (groups containing items), and apply cycle detection algorithms to abstract mathematical spaces.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

This week elevates graph theory by introducing advanced structures and state-tracking constraints:

- **Disjoint Sets (Union-Find):** A specialized tree-based structure used exclusively for determining if two elements belong to the same group, and for merging groups. By combining **Path Compression** (flattening the tree during searches) and **Union by Rank** (attaching smaller trees under taller ones), operations run in nearly $\mathcal{O}(1)$ time — specifically $\mathcal{O}(\alpha(N))$ where $\alpha$ is the Inverse Ackermann function.

- **State-Tracking BFS:** When navigating networks where edges have properties (e.g., alternating colors), a standard `visited` array isn't enough. We must track the `(node, state)` combination. This guarantees we don't infinitely loop on the same colored edge while still allowing revisitation of a node if approached via a different state.

- **Multi-Level Graph Sorting:** When nodes belong to subgroups, standard topological sort fails. The solution requires building *two* separate dependency graphs: one for the groups themselves, and one for the items within the groups.

- **Abstract Cycle Detection:** Floyd's Tortoise and Hare algorithm isn't just for linked lists. It can detect cycles in *any* state machine where $f(x)$ produces the next state. "Happy Number" demonstrates this perfectly by treating sum-of-squares as the function generating the next "node" in an abstract graph.

<br/>

---

## 📋 Problem Directory & Performance

| # | Problem Title | Tier | Key Pattern / Concept | Time | Space | Performance (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| `0049` | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Hash Map with Sorted String Key | $\mathcal{O}(N \times K \log K)$ | $\mathcal{O}(NK)$ | `⚡ 6 ms (98.97%)` | [solution.java](0049-group-anagrams/solution.java) | [README.md](0049-group-anagrams/README.md) |
| `0200` | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Grid DFS / BFS Components | $\mathcal{O}(R \times C)$ | $\mathcal{O}(R \times C)$ | `4 ms (46.55%)` | [solution.java](0200-number-of-islands/solution.java) | [README.md](0200-number-of-islands/README.md) |
| `0202` | [Happy Number](https://leetcode.com/problems/happy-number/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Cycle Detection (Floyd's Algorithm) | $\mathcal{O}(\log N)$ | $\mathcal{O}(1)$ | `1 ms (78.08%)` | [solution.java](0202-happy-number/solution.java) | [README.md](0202-happy-number/README.md) |
| `0542` | [01 Matrix](https://leetcode.com/problems/01-matrix/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Multi-Source BFS | $\mathcal{O}(R \times C)$ | $\mathcal{O}(R \times C)$ | `13 ms (90.86%)` | [solution.java](0542-01-matrix/solution.java) | [README.md](0542-01-matrix/README.md) |
| `0721` | [Accounts Merge](https://leetcode.com/problems/accounts-merge/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Disjoint Set / Union-Find | $\mathcal{O}(NK \log NK)$ | $\mathcal{O}(NK)$ | `29 ms (80.41%)` | [solution.java](0721-accounts-merge/solution.java) | [README.md](0721-accounts-merge/README.md) |
| `0733` | [Flood Fill](https://leetcode.com/problems/flood-fill/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Grid DFS / Wave Propagation | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 0 ms (100.00%)` | [solution.java](0733-flood-fill/solution.java) | [README.md](0733-flood-fill/README.md) |
| `0929` | [Unique Email Addresses](https://leetcode.com/problems/unique-email-addresses/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | String Manipulation & HashSet | $\mathcal{O}(N \times L)$ | $\mathcal{O}(N \times L)$ | `13 ms (52.32%)` | [solution.java](0929-unique-email-addresses/solution.java) | [README.md](0929-unique-email-addresses/README.md) |
| `1129` | [Shortest Path with Alternating Colors](https://leetcode.com/problems/shortest-path-with-alternating-colors/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | BFS with Edge States | $\mathcal{O}(V + E)$ | $\mathcal{O}(V + E)$ | `11 ms (12.61%)` | [solution.java](1129-shortest-path-with-alternating-colors/solution.java) | [README.md](1129-shortest-path-with-alternating-colors/README.md) |
| `1203` | [Sort Items by Groups Respecting Dependencies](https://leetcode.com/problems/sort-items-by-groups-respecting-dependencies/) | ![Hard](https://img.shields.io/badge/🔴_Hard-ef4444?style=flat-square&labelColor=0d1117) | Multi-Level Topological Sort | $\mathcal{O}(V + E)$ | $\mathcal{O}(V + E)$ | `41 ms (31.01%)` | [solution.java](1203-sort-items-by-groups-respecting-dependencies/solution.java) | [README.md](1203-sort-items-by-groups-respecting-dependencies/README.md) |

<br/>

---

## 💡 Pattern Deep Dive & Cheat Sheet

### 1. Disjoint Set / Union-Find Engine

**When to use:** Tracking connected components, checking if a path exists between two nodes, or clustering identical items together (like merging accounts).

**The Template:** Always include Path Compression in `find` and Union by Rank (or Size) in `union`.

```java
class DisjointSet {
    int[] parent, rank;
    DisjointSet(int n) {
        parent = new int[n]; rank = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }
    // Find with Path Compression
    int findUltimateParent(int node) {
        if (parent[node] == node) return node;
        return parent[node] = findUltimateParent(parent[node]); 
    }
    // Union by Rank
    void unionByRank(int u, int v) {
        int pu = findUltimateParent(u);
        int pv = findUltimateParent(v);
        if (pu == pv) return;
        if (rank[pu] < rank[pv]) parent[pu] = pv;
        else if (rank[pv] < rank[pu]) parent[pv] = pu;
        else {
            parent[pv] = pu;
            rank[pu]++;
        }
    }
}
```

### 2. State-Space BFS Tracking

**When to use:** When you navigate a graph but have restrictions based on history (e.g., must alternate edge colors, have exactly $k$ keys, can use at most $k$ obstacles).

**The logic:** Instead of a `visited` boolean array `boolean[] vis = new boolean[V]`, you need a multi-dimensional array or a `Set<String>` to track the state vector. For alternating paths: `boolean[][] vis = new boolean[V][2]`. We can revisit a node, provided we arrived there via a different state (red edge vs blue edge).

```java
// Inside the BFS loop for alternating paths
for (Pair<Integer, Color> neighbor : graph[u]) {
    int v = neighbor.getKey();
    Color edgeColor = neighbor.getValue();
    
    if (edgeColor == prevColor) continue; // Must alternate!
    
    // Have we visited this node arriving on THIS color edge before?
    if (!visited[v][edgeColor.ordinal()]) {
        visited[v][edgeColor.ordinal()] = true;
        q.offer(new Pair<>(v, edgeColor));
    }
}
```

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0049` • Group Anagrams
- **What it's really asking:** Group strings that have the exact same characters in the exact same frequencies.
- **Concept:** Sort each string to create a canonical key, or use a frequency array converted to a string as the key. Store in a HashMap mapping `Key -> List of Strings`.
- **Complexity:** Time: $\mathcal{O}(N \times K \log K)$ | Space: $\mathcal{O}(NK)$.
- **Edge Cases:** Empty strings, identical strings, strings with one character.

### `0200` • Number of Islands
- **What it's really asking:** Count the distinct connected components of `1`s (land) in a grid.
- **Concept:** Iterate through every cell. Upon finding an unvisited `1`, increment island count and launch a DFS/BFS to mark the entire component as visited (or mutate to `0`).
- **Complexity:** Time: $\mathcal{O}(R \times C)$ | Space: $\mathcal{O}(R \times C)$ (call stack).
- **Edge Cases:** All water, all land, zig-zag island patterns.

### `0202` • Happy Number
- **What it's really asking:** Is there a cycle when repeatedly summing the squares of digits, or does it reach 1?
- **Concept:** This is implicitly a directed graph where edges are the sum-of-squares mathematical function. You can solve it using a `HashSet` to detect revisitation, OR use Floyd's Fast & Slow pointers (Tortoise and Hare) for $\mathcal{O}(1)$ space cycle detection!
- **Complexity:** Time: $\mathcal{O}(\log N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Single digit input (7 is happy, 2 is not).

### `0542` • 01 Matrix
- **What it's really asking:** Find the shortest Manhattan distance to the nearest `0` for every cell containing `1`.
- **Concept:** Multi-Source BFS. Start by enqueuing ALL `0` cells and mark all `1` cells as `MAX_VALUE`. Pop `0`s, visit neighbors, update distance (`mat[row][col] + 1`), and push neighbors into the queue.
- **Complexity:** Time: $\mathcal{O}(R \times C)$ | Space: $\mathcal{O}(R \times C)$.
- **Edge Cases:** Grid with mostly 0s, grid with mostly 1s and a single 0.

### `0721` • Accounts Merge
- **What it's really asking:** Merge clusters of emails. If two accounts share an email, they belong to the same person.
- **Concept:** Classic Disjoint Set application. 
  1. Map each email to the Account Index it belongs to.
  2. If an email is already mapped, `Union` the current account index with the existing mapped index.
  3. Re-group all emails by finding their `ultimate parent` index.
  4. Sort emails per group.
- **Complexity:** Time: $\mathcal{O}(NK \log NK)$ due to sorting merged emails | Space: $\mathcal{O}(NK)$.
- **Edge Cases:** Same names but completely disjoint emails (different people), single massive chain of interconnected accounts.

### `0733` • Flood Fill
- **What it's really asking:** Given a starting pixel, change its color and all connected pixels of the same original color to a new color.
- **Concept:** Standard DFS/BFS grid traversal. Only visit neighbors that match the original starting color. 
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$ where N is number of pixels.
- **Edge Cases:** Starting pixel is already the target color (must return immediately to avoid infinite loop!).

### `0929` • Unique Email Addresses
- **What it's really asking:** Normalize email addresses according to rules (`.` ignored, `+` truncates) and count unique recipients.
- **Concept:** String manipulation. Split into local and domain. Remove `.` and truncate at `+` for local part. Add `local + "@" + domain` to a `HashSet` to count unique values.
- **Complexity:** Time: $\mathcal{O}(N \times L)$ | Space: $\mathcal{O}(N \times L)$.
- **Edge Cases:** Emails with no `.` or `+`, multiple `+` symbols (only the first matters).

### `1129` • Shortest Path with Alternating Colors
- **What it's really asking:** Shortest path from node `0` to every node, strictly alternating red and blue edges.
- **Concept:** State-tracking BFS. The Queue stores pairs of `(Node, IncomingEdgeColor)`. Initially, start with both a Red and Blue dummy incoming edge at Node 0. To prevent infinite loops, edges themselves must be marked as "used" or the `(Node, Color)` state marked as visited.
- **Complexity:** Time: $\mathcal{O}(V + E)$ | Space: $\mathcal{O}(V + E)$.
- **Edge Cases:** Disconnected nodes, self-loops, parallel edges of different colors.

### `1203` • Sort Items by Groups Respecting Dependencies
- **What it's really asking:** Order items so that all items in the same group are contiguous, and respect prerequisites at both the group level and item level.
- **Concept:** Multi-Level Topological Sort.
  1. Assign a unique ID to any item lacking a group (`-1`).
  2. Build two dependency graphs: `itemGraph` and `groupGraph` (if an item depends on an item in a different group, that group depends on the other group).
  3. Perform topological sorts on BOTH graphs.
  4. Fill groups based on the sorted items, then append groups together based on the sorted groups.
- **Complexity:** Time: $\mathcal{O}(V + E)$ | Space: $\mathcal{O}(V + E)$.
- **Edge Cases:** Circular dependencies within a group, circular dependencies between groups.

<br/>

---

<div align="center">

[⬅️ Week 7 — Graphs](../Week-7/) • [⬅️ Back to Main Repository](../README.md)

</div>
