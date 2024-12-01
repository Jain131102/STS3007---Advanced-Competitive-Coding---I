public class MazeSolver {

    // Define possible movements: Right, Down, Left, Up
    private static final int[][] DIRECTIONS = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; 

    // Solves the maze and returns true if a solution is found, false otherwise
    public static boolean solveMaze(int[][] maze, int startX, int startY, int endX, int endY, int[][] solution) {
        // Get the dimensions of the maze
        int rows = maze.length;
        int cols = maze[0].length;

        // Call the recursive helper function to solve the maze
        return solveMazeUtil(maze, startX, startY, endX, endY, solution);
    }

    // Recursive helper function to explore the maze
    private static boolean solveMazeUtil(int[][] maze, int x, int y, int endX, int endY, int[][] solution) {
        // Base case: If the current cell is the destination, mark it in the solution and return true
        if (x == endX && y == endY) {
            solution[x][y] = 1; 
            return true;
        }

        // Base case: If the current cell is invalid (out of bounds, a wall, or already visited), return false
        if (x < 0 || x >= maze.length || y < 0 || y >= maze[0].length || maze[x][y] == 0 || solution[x][y] == 1) {
            return false; 
        }

        // Mark the current cell as part of the solution path
        solution[x][y] = 1;

        // Explore all possible directions from the current cell
        for (int[] dir : DIRECTIONS) {
            // If a path is found from any direction, return true
            if (solveMazeUtil(maze, x + dir[0], y + dir[1], endX, endY, solution)) {
                return true; 
            }
        }

        // If no path is found from any direction, backtrack and unmark the current cell
        solution[x][y] = 0;
        return false;
    }

    public static void main(String[] args) {
        // Define the maze (1 represents a path, 0 represents a wall)
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 1, 0 },
                { 1, 1, 1, 1 }
        };

        // Initialize a solution matrix to store the path
        int[][] solution = new int[maze.length][maze[0].length]; 

        // Solve the maze and print the solution
        if (solveMaze(maze, 0, 0, 3, 3, solution)) {
            System.out.println("Solution Path:");
            for (int i = 0; i < solution.length; i++) {
                for (int j = 0; j < solution[0].length; j++) {
                    System.out.print(solution[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Maze cannot be solved.");
        }
    }
}
