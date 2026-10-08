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
  Stacks are deceptively simple — just push and pop — yet they power some of the most elegant algorithms in computing. This module explores how the <b>Last-In-First-Out</b> principle solves bracket matching, temperature predictions, collision physics, and discount calculations, all in linear time. The star of the show is the <b>monotonic stack</b> — a pattern that turns $\mathcal{O}(N^2)$ "find the next greater element" queries into $\mathcal{O}(N)$.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

This week reveals how stacks — the simplest LIFO data structure — become powerful algorithmic engines when combined with invariants:

- **LIFO Delimiter Balancing:** Stacks naturally model nested structures. When you encounter an opening bracket, push it. When you encounter a closing bracket, the most recent unmatched opener is right on top of the stack. This $\mathcal{O}(N)$ pattern validates XML/HTML, JSON, and mathematical expressions — and extends to more complex problems like removing minimum brackets to make a string valid.

- **Monotonic Decreasing Stack Engines:** The breakthrough insight: by maintaining a stack where elements are always in decreasing order (from bottom to top), we can resolve "next greater element" and "next warmer day" queries for **every** element in a single pass. Each element is pushed once and popped at most once, giving $\mathcal{O}(N)$ amortized time. This replaces the naive $\mathcal{O}(N^2)$ approach of scanning rightward for each element.

- **Span Compression:** A variation of monotonic stacks where instead of just storing indices, we store `(value, accumulated_span)` pairs. When a new element pops smaller elements off the stack, it absorbs their spans. This compresses an entire history of dominated elements into a single node.

- **Deterministic State Simulation:** Some problems require simulating a physical process (asteroids colliding, cards being played, items being pushed/popped in a specific order). Stacks model these beautifully because the "most recent" item is always the one that interacts with the incoming event.

- **Dual Stack Min-State:** Designing a stack that supports `getMin()` in $\mathcal{O}(1)$ time requires tracking the running minimum at each stack level — either via a parallel stack or by storing `(value, currentMin)` pairs.

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

### 1. Monotonic Decreasing Stack — The "Next Greater Element" Engine

**When to use:** Any problem asking "for each element, what is the next element to the right that is larger/smaller/warmer/etc.?" or "how many days until a warmer temperature?"

**Core invariant:** Elements in the stack are maintained in strictly descending order from bottom to top. When a new element `x` arrives that violates this invariant (i.e., `x` is greater than the top), we pop elements until the invariant is restored. Each popped element's "next greater" answer is `x`.

**Why it's $\mathcal{O}(N)$:** Every element is pushed exactly once and popped at most once → total operations $\le 2N$.

```java
// Daily Temperatures: For each day, how many days until a warmer temperature?
int[] result = new int[temperatures.length];
Deque<Integer> stack = new ArrayDeque<>();  // Stores indices
for (int i = 0; i < temperatures.length; i++) {
    // Pop all days that are colder than today
    while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
        int prevIdx = stack.pop();
        result[prevIdx] = i - prevIdx;  // Days waited = index difference
    }
    stack.push(i);
}
// Elements remaining in stack have no warmer day → result stays 0
```

**Mental model:** Imagine standing in a queue. You can only see the person directly in front of you. A monotonic stack is like a line where shorter people are removed whenever a taller person arrives — each short person "sees" the tall person as their "next taller."

### 2. Span Compression with Monotonic Stack (`0901`)

**When to use:** Online/streaming problems where you need to compute how far back a property extends (e.g., "how many consecutive days has the stock price been ≤ today's price?").

**The twist:** Instead of just storing values, store `(value, span)` pairs. When a new price pops a smaller price off the stack, it absorbs that price's span — effectively compressing the entire dominated history into the current node.

```java
class StockSpanner {
    Deque<int[]> stack = new ArrayDeque<>(); // [price, accumulated_span]
    
    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];  // Absorb the popped element's span
        }
        stack.push(new int[]{price, span});
        return span;
    }
}
```

### 3. Stack Collision Simulation (`0735`)

**When to use:** Problems that simulate physical interactions between sequential elements moving in different directions.

**Key insight for Asteroid Collision:** Collisions only happen when a **right-moving** asteroid (`> 0`) is on the stack and a **left-moving** asteroid (`< 0`) arrives. Left-moving asteroids that appear before right-moving ones never interact — they're already moving apart. The stack naturally models the "survivors" of previous collisions.

