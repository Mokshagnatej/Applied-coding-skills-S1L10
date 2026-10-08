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
  This module shifts from contiguous memory (arrays) to <b>non-contiguous, pointer-based structures</b>. Linked lists force you to think about memory indirection, in-place rewiring of pointers, and elegant two-pointer algorithms that work without random access. These skills are critical for understanding trees, graphs, and OS-level data structures.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

This week introduces the fundamental patterns for manipulating linked list nodes — all achievable in $\mathcal{O}(1)$ auxiliary space:

- **Fast & Slow Pointers (Floyd's Algorithm):** A technique where two pointers traverse the list at different speeds (1 step vs 2 steps). This elegantly solves two seemingly different problems: finding the middle node (when `fast` reaches the end, `slow` is at the midpoint) and detecting cycles (if `slow` and `fast` ever meet, a cycle exists). The mathematical proof behind cycle entrance detection is one of the most beautiful results in CS.

- **In-Place Pointer Reversal:** Reversing a linked list without extra memory by reassigning `.next` pointers as you traverse. This requires carefully juggling three references (`prev`, `curr`, `nextTemp`) to avoid losing nodes. Mastering this unlocks palindrome checking, segment reversal, and list reordering.

- **K-Group Segmented Reversal:** An advanced extension where you reverse segments of $k$ consecutive nodes while maintaining correct boundary connections between segments. The challenge lies in bookkeeping: tracking each segment's new head and tail, and connecting them to adjacent segments.

- **Priority Queue / Divide-and-Conquer Merge:** Merging $K$ sorted lists efficiently using a min-heap. Instead of merging lists pairwise ($\mathcal{O}(NK)$), a priority queue of size $K$ always gives you the globally smallest node in $\mathcal{O}(\log K)$ time, achieving $\mathcal{O}(N \log K)$ total.

- **Two-Pointer Length Equalization:** When two lists might intersect, the challenge is their different lengths. By switching each pointer to the other list's head upon reaching `null`, both pointers travel exactly `len(A) + len(B)` steps and converge at the intersection (or both reach `null`).

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

### 1. Floyd's Cycle Detection — The Mathematical Proof

**When to use:** Detecting if a linked list has a cycle, and finding the exact node where the cycle begins.

**Phase 1 — Meeting Point (Cycle Detection):**
- `slow` advances 1 step, `fast` advances 2 steps. If they meet, a cycle exists.
- Let: $a$ = distance from head to cycle entrance, $b$ = entrance to meeting point, $c$ = meeting point back to entrance.
- Distance: `slow` traveled $a + b$. `fast` traveled $a + b + n(b + c)$ (looped $n$ times around the cycle).
- Since `fast` moves at $2\times$ speed: $2(a + b) = a + b + n(b + c) \implies a = (n - 1)(b + c) + c$.

**Phase 2 — Finding the Entrance:**
- Reset one pointer to `head`. Move both pointers 1 step at a time.
- They'll meet at the cycle entrance after exactly $a$ steps. **This is because $a \equiv c \pmod{b + c}$!**

```java
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if (slow == fast) {        // Phase 1: cycle detected
        ListNode ptr = head;
        while (ptr != slow) {  // Phase 2: find entrance
            ptr = ptr.next;
            slow = slow.next;
        }
        return ptr;  // Cycle entrance node
    }
}
return null;  // No cycle
```

### 2. In-Place Pointer Reversal — The 3-Variable Dance

**When to use:** Reversing a full list or a sublist without extra memory.

**Mental model:** Imagine a chain of paper clips — you're unhooking each clip from the next one and hooking it to the previous one, working left to right.

```java
ListNode prev = null, curr = head;
while (curr != null) {
    ListNode nextTemp = curr.next;  // Save the next node (or we lose it!)
    curr.next = prev;               // Reverse the pointer
    prev = curr;                    // Advance prev
    curr = nextTemp;                // Advance curr
}
return prev;  // prev is now the new head
```

**Why `nextTemp` is essential:** Without saving `curr.next` before overwriting it, we'd sever the link to the rest of the list and lose all remaining nodes.

### 3. Cross-List Pointer Equalization (`0160`)

**When to use:** Finding the intersection node of two linked lists that may have different lengths.

**The elegant trick:** When pointer A finishes list A, redirect it to the head of list B. When pointer B finishes list B, redirect it to the head of list A. After at most one switch each, both pointers have traveled $\text{len}(A) + \text{len}(B)$ steps total and will either meet at the intersection or both reach `null`.

```java
ListNode pA = headA, pB = headB;
while (pA != pB) {
    pA = (pA == null) ? headB : pA.next;
    pB = (pB == null) ? headA : pB.next;
}
return pA;  // Intersection node, or null if no intersection
```

**Why it works:** The length difference is absorbed by the cross-traversal. If list A has length 5 and list B has length 8, pointer A travels 5 + 8 = 13 steps and pointer B travels 8 + 5 = 13 steps. They're synchronized!

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0021` • Merge Two Sorted Lists
- **What it's really asking:** Interleave two sorted lists into one sorted list, using only pointer manipulation (no new nodes).
- **Intuition:** Think of merging two sorted decks of cards face up. You compare the top card of both decks, take the smaller one, and put it face down on a new pile. Repeat until one deck is empty, then stack the rest of the other deck.
- **Step-by-Step Logic:**
  1. Create a `dummy` node to act as the start of the merged list, and a `curr` pointer pointing to it.
  2. While both `list1` and `list2` are not null:
     - Compare `list1.val` and `list2.val`.
     - Attach the node with the smaller value to `curr.next`.
     - Advance the chosen list's pointer (`list1 = list1.next` or `list2 = list2.next`).
     - Advance `curr`.
  3. Once the loop ends, one list might still have remaining nodes. Simply attach it: `curr.next = list1 != null ? list1 : list2`.
  4. Return `dummy.next`.
- **Complexity:** Time: $\mathcal{O}(N + M)$ | Space: $\mathcal{O}(1)$ — only pointer rewiring, no new node allocation.
- **Edge Cases:** One or both lists empty, lists of very different lengths (1 vs 10000), all elements of one list smaller than all elements of the other.
- **Foundation for:** This is the building block of merge sort and the k-way merge in problem `0023`.

### `0023` • Merge k Sorted Lists
- **What it's really asking:** Merge $K$ individually sorted linked lists into one globally sorted list, efficiently.
- **Intuition:** Instead of scanning all $K$ lists to find the smallest node every time, we can use a Min-Heap. The heap acts like an intelligent sorting funnel that always gives us the smallest available node in logarithmic time.
- **Step-by-Step Logic:**
  1. Create a `PriorityQueue` (Min-Heap) that compares `ListNode` values.
  2. Iterate through the array of lists and push the head node of each non-empty list into the heap.
  3. Create a `dummy` node and a `curr` pointer.
  4. While the heap is not empty:
     - Pop the smallest node from the heap and attach it to `curr.next`.
     - Move `curr` forward.
     - If the popped node has a `.next` node, push that `.next` node into the heap.
  5. Return `dummy.next`.
- **Complexity:** Time: $\mathcal{O}(N \log K)$ where $N$ is the total number of nodes across all lists | Space: $\mathcal{O}(K)$ for the heap.
- **Edge Cases:** $K = 0$, array contains empty lists (`[[], []]`), single list in the array.
- **Alternative:** Divide-and-conquer pairwise merging also achieves $\mathcal{O}(N \log K)$ but is harder to implement correctly.

### `0025` • Reverse Nodes in k-Group
- **What it's really asking:** Reverse every consecutive group of $K$ nodes. If the remaining nodes are fewer than $K$, leave them as-is.
- **Intuition:** We can process the list in blocks of size $K$. For each block, we check if it has $K$ elements. If so, we detach it, reverse it like a normal linked list, and then stitch it back into the main list.
- **Step-by-Step Logic:**
  1. Create a `dummy` node pointing to `head` and maintain a `prevGroupTail` pointing to `dummy`.
  2. Loop indefinitely:
     - Use a pointer `kth` to find the $K$-th node from `prevGroupTail`. If it's null, we don't have enough nodes, so `break`.
     - Save `nextGroupHead = kth.next`.
     - Disconnect the current group: `kth.next = null`.
     - Reverse the current group (from `prevGroupTail.next` to `kth`).
     - The old head of this group (which is now its tail) should point to `nextGroupHead`.
     - The `prevGroupTail.next` should point to the new head (`kth`).
     - Advance `prevGroupTail` to the new tail of this group.
  3. Return `dummy.next`.
- **Complexity:** Time: $\mathcal{O}(N)$ — each node is visited twice (once to count, once to reverse) | Space: $\mathcal{O}(1)$ iterative.
- **Edge Cases:** List length $< K$ (no reversal), length not a multiple of $K$ (last incomplete group stays unchanged), $K = 1$ (identity operation).

### `0142` • Linked List Cycle II
- **What it's really asking:** If a cycle exists, return the node where the cycle begins. If no cycle, return `null`.
- **Intuition:** Using Floyd's Cycle-Finding Algorithm (Tortoise and Hare), the fast runner and slow runner will eventually meet in a loop. When they do, the distance from the head to the loop entrance is exactly equal to the distance from their meeting point to the loop entrance.
- **Step-by-Step Logic:**
  1. Initialize `slow` and `fast` pointers to `head`.
  2. Phase 1 (Intersection): Move `slow` by 1 step, `fast` by 2 steps until they meet. If `fast` or `fast.next` becomes null, there's no cycle. Return null.
  3. Phase 2 (Entrance): Once they meet, reset one pointer (e.g., a new `ptr`) to the `head`.
  4. Move `ptr` and `slow` by 1 step at a time. The node where they collide is the cycle's starting node.
  5. Return that node.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ — no hash set needed!
- **Edge Cases:** No cycle, cycle comprises the entire list (tail points to head), single node pointing to itself, two-node cycle.

### `0160` • Intersection of Two Linked Lists
- **What it's really asking:** Two singly-linked lists may converge into a shared suffix. Find the node where they first merge, or return `null`.
- **Intuition:** If list A is shorter than list B, a pointer tracing A will reach the end first. If we then teleport it to the start of B, and do the same for the other pointer, they will magically align and hit the intersection at the exact same time.
- **Step-by-Step Logic:**
  1. Initialize `pA = headA` and `pB = headB`.
  2. While `pA != pB`:
     - If `pA` is null, redirect it to `headB`. Otherwise, move it to `pA.next`.
     - If `pB` is null, redirect it to `headA`. Otherwise, move it to `pB.next`.
  3. They will eventually meet at the intersection node or both hit `null` simultaneously if there's no intersection.
  4. Return `pA` (or `pB`).
- **Complexity:** Time: $\mathcal{O}(N + M)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** No intersection, intersection at the very first node, one list is much longer than the other.

### `0206` • Reverse Linked List
- **What it's really asking:** Reverse the direction of all pointers in a singly linked list.
- **Intuition:** Iterate through the list, unhooking the current node's forward pointer and re-hooking it to point backward. To avoid losing the rest of the list, we must safely store the "next" node before breaking the connection.
- **Step-by-Step Logic:**
  1. Initialize `prev = null` and `curr = head`.
  2. While `curr != null`:
     - Save the next node: `nextTemp = curr.next`.
     - Reverse the pointer: `curr.next = prev`.
     - Slide `prev` forward: `prev = curr`.
     - Slide `curr` forward: `curr = nextTemp`.
  3. When `curr` becomes null, `prev` points to the new head. Return `prev`.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Empty list (`null`), single node (returns the same node).
- **This is the most important linked list subroutine** — it's used as a building block in palindrome checking, k-group reversal, and list reordering.

### `0234` • Palindrome Linked List
- **What it's really asking:** Is the list a palindrome? Solve it in $\mathcal{O}(1)$ space (no array conversion).
- **Intuition:** A palindrome reads the same forwards and backwards. If we reverse the second half of the list, we can just compare it node-by-node against the first half.
- **Step-by-Step Logic:**
  1. Use fast and slow pointers to find the middle of the list. `slow` ends up at the midpoint.
  2. Reverse the second half of the list starting from `slow`. Keep a reference to the new head of this reversed half.
  3. Iterate with two pointers: `p1` at the `head` of the original list, and `p2` at the head of the reversed half.
  4. If their values ever mismatch, return `false`.
  5. Continue until `p2` is null. Return `true`.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Even vs odd length lists (odd-length has a middle node that's ignored), single node, two-node palindrome (`[1,1]`) vs non-palindrome (`[1,2]`).

### `0876` • Middle of the Linked List
- **What it's really asking:** Return the middle node. For even-length lists, return the second of the two middle nodes.
- **Intuition:** Imagine two cars on a road. One drives at 60mph and the other at 30mph. When the fast car reaches the destination, the slow car is exactly halfway there.
- **Step-by-Step Logic:**
  1. Initialize two pointers: `slow = head` and `fast = head`.
  2. Loop as long as `fast` is not null AND `fast.next` is not null.
  3. Inside the loop, move `slow` by 1 step (`slow = slow.next`).
  4. Move `fast` by 2 steps (`fast = fast.next.next`).
  5. When the loop terminates, `slow` points to the middle node. Return `slow`.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$.
- **Edge Cases:** Single node (returns itself), two nodes (returns second), odd vs even lengths.

<br/>

---

## 🔗 Connections to Other Weeks

| This Week's Pattern | Where It Reappears |
|:---|:---|
| Fast/Slow pointers | → Tree midpoint finding (Week 5), cycle detection in number theory (Week 8 — Happy Number) |
| In-place reversal | → Stack simulation (Week 3), tree path reversal |
| Merge technique | → Priority queue k-way merge extends to k-sorted-streams, merge-sort-based counting |
| Pointer manipulation | → Tree node rewiring (Week 5), graph adjacency list construction (Week 7) |

<br/>

---

<div align="center">

[⬅️ Week 1 — Arrays](../Week-1/) • [⬅️ Back to Main Repository](../README.md) • [➡️ Week 3 — Stacks](../Week-3/)

</div>
