<div align="center">

```
  ███╗   ███╗ ██████╗ ██████╗ ██╗   ██╗██╗     ███████╗     ██████╗ ███████╗
  ████╗ ████║██╔═══██╗██╔══██╗██║   ██║██║     ██╔════╝    ██╔═████╗╚════██║
  ██╔████╔██║██║   ██║██║  ██║██║   ██║██║     █████╗      ██║██╔██║    ██╔╝
  ██║╚██╔╝██║██║   ██║██║  ██║██║   ██║██║     ██╔══╝      ████╔╝██║   ██╔╝ 
  ██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝███████╗███████╗    ╚██████╔╝   ██║  
  ╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝     ╚═════╝    ╚═╝  
```

### 🟣 MODULE 07 • GRAPHS — DFS, BFS & TOPOLOGICAL SORT
#### *Applied Coding Skills (S1L10) — Network Topology Tier*

<br/>

[![Solved Status](https://img.shields.io/badge/MODULE_STATUS-8%2F8_SOLVED-00f5d4?style=for-the-badge&logo=target&logoColor=000&labelColor=0d1117)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_EASY-2-10b981?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_MEDIUM-6-f59e0b?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/RUNTIME-JAVA_21+-f78166?style=for-the-badge&logo=openjdk&logoColor=fff&labelColor=0d1117)](https://www.java.com/)

<br/>

<p align="center">
  Moving from hierarchical trees to arbitrary networks, this module explores Graph Theory. You'll build adjacency lists, traverse complex state spaces using DFS and BFS, detect cyclic dependencies, and linearly order nodes using Topological Sort. These patterns map directly to routing algorithms, dependency managers, and social networks.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

Graphs remove the strict hierarchical rules of trees, requiring new tracking mechanisms to prevent infinite loops:

- **Graph Representation (Adjacency List):** Translating edge lists (e.g., `[[0,1], [1,2]]`) into queryable adjacency lists (`List<List<Integer>>`) mapping a node to its direct neighbors. This is the prerequisite step for almost all graph problems.

- **Grid Traversal as Graph Traversal:** Recognizing that a 2D matrix (like in Islands or Mazes) is implicitly a graph where each cell is a node and adjacent cells (up, down, left, right) are connected edges.

- **Cycle Detection (DFS Tracking):** To detect cycles in a directed graph, a simple `visited` array isn't enough. We need a `path` array (or recursion stack array) that tracks the nodes currently active in the *current* DFS path. If we hit a node already in the active path, a cycle exists.

- **Topological Sorting (Kahn's Algorithm):** An algorithm for scheduling tasks with prerequisites (Directed Acyclic Graphs). By tracking the "in-degree" (number of prerequisites) of each node, we process nodes with 0 in-degree, removing their edges, which reduces the in-degree of their neighbors, cascading until all tasks are sorted.

- **Multi-Source BFS:** Expanding breadth-first search from a *single* starting node to *multiple* starting nodes simultaneously. Essential for problems computing "shortest distance to the nearest target" (e.g., Rotting Oranges, shortest path to water).

<br/>

---

## 📋 Problem Directory & Performance

| # | Problem Title | Tier | Key Pattern / Concept | Time | Space | Performance (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| `0207` | [Course Schedule](https://leetcode.com/problems/course-schedule/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Cycle Detection (DFS Path Tracking) | $\mathcal{O}(V + E)$ | $\mathcal{O}(V + E)$ | `⚡ 4 ms (92.00%)` | [solution.java](0207-course-schedule/solution.java) | [README.md](0207-course-schedule/README.md) |
| `0210` | [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Topological Sort (Kahn's BFS) | $\mathcal{O}(V + E)$ | $\mathcal{O}(V + E)$ | `5 ms (81.30%)` | [solution.java](0210-course-schedule-ii/solution.java) | [README.md](0210-course-schedule-ii/README.md) |
| `0547` | [Number of Provinces](https://leetcode.com/problems/number-of-provinces/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Connected Components (DFS) | $\mathcal{O}(V^2)$ | $\mathcal{O}(V)$ | `2 ms (40.67%)` | [solution.java](0547-number-of-provinces/solution.java) | [README.md](0547-number-of-provinces/README.md) |
| `0695` | [Max Area of Island](https://leetcode.com/problems/max-area-of-island/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | 2D Grid DFS / Area Accumulation | $\mathcal{O}(R \times C)$ | $\mathcal{O}(R \times C)$ | `⚡ 2 ms (64.02%)` | [solution.java](0695-max-area-of-island/solution.java) | [README.md](0695-max-area-of-island/README.md) |
| `0841` | [Keys and Rooms](https://leetcode.com/problems/keys-and-rooms/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Graph Traversal (DFS) | $\mathcal{O}(V + E)$ | $\mathcal{O}(V)$ | `⚡ 0 ms (100.00%)` | [solution.java](0841-keys-and-rooms/solution.java) | [README.md](0841-keys-and-rooms/README.md) |
| `0997` | [Find the Town Judge](https://leetcode.com/problems/find-the-town-judge/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Directed Graph Degrees (Indegree Array) | $\mathcal{O}(V + E)$ | $\mathcal{O}(V)$ | `3 ms (73.09%)` | [solution.java](0997-find-the-town-judge/solution.java) | [README.md](0997-find-the-town-judge/README.md) |
| `1036` | [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Multi-Source BFS | $\mathcal{O}(R \times C)$ | $\mathcal{O}(R \times C)$ | `⚡ 2 ms (86.70%)` | [solution.java](1036-rotting-oranges/solution.java) | [README.md](1036-rotting-oranges/README.md) |
| `2121` | [Find if Path Exists in Graph](https://leetcode.com/problems/find-if-path-exists-in-graph/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Undirected Graph Connectivity | $\mathcal{O}(V + E)$ | $\mathcal{O}(V + E)$ | `157 ms (26.19%)` | [solution.java](2121-find-if-path-exists-in-graph/solution.java) | [README.md](2121-find-if-path-exists-in-graph/README.md) |

<br/>

---

## 💡 Pattern Deep Dive & Cheat Sheet

### 1. Topological Sorting (Kahn's Algorithm)

**When to use:** Resolving dependencies (course schedules, build systems, recipe tasks). Works only on Directed Acyclic Graphs (DAG).

**The logic:**
1. Compute the `in-degree` (number of incoming edges) for every node.
2. Add all nodes with `in-degree == 0` to a Queue.
3. While the Queue is not empty:
   - Pop a node, add it to your topological ordering.
   - For every neighbor of the popped node, decrement their `in-degree`.
   - If a neighbor's `in-degree` hits `0`, push it to the Queue.
4. If your final ordering length equals $V$, a valid sort exists. If shorter, there's a cycle.

```java
int[] inDegree = new int[numCourses];
// ... populate adjacency list and inDegree array ...

Queue<Integer> q = new LinkedList<>();
for (int i = 0; i < numCourses; i++) {
    if (inDegree[i] == 0) q.offer(i);
}

int count = 0;
while (!q.isEmpty()) {
    int node = q.poll();
    courseOrder[count++] = node;
    for (int neighbor : adj.get(node)) {
        if (--inDegree[neighbor] == 0) q.offer(neighbor);
    }
}
return count == numCourses ? courseOrder : new int[0];
```

### 2. Directed Cycle Detection via DFS

**When to use:** Detecting circular dependencies (A depends on B, B depends on A).

**The logic:** Maintain two boolean arrays: `visited` (has this node *ever* been explored?) and `path` (is this node currently active in the *current* recursive DFS call path?). If you encounter a neighbor that is `path[neighbor] == true`, you have looped back on yourself (a cycle). Make sure to set `path[node] = false` at the end of the recursive call (backtracking).

```java
private boolean dfs(int node, List<List<Integer>> adj, boolean[] vis, boolean[] path) {
    vis[node] = path[node] = true;  // Mark visited globally and in current path
    for (int next : adj.get(node)) {
        if (!vis[next] && dfs(next, adj, vis, path)) return true; // Cycle found deeper
        else if (path[next]) return true; // Back-edge detected! Cycle found here.
    }
    path[node] = false; // Backtrack out of the active path
    return false;
}
```

### 3. Multi-Source BFS

**When to use:** "Wave propagation" problems, like finding shortest distance from *any* 0 to a 1, or disease/rot spreading from multiple origin points.

**The logic:** Instead of putting one starting node in the queue, initialize the queue with **all** starting points (all rotten oranges, all water cells). The BFS naturally explores level-by-level outward from all sources simultaneously. The first time an unvisited cell is reached, it is guaranteed to be via the shortest possible path from *some* source.

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0207` • Course Schedule
- **What it's really asking:** Does this directed graph contain a cycle?
- **Concept:** DFS with two tracking arrays (`visited` and `path/recursion_stack`). Detecting a back-edge means a cycle exists.
- **Complexity:** Time: $\mathcal{O}(V + E)$ | Space: $\mathcal{O}(V + E)$ for adjacency list and recursion stack.
- **Edge Cases:** Disconnected graphs (must check all nodes, not just start at 0).

### `0210` • Course Schedule II
- **What it's really asking:** Perform a Topological Sort and return the ordering array.
- **Concept:** Kahn's Algorithm (BFS with In-degrees). Process nodes with zero dependencies, strip their outgoing edges, repeat.
- **Complexity:** Time: $\mathcal{O}(V + E)$ | Space: $\mathcal{O}(V + E)$.
- **Edge Cases:** Circular dependency exists (returns empty array), multiple valid orderings (any valid one is accepted).

### `0547` • Number of Provinces
- **What it's really asking:** Count the number of connected components in an undirected graph given an adjacency matrix.
- **Concept:** Loop through all nodes. If a node is unvisited, launch a DFS/BFS to visit the entire component and increment a counter. 
- **Complexity:** Time: $\mathcal{O}(V^2)$ reading matrix | Space: $\mathcal{O}(V)$ visited array.
- **Edge Cases:** Graph is fully disconnected ($V$ provinces), graph is fully connected (1 province).

### `0695` • Max Area of Island
- **What it's really asking:** Find the largest connected component of `1`s in a grid.
- **Concept:** Standard Grid DFS. The recursive function returns `1 + dfs(up) + dfs(down) + dfs(left) + dfs(right)`. Keep track of the maximum returned area. Mutating grid to `0` or using a `visited` matrix prevents infinite loops.
- **Complexity:** Time: $\mathcal{O}(R \times C)$ | Space: $\mathcal{O}(R \times C)$.
- **Edge Cases:** Grid with no 1s, grid entirely 1s.

### `0841` • Keys and Rooms
- **What it's really asking:** Can a graph traversal originating strictly at node `0` visit every node in the graph?
- **Concept:** The graph is already given as an adjacency list. Start a DFS/BFS from room `0` marking rooms as `visited`. If the total count of visited rooms equals `N`, return true.
- **Complexity:** Time: $\mathcal{O}(V + E)$ | Space: $\mathcal{O}(V)$.
- **Edge Cases:** Early completion (all rooms unlocked sequentially), disconnected rooms that contain keys to each other but not reachable from room 0.

### `0997` • Find the Town Judge
- **What it's really asking:** Find a node with out-degree `0` and in-degree `N-1`.
- **Concept:** Use a single array `count`. For edge `A -> B`, decrement `count[A]` and increment `count[B]`. The judge will be the only person with `count[i] == N - 1`.
- **Complexity:** Time: $\mathcal{O}(V + E)$ | Space: $\mathcal{O}(V)$.
- **Edge Cases:** $N=1$ and empty trust array (the 1 person is the judge), two people trust each other, no judge exists.

### `1036` • Rotting Oranges
- **What it's really asking:** Using multi-source BFS, find the max distance (minutes) to reach all target nodes (fresh oranges).
- **Concept:** Queue initially contains all rotten oranges. Each BFS level represents one minute. Count fresh oranges initially; decrement count when they rot. If fresh count > 0 at end, return -1.
- **Complexity:** Time: $\mathcal{O}(R \times C)$ | Space: $\mathcal{O}(R \times C)$.
- **Edge Cases:** No fresh oranges to begin with (returns 0 minutes), isolated fresh orange that can never be reached.

### `2121` • Find if Path Exists in Graph
- **What it's really asking:** Is there a valid route connecting a source node to a destination node in an undirected graph?
- **Concept:** Basic graph connectivity. Build the adjacency list from edges, then perform DFS or BFS from the source until you hit the destination.
- **Complexity:** Time: $\mathcal{O}(V + E)$ | Space: $\mathcal{O}(V + E)$.
- **Alternative:** Union-Find (Disjoint Set) is also a highly effective pattern for this.

<br/>

---

<div align="center">

[⬅️ Week 6 — BSTs & Heaps](../Week-6/) • [⬅️ Back to Main Repository](../README.md) • [➡️ Week 8 — Advanced Graphs](../Week-8/)

</div>
