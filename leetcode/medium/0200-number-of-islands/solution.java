class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int n = grid.length;
        int m = grid[0].length;

        // Step 1: Scan every tile on the ocean map
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                // Uncharted island discovered!
                if (grid[i][j] == '1') {
                    islands++;
                    bfs(i, j, grid); // Launch flood fill engine
                }

            }
        }
        return islands;
    }

    public static void bfs(int i, int j, char[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{i, j});
        
        int n = grid.length;
        int m = grid[0].length;

        // Sink origin tile immediately to mark as visited
        grid[i][j] = '0';

        while (!q.isEmpty()) {
            int a = q.size();

            for (int k = 0; k < a; k++) {
                int[] ind = q.poll();
                int x = ind[0];
                int y = ind[1];

                // ⬆️ Look UP
                if (x - 1 >= 0 && grid[x - 1][y] == '1') {
                    grid[x - 1][y] = '0'; // Sink neighbor
                    q.add(new int[]{x - 1, y});
                }

                // ⬅️ Look LEFT
                if (y - 1 >= 0 && grid[x][y - 1] == '1') {
                    grid[x][y - 1] = '0'; // Sink neighbor
                    q.add(new int[]{x, y - 1});
                }

                // ⬇️ Look DOWN
                if (x + 1 < n && grid[x + 1][y] == '1') {
                    grid[x + 1][y] = '0'; // Sink neighbor
                    q.add(new int[]{x + 1, y});
                }

                // ➡️ Look RIGHT
                if (y + 1 < m && grid[x][y + 1] == '1') {
                    grid[x][y + 1] = '0'; // Sink neighbor
                    q.add(new int[]{x, y + 1});
                }
            }
        }
    }
}