**Collision rules:** Compare absolute sizes. If equal, both destroyed. If the incoming asteroid is larger, it destroys the stack top and continues checking. If the stack top is larger, the incoming asteroid is destroyed.

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0020` • Valid Parentheses
- **What it's really asking:** Given a string of brackets `(){}[]`, is every opener matched by the correct closer in the right order?
- **Concept:** Push the expected closing character when encountering an opener. On a closer, check if it matches `stack.pop()`. If mismatch or stack is empty when encountering a closer → invalid. At the end, the stack must be empty.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$ worst case (all openers).
- **Edge Cases:** Odd-length string (always invalid), starts with closer, interleaved types like `{[()]}`, unmatched openers remaining.

### `0155` • Min Stack
- **What it's really asking:** Design a stack where `push`, `pop`, `top`, and `getMin` all work in $\mathcal{O}(1)$.
- **Concept:** The challenge is `getMin` in $\mathcal{O}(1)$. Solution: maintain a parallel `minStack` that tracks the minimum at each stack depth. When pushing, also push `min(newVal, minStack.peek())`. When popping, pop from both stacks.
- **Complexity:** Time: $\mathcal{O}(1)$ for all operations | Space: $\mathcal{O}(N)$.
- **Edge Cases:** Multiple duplicate minimum values pushed sequentially, popping the current minimum to reveal a new minimum.

### `0496` • Next Greater Element I
- **What it's really asking:** Given two arrays `nums1` (subset) and `nums2` (superset), for each element in `nums1`, find its next greater element in `nums2`.
- **Concept:** Build a `HashMap<Value, NextGreater>` by running a monotonic decreasing stack over `nums2`. Then answer each query in `nums1` via $\mathcal{O}(1)$ map lookup. This decouples the "precomputation" from the "query answering."
- **Complexity:** Time: $\mathcal{O}(N + M)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** No greater element exists (return `-1`), `nums1` is a single element, all elements in `nums2` are identical.

### `0735` • Asteroid Collision
- **What it's really asking:** Asteroids move in a row. Positive = right, negative = left. When they meet, the smaller one explodes. Equal sizes destroy both. Return the surviving asteroids.
- **Concept:** Process asteroids left-to-right. Push each onto the stack. When the stack's top is positive and the incoming asteroid is negative (collision!), repeatedly compare magnitudes: pop if incoming wins, discard incoming if stack top wins, pop both if tie.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** All same direction, alternating directions that never meet (`[-2,-1,1,2]`), chain reactions destroying multiple stack elements.

### `0739` • Daily Temperatures
- **What it's really asking:** For each day, how many days until a warmer temperature? If no warmer day exists, output `0`.
- **Concept:** Classic monotonic decreasing stack storing indices. When encountering a warmer day, pop all colder days from the stack and record `i - poppedIndex` as their answer.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** Strictly decreasing temperatures (all `0`s), strictly increasing (each waits exactly 1 day), plateau of equal temperatures.

### `0901` • Online Stock Span
- **What it's really asking:** For each new stock price, count the number of consecutive days (going backwards, including today) where the price was ≤ today's price.
- **Concept:** Monotonic decreasing stack with span compression. When a new price dominates stack elements, it absorbs their accumulated spans, efficiently compressing the history.
- **Complexity:** Time: $\mathcal{O}(1)$ amortized per call | Space: $\mathcal{O}(N)$ total.
- **Edge Cases:** Monotonically increasing prices (each span equals total calls so far), strictly decreasing (each span is always 1).

### `0946` • Validate Stack Sequences
- **What it's really asking:** Given a `pushed` array and a `popped` array, can you produce the `popped` sequence using valid push/pop operations?
- **Concept:** Greedy simulation: push elements from `pushed` one at a time. After each push, greedily pop while `stack.peek() == popped[popIdx]`. If the stack is empty at the end, the sequence is valid.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** `pushed` and `popped` are identical (push one, pop one, repeat), `popped` is the reverse of `pushed` (push all, then pop all).

### `1249` • Minimum Remove to Make Valid Parentheses
- **What it's really asking:** Remove the minimum number of parentheses to make the string valid, and return the result.
- **Concept:** Two passes: (1) Use an index stack to track unmatched `'('` positions. When encountering `')'`, if the stack is empty (no matching `'(`), flag this `')'` for removal; otherwise pop the stack (matched pair). (2) Any indices remaining in the stack are unmatched `'('` — flag them too. Reconstruct the string, skipping flagged indices.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** No parentheses at all (return as-is), all opens (`"((("` → `""`), all closes (`")))"` → `""`), interleaved with other characters.

### `1475` • Final Prices With a Special Discount in a Shop
- **What it's really asking:** For each item, find the first item to the right with a price ≤ current price and subtract it as a discount.
- **Concept:** Monotonic stack tracking indices, looking for the "next smaller or equal" element. This is a variation of the "next greater" pattern — instead of popping when `>`, we pop when `<=`.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** No discount available for any item, strictly descending prices (each gets the next item as discount), all identical prices.

<br/>

---

## 🔗 Connections to Other Weeks

| This Week's Pattern | Where It Reappears |
|:---|:---|
| Monotonic stack | → Monotonic deque for sliding window max (Week 4) |
| LIFO simulation | → DFS uses an implicit call stack (Weeks 5, 7) |
| Bracket matching | → Tree parenthesization, expression parsing |
| Stack-based state tracking | → Backtracking path state in trees (Week 5) |

<br/>

---

<div align="center">

[⬅️ Week 2 — Linked Lists](../Week-2/) • [⬅️ Back to Main Repository](../README.md) • [➡️ Week 4 — Queues & Deques](../Week-4/)

</div>
