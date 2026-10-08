<div align="center">

```
  ███╗   ███╗ ██████╗ ██████╗ ██╗   ██╗██╗     ███████╗     ██████╗ ██╗  ██╗
  ████╗ ████║██╔═══██╗██╔══██╗██║   ██║██║     ██╔════╝    ██╔═████╗██║  ██║
  ██╔████╔██║██║   ██║██║  ██║██║   ██║██║     █████╗      ██║██╔██║███████║
  ██║╚██╔╝██║██║   ██║██║  ██║██║   ██║██║     ██╔══╝      ████╔╝██║╚════██║
  ██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝███████╗███████╗    ╚██████╔╝     ██║
  ╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝     ╚═════╝      ╚═╝
```

### 🟡 MODULE 04 • QUEUES, RING BUFFERS, MONOTONIC DEQUES & TREE BFS
#### *Applied Coding Skills (S1L10) — FIFO, Monotonic Window & Hierarchical Traversal Tier*

<br/>

[![Solved Status](https://img.shields.io/badge/MODULE_STATUS-9%2F9_SOLVED-00f5d4?style=for-the-badge&logo=target&logoColor=000&labelColor=0d1117)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_EASY-2-10b981?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_MEDIUM-6-f59e0b?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Hard](https://img.shields.io/badge/🔴_HARD-1-ef4444?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/RUNTIME-JAVA_21+-f78166?style=for-the-badge&logo=openjdk&logoColor=fff&labelColor=0d1117)](https://www.java.com/)

<br/>

<p align="center">
  While stacks process the <i>most recent</i> item (LIFO), queues process the <i>oldest</i> item (FIFO). This module explores how FIFO ordering enables <b>level-by-level tree traversals</b>, how <b>circular ring buffers</b> implement fixed-capacity queues without memory allocation, and how <b>monotonic deques</b> extend the monotonic stack concept to sliding windows — maintaining the maximum (or minimum) of any window in $\mathcal{O}(1)$ amortized time.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

This week bridges abstract data structures (queues) with two major applications — tree traversal and window optimization:

- **Circular Buffer Mechanics:** Real-world systems (network packet buffers, OS task queues, audio streaming) use fixed-size ring buffers rather than dynamically resizing arrays. Using modular arithmetic (`(index + 1) % capacity`), the buffer wraps around seamlessly. Tracking `size` explicitly separates the "empty" state (`size == 0`) from "full" (`size == capacity`) — a subtle but critical distinction that `front == rear` alone cannot resolve.

- **Monotonic Deque Window Optimization:** The natural evolution of Week 3's monotonic stacks. A monotonic deque maintains elements in sorted order while also supporting **expiration** from the front (removing elements that have slid out of the window). This gives $\mathcal{O}(1)$ amortized access to the sliding window maximum/minimum — a problem that would be $\mathcal{O}(N \cdot k)$ with brute force and $\mathcal{O}(N \log k)$ with a balanced BST.

- **Dual Monotonic Deques:** For problems with constraints like "the difference between max and min in the window must be ≤ limit", maintaining two deques simultaneously (one for max, one for min) provides $\mathcal{O}(1)$ access to both extremes. When the constraint is violated, shrink the window from the left.

- **Level-by-Level Tree BFS:** Breadth-first search processes all nodes at depth $d$ before any node at depth $d+1$. The key technique is snapshotting the queue size at the start of each level: `int levelSize = queue.size()`. This tells you exactly how many nodes belong to the current level, enabling per-level operations (collecting level lists, finding rightmost node, computing level averages).

- **Greedy Task Scheduling:** The task scheduler problem reveals an elegant mathematical insight — optimal scheduling depends on the frequency of the most common task, not on simulation. The formula `(maxFreq - 1) * (n + 1) + countOfMaxFreq` computes the minimum intervals directly.

<br/>

---

## 📋 Problem Directory & Performance

| # | Problem Title | Tier | Key Pattern / Concept | Time | Space | Performance (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| `0102` | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | BFS / Queue Level-Order Traversal | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 1 ms (95.86%)` | [solution.java](0102-binary-tree-level-order-traversal/solution.java) | [README.md](0102-binary-tree-level-order-traversal/README.md) |
| `0199` | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | BFS Level-Order (Rightmost Node) | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 1 ms (70.63%)` | [solution.java](0199-binary-tree-right-side-view/solution.java) | [README.md](0199-binary-tree-right-side-view/README.md) |
| `0225` | [Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Single FIFO Queue Cycle Rotation | $\mathcal{O}(N)$ push / $\mathcal{O}(1)$ pop | $\mathcal{O}(N)$ | `⚡ 1 ms (82.98%)` | [solution.java](0225-implement-stack-using-queues/solution.java) | [README.md](0225-implement-stack-using-queues/README.md) |
| `0239` | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | ![Hard](https://img.shields.io/badge/🔴_Hard-ef4444?style=flat-square&labelColor=0d1117) | Monotonic Decreasing Deque (Indices) | $\mathcal{O}(N)$ | $\mathcal{O}(k)$ | `42 ms (14.62%)` | [solution.java](0239-sliding-window-maximum/solution.java) | [README.md](0239-sliding-window-maximum/README.md) |
| `0621` | [Task Scheduler](https://leetcode.com/problems/task-scheduler/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Frequency Sorting & Greedy Interval Math | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 4 ms (73.16%)` | [solution.java](0621-task-scheduler/solution.java) | [README.md](0621-task-scheduler/README.md) |
| `0622` | [Design Circular Queue](https://leetcode.com/problems/design-circular-queue/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Ring Buffer FIFO Array Implementation | $\mathcal{O}(1)$ all ops | $\mathcal{O}(K)$ | `⚡ 4 ms (100.00%)` | [solution.java](0622-design-circular-queue/solution.java) | [README.md](0622-design-circular-queue/README.md) |
| `0641` | [Design Circular Deque](https://leetcode.com/problems/design-circular-deque/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Modular Arithmetic Circular Deque | $\mathcal{O}(1)$ all ops | $\mathcal{O}(K)$ | `⚡ 5 ms (85.78%)` | [solution.java](0641-design-circular-deque/solution.java) | [README.md](0641-design-circular-deque/README.md) |
| `0933` | [Number of Recent Calls](https://leetcode.com/problems/number-of-recent-calls/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Sliding Time Frame with FIFO Queue | $\mathcal{O}(1)^*$ amortized | $\mathcal{O}(W)$ | `24 ms (14.03%)` | [solution.java](0933-number-of-recent-calls/solution.java) | [README.md](0933-number-of-recent-calls/README.md) |
| `1438` | [Longest Continuous Subarray With Diff Limit](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Sliding Window + Dual Monotonic Deques | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 28 ms (98.47%)` | [solution.java](1438-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/solution.java) | [README.md](1438-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/README.md) |

<br/>

---

## 💡 Pattern Deep Dive & Cheat Sheet

### 1. Circular Ring Buffer — Zero-Allocation Queue (`0622`, `0641`)

**When to use:** Implementing fixed-capacity queues/deques without dynamic memory allocation — critical in embedded systems, kernel code, and high-performance networking.

**How it works:** An array of size $K$ with pointers that wrap around using modulo:
- **enQueue (insert at rear):** `rear = (rear + 1) % capacity`
- **deQueue (remove from front):** `front = (front + 1) % capacity`
- **insertFront (deque):** `front = (front - 1 + capacity) % capacity` (the `+ capacity` prevents negative modulo)
- **deleteLast (deque):** `rear = (rear - 1 + capacity) % capacity`

**Why track `size` separately?** Without it, `front == rear` could mean either "empty" or "full." Tracking `size` explicitly eliminates this ambiguity.

### 2. Monotonic Deque for Sliding Window Maximum (`0239`)

**When to use:** Finding the maximum (or minimum) of every contiguous subarray of length $k$.

**How it works:** Store array **indices** in an `ArrayDeque`. Maintain a decreasing-value invariant:
1. Before adding index `i`, remove all indices from the **back** whose values ≤ `nums[i]` (they'll never be the max while `i` is in the window).
2. Remove the **front** if it has slid out of the window (`front == i - k`).
3. The front is always the index of the current window's maximum.

```java
Deque<Integer> dq = new ArrayDeque<>();
for (int i = 0; i < nums.length; i++) {
    while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
        dq.pollLast();                          // Maintain decreasing order
    dq.offerLast(i);
    if (dq.peekFirst() == i - k)
        dq.pollFirst();                          // Expire out-of-window elements
    if (i >= k - 1)
        result[i - k + 1] = nums[dq.peekFirst()]; // Front = window max
}
```

**Why deque and not just stack?** We need to remove from both ends — from the back (dominated elements) and from the front (expired elements).

### 3. Dual Monotonic Deques for Window Constraints (`1438`)

**When to use:** Finding the longest subarray where `max - min ≤ limit`.

**How it works:** Two deques run simultaneously:
- `maxDeque` (decreasing): front holds the current window maximum
- `minDeque` (increasing): front holds the current window minimum

If `max - min > limit`, advance the left pointer and evict expired indices from both deques' fronts.

### 4. Level-Order BFS — The `size` Snapshot Trick (`0102`, `0199`)

**When to use:** Any tree problem requiring per-level processing (level averages, zigzag order, right-side view).

**The key technique:** At the start of each iteration, capture `int levelSize = queue.size()`. This tells you exactly how many nodes are in the current level. Process exactly that many nodes, adding their children (which belong to the next level) to the queue.

```java
Queue<TreeNode> q = new LinkedList<>();
if (root != null) q.offer(root);
while (!q.isEmpty()) {
    int levelSize = q.size();           // Snapshot: nodes in this level
    List<Integer> level = new ArrayList<>();
    for (int i = 0; i < levelSize; i++) {
        TreeNode node = q.poll();
        level.add(node.val);
        if (node.left != null) q.offer(node.left);
        if (node.right != null) q.offer(node.right);
    }
    result.add(level);
}
```

**For Right Side View (`0199`):** Simply capture the node value when `i == levelSize - 1` (the last node processed in each level is the rightmost visible node).

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0102` • Binary Tree Level Order Traversal
- **What it's really asking:** Group all tree nodes by their depth level, left to right.
- **Concept:** BFS using a FIFO queue with the level-size snapshot technique. Each outer loop iteration processes exactly one level.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$ for output and queue (max width of tree).
- **Edge Cases:** Empty tree (`null`), single-node tree, completely skewed tree (one node per level).

### `0199` • Binary Tree Right Side View
- **What it's really asking:** If you stood to the right of the tree, which nodes would you see? (The rightmost node at each depth.)
- **Concept:** BFS level traversal, but only record the last node processed at each level (`i == levelSize - 1`). This is the rightmost node visible from the right side.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** Left-heavy tree where left children are visible because no right sibling exists at that depth.

### `0225` • Implement Stack using Queues
- **What it's really asking:** Simulate LIFO behavior using only FIFO operations.
- **Concept:** After each `push`, rotate the $N-1$ existing elements behind the new element by repeatedly doing `q.offer(q.poll())`. This ensures the most recently pushed element is always at the front, giving $\mathcal{O}(1)$ `pop` and `top`.
- **Complexity:** Time: $\mathcal{O}(N)$ push, $\mathcal{O}(1)$ pop/top | Space: $\mathcal{O}(N)$.
- **Edge Cases:** Single element, alternating push-pop sequences.
- **Interview insight:** This tests understanding of how data structures relate to each other, not practical engineering.

### `0239` • Sliding Window Maximum
- **What it's really asking:** For every window of size $k$, report the maximum element. This is a classic "range maximum query" over a sliding window.
- **Concept:** Monotonic decreasing index deque (see Pattern Deep Dive). The front always holds the index of the current window's maximum.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(k)$.
- **Edge Cases:** $k = 1$ (output equals input), $k = N$ (single window), strictly increasing array (deque stays small), strictly decreasing (deque stays full).

### `0621` • Task Scheduler
- **What it's really asking:** Given tasks with a mandatory cooldown of $n$ slots between identical tasks, what is the minimum total time?
- **Concept:** Mathematical formula based on the most frequent task. The most frequent task creates $(maxFreq - 1)$ "frames" of width $(n + 1)$, plus a final partial frame of width equal to the count of tasks sharing the maximum frequency. Answer = $\max(\text{formula result}, \text{total tasks})$.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ (fixed 26-element frequency array).
- **Edge Cases:** $n = 0$ (no cooling needed, answer = total tasks), all tasks identical, more unique tasks than the cooldown allows.

### `0622` • Design Circular Queue
- **What it's really asking:** Build a fixed-capacity FIFO queue using an array, with $\mathcal{O}(1)$ enqueue and dequeue.
- **Concept:** Array-backed ring buffer with `front`, `rear`, `size`, and `capacity`. All pointer updates use modular arithmetic.
- **Complexity:** Time: $\mathcal{O}(1)$ for all operations | Space: $\mathcal{O}(K)$.
- **Edge Cases:** Operating on an empty queue, enqueueing to a full queue, wraparound past the physical end of the array.

### `0641` • Design Circular Deque
- **What it's really asking:** Extend the circular queue to support insertion/deletion from both front and rear.
- **Concept:** Same ring buffer approach, but with bidirectional pointer arithmetic. `insertFront` uses `(front - 1 + capacity) % capacity` to handle negative wrapping.
- **Complexity:** Time: $\mathcal{O}(1)$ for all operations | Space: $\mathcal{O}(K)$.
- **Edge Cases:** Mixed front/rear operations, wrapping in both directions.

### `0933` • Number of Recent Calls
- **What it's really asking:** For each incoming timestamp `t`, how many calls occurred in the window `[t - 3000, t]`?
- **Concept:** FIFO queue as a sliding time window. Enqueue new timestamp, dequeue all timestamps older than `t - 3000`, return queue size.
- **Complexity:** Time: $\mathcal{O}(1)$ amortized per call | Space: $\mathcal{O}(W)$ where $W \le 3000$.
- **Edge Cases:** Calls spaced > 3000ms apart (queue empties each time), burst of calls at the same millisecond.

### `1438` • Longest Continuous Subarray With Absolute Diff ≤ Limit
- **What it's really asking:** Find the longest subarray where the difference between the maximum and minimum elements is at most `limit`.
- **Concept:** Sliding window with dual monotonic deques tracking current-window max and min. When `max - min > limit`, shrink the window from the left. This maintains the invariant in $\mathcal{O}(N)$ total time.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** `limit = 0` (longest subarray of identical values), entire array satisfies the condition, single element.

<br/>

---

## 🔗 Connections to Other Weeks

| This Week's Pattern | Where It Reappears |
|:---|:---|
| BFS level-order | → Graph BFS (Week 7), multi-source BFS (Week 8) |
| Queue-based traversal | → Rotting Oranges wave propagation (Week 7), 01 Matrix (Week 8) |
| Deque data structure | → Already used monotonic stacks (Week 3), now extended with front-expiration |
| Ring buffer design | → OS-level circular buffers, producer-consumer patterns |

<br/>

---

<div align="center">

[⬅️ Week 3 — Stacks](../Week-3/) • [⬅️ Back to Main Repository](../README.md) • [➡️ Week 5 — Binary Trees](../Week-5/)

</div>
