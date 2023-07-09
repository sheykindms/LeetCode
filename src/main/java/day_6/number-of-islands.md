# 200. Number of Islands

https://leetcode.com/problems/number-of-islands/

```java
class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int islands = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    islands++;
                    traverse(grid, visited, i, j);
                }
            }
        }
        return islands;
    }
    public void traverse(char[][] grid, boolean[][] visited, int i, int j) {

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || visited[i][j] || grid[i][j] == '0') {
            return;
        }

        visited[i][j] = true;
        traverse(grid, visited, i + 1, j);
        traverse(grid, visited, i - 1, j);
        traverse(grid, visited, i, j - 1);
        traverse(grid, visited, i, j + 1);
    }
}
```
