<div align="center">

```
  ███╗   ███╗ ██████╗ ██████╗ ██╗   ██╗██╗     ███████╗     ██████╗ ██████╗ 
  ████╗ ████║██╔═══██╗██╔══██╗██║   ██║██║     ██╔════╝    ██╔═████╗╚════██╗
  ██╔████╔██║██║   ██║██║  ██║██║   ██║██║     █████╗      ██║██╔██║ █████╔╝
  ██║╚██╔╝██║██║   ██║██║  ██║██║   ██║██║     ██╔══╝      ████╔╝██║ ╚═══██╗
  ██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝███████╗███████╗    ╚██████╔╝██████╔╝
  ╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝     ╚═════╝ ╚═════╝ 
```

### 🌸 MODULE 03 • STACKS, MONOTONIC STACKS & SIMULATION
#### *Applied Coding Skills (S1L10) — LIFO & Monotonic Filter Tier*

<br/>

[![Solved Status](https://img.shields.io/badge/MODULE_STATUS-9%2F9_SOLVED-00f5d4?style=for-the-badge&logo=target&logoColor=000&labelColor=0d1117)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_EASY-3-10b981?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_MEDIUM-6-f59e0b?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/RUNTIME-JAVA_21+-f78166?style=for-the-badge&logo=openjdk&logoColor=fff&labelColor=0d1117)](https://www.java.com/)

<br/>

<p align="center">
  Focuses on LIFO data structures, monotonic stack optimizations for linear-time next greater/smaller queries, bracket balancing, and physical event simulation.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

- **LIFO Delimiter Balancing:** Validating structured syntax and balancing delimiters using stacks in $\mathcal{O}(N)$ time.
- **Monotonic Decreasing Stack Engines:** Resolving next-greater/warmer element queries in $\mathcal{O}(N)$ amortized time.
- **Span Compression:** Tracking cumulative range intervals dynamically via paired monotonic structures.
- **Deterministic State Simulation:** Simulating physical processes (e.g., asteroid collisions, push/pop sequences) with stack invariants.
- **Dual Stack Min-State:** Designing $\mathcal{O}(1)$ time min-retrieval data structures without sorting.

<br/>

---

## 📋 Problem Directory & Performance

| # | Problem Title | Tier | Key Pattern / Concept | Time | Space | Performance (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| `0020` | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | LIFO Bracket Matching | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 3 ms (86.07%)` | [solution.java](0020-valid-parentheses/solution.java) | [README.md](0020-valid-parentheses/README.md) |
| `0155` | [Min Stack](https://leetcode.com/problems/min-stack/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Dual Stack / Paired Min State | $\mathcal{O}(1)$ | $\mathcal{O}(N)$ | `34 ms (61.77%)` | [solution.java](0155-min-stack/solution.java) | [README.md](0155-min-stack/README.md) |
| `0496` | [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Monotonic Decreasing Stack + Map | $\mathcal{O}(N + M)$ | $\mathcal{O}(N)$ | `⚡ 2 ms (99.48%)` | [solution.java](0496-next-greater-element-i/solution.java) | [README.md](0496-next-greater-element-i/README.md) |
| `0735` | [Asteroid Collision](https://leetcode.com/problems/asteroid-collision/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Stack Collision Physics Simulation | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 5 ms (67.32%)` | [solution.java](0735-asteroid-collision/solution.java) | [README.md](0735-asteroid-collision/README.md) |
| `0739` | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Monotonic Decreasing Index Stack | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `71 ms (38.95%)` | [solution.java](0739-daily-temperatures/solution.java) | [README.md](0739-daily-temperatures/README.md) |
| `0901` | [Online Stock Span](https://leetcode.com/problems/online-stock-span/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Monotonic Stack with Span Compression | $\mathcal{O}(1)^*$ | $\mathcal{O}(N)$ | `31 ms (60.14%)` | [solution.java](0901-online-stock-span/solution.java) | [README.md](0901-online-stock-span/README.md) |
| `0946` | [Validate Stack Sequences](https://leetcode.com/problems/validate-stack-sequences/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Greedy Push-Pop Simulation | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 2 ms (88.46%)` | [solution.java](0946-validate-stack-sequences/solution.java) | [README.md](0946-validate-stack-sequences/README.md) |
| `1249` | [Min Remove for Valid Parentheses](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Index Stack / String Builder Filter | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 6 ms (97.91%)` | [solution.java](1249-minimum-remove-to-make-valid-parentheses/solution.java) | [README.md](1249-minimum-remove-to-make-valid-parentheses/README.md) |
| `1475` | [Final Prices With Special Discount](https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Monotonic Stack (Next Smaller Element) | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 1 ms (99.79%)` | [solution.java](1475-final-prices-with-a-special-discount-in-a-shop/solution.java) | [README.md](1475-final-prices-with-a-special-discount-in-a-shop/README.md) |

<br/>

---

## 💡 Pattern Deep Dive & Cheat Sheet

### 1. Monotonic Decreasing Stack for Next Greater Elements
- **Invariant:** Elements stored in the stack are in strictly descending order from bottom to top.
- **Action:** When encountering element `x`, pop all indices `j` where `nums[j] < x`. For each popped index `j`, its next greater element is `x` (and distance is `i - j`).
- **Amortized Complexity:** Each index is pushed once and popped at most once $\implies \mathcal{O}(N)$ total operations.

```java
int[] result = new int[temperatures.length];
Deque<Integer> stack = new ArrayDeque<>();
for (int i = 0; i < temperatures.length; i++) {
    while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
        int prevIdx = stack.pop();
        result[prevIdx] = i - prevIdx;
    }
    stack.push(i);
}
```

### 2. Monotonic Stack with Span Compression (`0901`)
- When calculating consecutive smaller or equal days backwards: store pairs `(price, span)`.
- When incoming `price >= stack.peek().price`, pop and add its `span` to the current `span`.
- Compresses flattened history into a single representative node.

```java
class StockSpanner {
    Deque<int[]> stack = new ArrayDeque<>(); // [price, span]
    
    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }
}
```

### 3. Stack Collision Simulation Invariant (`0735`)
- Only a moving **right** asteroid (`> 0`) followed by a moving **left** asteroid (`< 0`) can collide.
- Left-moving asteroids before right-moving ones never cross paths.

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0020` • Valid Parentheses
- **Concept:** Map opening brackets to corresponding closing brackets. Push expected closing character onto stack; verify `stack.pop() == c` on encountering a closing bracket.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** Odd string length, starts with closing bracket, unmatched open brackets remaining on stack.

### `0155` • Min Stack
- **Concept:** Store pairs or maintain parallel `minStack` tracking the running minimum at each stack level, ensuring $\mathcal{O}(1)$ min retrieval.
- **Complexity:** Time: $\mathcal{O}(1)$ for all operations (`push`, `pop`, `top`, `getMin`) | Space: $\mathcal{O}(N)$.
- **Edge Cases:** Multiple duplicate minimum elements pushed sequentially.

### `0496` • Next Greater Element I
- **Concept:** Monotonic decreasing stack over `nums2` to build a `HashMap<Value, NextGreater>`. Then query `nums1` against the map in $\mathcal{O}(1)$.
- **Complexity:** Time: $\mathcal{O}(N + M)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** No greater element exists (default to `-1`), `nums1` is a single element.

### `0735` • Asteroid Collision
- **Concept:** Simulate physical collision mechanics using a stack. Compare magnitudes when `stack.peek() > 0 && curr < 0`. Equal sizes destroy both.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** All moving in same direction, alternating directions that never meet (`[-2, -1, 1, 2]`), chain reactions destroying multiple asteroids.

### `0739` • Daily Temperatures
- **Concept:** Monotonic stack storing indices. Pop previous colder days when encountering a warmer day, storing index difference `i - prevIdx`.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** Strictly decreasing temperatures (all `0`s), strictly increasing temperatures.

### `0901` • Online Stock Span
- **Concept:** Decreasing monotonic stack compressing accumulated spans of dominated previous days.
- **Complexity:** Time: $\mathcal{O}(1)$ amortized per call | Space: $\mathcal{O}(N)$.
- **Edge Cases:** Monotonically increasing prices (span equals total calls), strictly decreasing prices (span always 1).

### `0946` • Validate Stack Sequences
- **Concept:** Greedy push-pop simulation. Push each element from `pushed`; greedily pop while `stack.peek() == popped[popIdx]`. Valid if stack is empty at end.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** Push and pop arrays identical, push array is reverse of pop array, invalid interleavings.

### `1249` • Minimum Remove to Make Valid Parentheses
- **Concept:** Index stack tracks unmatched `'('`. Invalid `')'` are flagged immediately. Unmatched `'('` remaining in stack are flagged. Reconstruct string skipping flagged indices.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** String with no parentheses, all open parentheses (`"((("`), all close parentheses (`")))"`).

### `1475` • Final Prices With a Special Discount in a Shop
- **Concept:** Monotonic stack tracking indices looking for next smaller or equal element (`nums[j] <= nums[i]` with `j > i`).
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** No discount available for any item, strictly descending prices (each gets next item as discount).

<br/>

---

<div align="center">

[⬅️ Back to Main Repository](../README.md)

</div>
