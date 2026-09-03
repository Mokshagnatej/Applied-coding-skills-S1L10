<div align="center">

```
  ███╗   ███╗ ██████╗ ██████╗ ██╗   ██╗██╗     ███████╗     ██████╗ ██████╗ 
  ████╗ ████║██╔═══██╗██╔══██╗██║   ██║██║     ██╔════╝    ██╔═████╗╚════██╗
  ██╔████╔██║██║   ██║██║  ██║██║   ██║██║     █████╗      ██║██╔██║ █████╔╝
  ██║╚██╔╝██║██║   ██║██║  ██║██║   ██║██║     ██╔══╝      ████╔╝██║██╔═══╝ 
  ██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝███████╗███████╗    ╚██████╔╝███████╗
  ╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝     ╚═════╝ ╚══════╝
```

### 🟣 MODULE 02 • LINKED LISTS & POINTER MANIPULATION
#### *Applied Coding Skills (S1L10) — Topological Linkage Tier*

<br/>

[![Solved Status](https://img.shields.io/badge/MODULE_STATUS-8%2F8_SOLVED-00f5d4?style=for-the-badge&logo=target&logoColor=000&labelColor=0d1117)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_EASY-5-10b981?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_MEDIUM-1-f59e0b?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Hard](https://img.shields.io/badge/🔴_HARD-2-ef4444?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/RUNTIME-JAVA_21+-f78166?style=for-the-badge&logo=openjdk&logoColor=fff&labelColor=0d1117)](https://www.java.com/)

<br/>

<p align="center">
  Focuses on linked list pointer dynamics, cycle detection algorithms, in-place segment reversals, list intersections, and priority-queue powered k-way merging.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

- **Fast & Slow Pointers (Floyd's Algorithm):** Locating linked list midpoints and identifying cycle entrance nodes in $\mathcal{O}(1)$ space.
- **In-Place Pointer Reversal:** Reversing sublists and full lists by manipulating `.next` references without auxiliary structures.
- **K-Group Segmented Reversal:** Maintaining segment boundaries and reconnecting head/tail references dynamically.
- **Priority Queue / Divide-and-Conquer:** Merging $K$ sorted lists efficiently in $\mathcal{O}(N \log K)$ time.
- **Two-Pointer Equalization:** Aligning traverse lengths of different lists by switching heads at the end of each pass.

<br/>

---

## 📋 Problem Directory & Performance

| # | Problem Title | Tier | Key Pattern / Concept | Time | Space | Performance (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| `0021` | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | In-Place Pointer Splice Merge | $\mathcal{O}(N + M)$ | $\mathcal{O}(1)$ | `⚡ 0 ms (100.00%)` | [solution.java](0021-merge-two-sorted-lists/solution.java) | [README.md](0021-merge-two-sorted-lists/README.md) |
| `0023` | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | ![Hard](https://img.shields.io/badge/🔴_Hard-ef4444?style=flat-square&labelColor=0d1117) | Min-Heap / PriorityQueue K-Way Merge | $\mathcal{O}(N \log k)$ | $\mathcal{O}(k)$ | `5 ms (40.75%)` | [solution.java](0023-merge-k-sorted-lists/solution.java) | [README.md](0023-merge-k-sorted-lists/README.md) |
| `0025` | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | ![Hard](https://img.shields.io/badge/🔴_Hard-ef4444?style=flat-square&labelColor=0d1117) | Segmented In-Place Sublist Reversal | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 1 ms (34.55%)` | [solution.java](0025-reverse-nodes-in-k-group/solution.java) | [README.md](0025-reverse-nodes-in-k-group/README.md) |
| `0142` | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Floyd's Cycle Detection (Collision Point) | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 0 ms (100.00%)` | [solution.java](0142-linked-list-cycle-ii/solution.java) | [README.md](0142-linked-list-cycle-ii/README.md) |
| `0160` | [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Cross-Traversing Alignment | $\mathcal{O}(N + M)$ | $\mathcal{O}(1)$ | `⚡ 1 ms (99.90%)` | [solution.java](0160-intersection-of-two-linked-lists/solution.java) | [README.md](0160-intersection-of-two-linked-lists/README.md) |
| `0206` | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | In-Place Directional Pointer Reversal | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 0 ms (100.00%)` | [solution.java](0206-reverse-linked-list/solution.java) | [README.md](0206-reverse-linked-list/README.md) |
| `0234` | [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Fast/Slow Split + Half Reversal | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 3 ms (99.83%)` | [solution.java](0234-palindrome-linked-list/solution.java) | [README.md](0234-palindrome-linked-list/README.md) |
| `0876` | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Fast & Slow $2\times$ Velocity Probe | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 0 ms (100.00%)` | [solution.java](0876-middle-of-the-linked-list/solution.java) | [README.md](0876-middle-of-the-linked-list/README.md) |

<br/>

---

## 💡 Pattern Deep Dive & Cheat Sheet

### 1. Floyd's Cycle Detection & Mathematical Proof
- **Phase 1 (Meeting Point):** `slow` advances 1 step, `fast` advances 2 steps.
  - If they meet, a cycle exists.
  - Let distance from head to cycle entrance = $a$, entrance to meeting point = $b$, meeting point back to entrance = $c$.
  - Distance traveled by `slow` = $a + b$.
  - Distance traveled by `fast` = $a + b + n(b + c)$.
  - Since `fast` is twice as fast: $2(a + b) = a + b + n(b + c) \implies a = (n - 1)(b + c) + c$.
- **Phase 2 (Cycle Entrance):** Reset `slow` to `head`. Move both `slow` and `fast` 1 step at a time. They will meet exactly at the cycle entrance after $a$ steps!

```java
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if (slow == fast) {
        ListNode ptr = head;
        while (ptr != slow) {
            ptr = ptr.next;
            slow = slow.next;
        }
        return ptr;
    }
}
return null;
```

### 2. In-Place Directional Pointer Reversal
- Invert `.next` pointers iteratively using `prev`, `curr`, and `nextTemp`.

```java
ListNode prev = null, curr = head;
while (curr != null) {
    ListNode nextTemp = curr.next;
    curr.next = prev;
    prev = curr;
    curr = nextTemp;
}
return prev;
```

### 3. Cross-List Pointer Length Equalization (`0160`)
- When pointer $A$ reaches the end of list $A$, redirect it to the head of list $B$.
- When pointer $B$ reaches the end of list $B$, redirect it to the head of list $A$.
- Both pointers travel exactly $\text{length}(A) + \text{length}(B)$ steps and collide either at the intersection node or at `null`.

```java
ListNode pA = headA, pB = headB;
while (pA != pB) {
    pA = (pA == null) ? headB : pA.next;
    pB = (pB == null) ? headA : pB.next;
}
return pA;
```

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0021` • Merge Two Sorted Lists
- **Concept:** Iterative dummy head splice merge. Compare heads of both lists and advance the pointer with the smaller value.
- **Complexity:** Time: $\mathcal{O}(N + M)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** One or both lists empty, lists of disparate lengths.

### `0023` • Merge k Sorted Lists
- **Concept:** Min-Heap (PriorityQueue) of size $k$. Extract smallest node, append to merged list, and offer its `.next` into the heap.
- **Complexity:** Time: $\mathcal{O}(N \log k)$ where $N$ is total nodes | Space: $\mathcal{O}(k)$ auxiliary heap.
- **Edge Cases:** $k = 0$, array of empty lists (`[[], []]`), single list.

### `0025` • Reverse Nodes in k-Group
- **Concept:** Count $k$ nodes ahead. If available, reverse that group and link the tail to the recursively/iteratively processed remaining list.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ auxiliary space.
- **Edge Cases:** List length less than $k$, list length not a multiple of $k$ (remaining nodes stay unmodified).

### `0142` • Linked List Cycle II
- **Concept:** Floyd's Tortoise and Hare algorithm with two-phase entrance calculation.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** No cycle present, cycle comprises the entire list, single node pointing to itself.

### `0160` • Intersection of Two Linked Lists
- **Concept:** Two-pointer traversal swapping heads upon reaching the end, naturally neutralizing length differences.
- **Complexity:** Time: $\mathcal{O}(N + M)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** No intersection, intersection at the very first node, disparate list lengths ($10^5$ vs $1$).

### `0206` • Reverse Linked List
- **Concept:** 3-pointer slide (`prev`, `curr`, `next`) reassigning pointers in a single pass.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Empty list (`null`), single node list.

### `0234` • Palindrome Linked List
- **Concept:** Find middle using slow/fast pointers, reverse the second half in-place, compare the two halves, and optionally restore the list.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Even vs odd length lists, single node list, two-node palindrome vs non-palindrome.

### `0876` • Middle of the Linked List
- **Concept:** Fast pointer moves 2 steps while slow moves 1 step. When fast reaches end, slow sits at the middle node (second middle for even lists).
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Single node, two nodes (returns second node), odd vs even length.

<br/>

---

<div align="center">

[⬅️ Back to Main Repository](../README.md)

</div>
