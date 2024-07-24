package Arrays2D;
/*
Given a boolean 2D matrix, find the number of islands. A group of connected 1s forms an island.
 */
public class Islands {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 0, 1}
        };

        System.out.println("Number of islands is: " + countIslands(grid));
    }

    private static int countIslands(int[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;

        int numOfIslands = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    numOfIslands++;
                    dfs(grid, i, j);
                }
            }
        }
        return numOfIslands;
    }

    private static void dfs(int[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1)
            return;

        grid[i][j] = 0;
        dfs(grid, i+1,j);//down
        dfs(grid, i-1, j);//up
        dfs(grid, i, j+1);//right
        dfs(grid, i, j-1);//left
    }
}
