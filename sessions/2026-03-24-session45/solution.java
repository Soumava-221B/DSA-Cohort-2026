import java.util.*;

class Solution {
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> result = new ArrayList<>();
        int n = maze.length;
        
        if (maze[0][0] == 0 || maze[n-1][n-1] == 0) {
            return result;
        }
        
        boolean[][] visited = new boolean[n][n];
        
        solve(0, 0, maze, n, "", result, visited);
        
        return result;
    }
    
    private void solve(int i, int j, int[][] maze, int n, String path,
                       ArrayList<String> result, boolean[][] visited) {
        
        if (i == n - 1 && j == n - 1) {
            result.add(path);
            return;
        }
        
        visited[i][j] = true;
        
        if (i + 1 < n && maze[i + 1][j] == 1 && !visited[i + 1][j]) {
            solve(i + 1, j, maze, n, path + "D", result, visited);
        }
        
        if (j - 1 >= 0 && maze[i][j - 1] == 1 && !visited[i][j - 1]) {
            solve(i, j - 1, maze, n, path + "L", result, visited);
        }
        
        if (j + 1 < n && maze[i][j + 1] == 1 && !visited[i][j + 1]) {
            solve(i, j + 1, maze, n, path + "R", result, visited);
        }
        
        if (i - 1 >= 0 && maze[i - 1][j] == 1 && !visited[i - 1][j]) {
            solve(i - 1, j, maze, n, path + "U", result, visited);
        }
        
        visited[i][j] = false;
    }
}