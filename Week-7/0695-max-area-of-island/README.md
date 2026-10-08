# Max Area of Island

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an `m x n` binary matrix `grid`. An island is a group of `1`'s (representing land) connected  **4-directionally**  (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The  **area**  of an island is the number of cells with a value `1` in the island.

Return  *the maximum  **area**  of an island in* `grid`. If there is no island, return `0`.

 

 **Example 1:** 

```
Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.

```

 **Example 2:** 

```
Input: grid = [[0,0,0,0,0,0,0,0]]
Output: 0

```

 

 **Constraints:** 

- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 50
- grid[i][j] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 64.02%)  
**Memory:** 46.1 MB (beats 97.29%)  
**Submitted:** 2026-10-08T03:53:18.915Z  

```java
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int maxIsland = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1 && !visited[r][c]) {
                    maxIsland = Math.max(maxIsland, dfs(grid, visited, r, c));
                }
            }
        }

        return maxIsland;        
    }

    private int dfs(int[][] grid, boolean[][] visited, int r, int c) {
        int rows = grid.length, cols = grid[0].length;
        if (r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c] || grid[r][c] == 0) {
            return 0;
        }

        visited[r][c] = true;
        return 1 + dfs(grid, visited, r + 1, c) + dfs(grid, visited, r - 1, c)
                 + dfs(grid, visited, r, c + 1) + dfs(grid, visited, r, c - 1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/max-area-of-island/)