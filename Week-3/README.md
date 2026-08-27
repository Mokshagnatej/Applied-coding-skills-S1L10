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

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory) • [🎯 CORE OBJECTIVES](#-core-learning-objectives)

---

</div>

<br/>

## 🎯 Core Learning Objectives

- **LIFO Delimiter Balancing:** Validating structured syntax and balancing delimiters using stacks in $\mathcal{O}(N)$ time.
- **Monotonic Decreasing Stack Engines:** Resolving next-greater/warmer element queries in $\mathcal{O}(N)$ amortized time.
- **Span Compression:** Tracking cumulative range intervals dynamically via paired monotonic structures.
- **Deterministic State Simulation:** Simulating physical processes (e.g., asteroid collisions, push/pop sequences) with stack invariants.

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

<div align="center">

[⬅️ Back to Main Repository](../README.md)

</div>
