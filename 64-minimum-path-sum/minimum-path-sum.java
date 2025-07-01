class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] arr = new int[201][201];
        for(int[] rows : arr){
            Arrays.fill(rows, -1);
        }

        return solve(grid, 0, 0, n, m, arr);
    }

    private int solve(int[][] grid, int i, int j, int n, int m, int[][] arr) {
        if(i == n - 1 && j == m - 1){
            return grid[i][j];
        }
        if(arr[i][j] != -1){
            return arr[i][j];
        }
        if(i == n - 1) {    // only one option that is to go in right
            return arr[i][j] = grid[i][j] + solve(grid, i, j + 1, n, m, arr);
        }
        else if(j == m - 1) {   // only one option that is to go in bottom
             return arr[i][j] = grid[i][j] + solve(grid, i + 1, j, n, m, arr);
        }
        else{
            return arr[i][j] = grid[i][j] + Math.min(solve(grid, i + 1, j, n, m, arr), solve(grid, i, j + 1, n, m, arr));
        }
    }
}