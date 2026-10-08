# Keys and Rooms

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There are `n` rooms labeled from `0` to `n - 1` and all the rooms are locked except for room `0`. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.

When you visit a room, you may find a set of  **distinct keys**  in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.

Given an array `rooms` where `rooms[i]` is the set of keys that you can obtain if you visited room `i`, return `true`  *if you can visit  **all**  the rooms, or*  `false`  *otherwise*.

 

 **Example 1:** 

```
Input: rooms = [[1],[2],[3],[]]
Output: true
Explanation: 
We visit room 0 and pick up key 1.
We then visit room 1 and pick up key 2.
We then visit room 2 and pick up key 3.
We then visit room 3.
Since we were able to visit every room, we return true.

```

 **Example 2:** 

```
Input: rooms = [[1,3],[3,0,1],[2],[0]]
Output: false
Explanation: We can not enter room number 2 since the only key that unlocks it is in that room.

```

 

 **Constraints:** 

- n == rooms.length
- 2 <= n <= 1000
- 0 <= rooms[i].length <= 1000
- 1 <= sum(rooms[i].length) <= 3000
- 0 <= rooms[i][j] < n
- All the values of rooms[i] are unique.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 46.4 MB (beats 25.88%)  
**Submitted:** 2026-10-08T03:54:01.796Z  

```java
class Solution {
    boolean[] visited;
    int count = 0;
    List<List<Integer>> list;
    int n;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        n = rooms.size();
        visited = new boolean[n];
        list = rooms;
        dfs(0);
        return count == n;
    }
    void dfs(int v) {
        if(visited[v] == true) return;
        visited[v] = true;
        count++;
        if(count == n) return;
        for(int node : list.get(v)) {
            dfs(node);
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/keys-and-rooms/)