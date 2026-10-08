# Number of Provinces

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There are `n` cities. Some of them are connected, while some are not. If city `a` is connected directly with city `b`, and city `b` is connected directly with city `c`, then city `a` is connected indirectly with city `c`.

A  **province**  is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an `n x n` matrix `isConnected` where `isConnected[i][j] = 1` if the `ith` city and the `jth` city are directly connected, and `isConnected[i][j] = 0` otherwise.

Return  *the total number of  **provinces***.

 

 **Example 1:** 

```
Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2

```

 **Example 2:** 

```
Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3

```

 

 **Constraints:** 

- 1 <= n <= 200
- n == isConnected.length
- n == isConnected[i].length
- isConnected[i][j] is 1 or 0.
- isConnected[i][i] == 1
- isConnected[i][j] == isConnected[j][i]

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 40.67%)  
**Memory:** 47.1 MB (beats 73.72%)  
**Submitted:** 2026-10-08T03:51:42.298Z  

```java
class Solution {
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> visited = new HashSet<>();
        int provinces = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (!visited.contains(i)) {
                dfs(i, isConnected, visited);
                provinces++;
            }
        }

        return provinces;        
    }

    private void dfs(int city, int[][] isConnected, Set<Integer> visited) {
        visited.add(city);
        for (int cur = 0; cur < isConnected[city].length; cur++) {
            int connected = isConnected[city][cur];
            if (connected == 1 && !visited.contains(cur)) {
                dfs(cur, isConnected, visited);
            }
        }
    }    
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-provinces/)