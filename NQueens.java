public class NQueens {
    private int N;
    private int[][] board;

    public NQueens(int N) {
        this.N = N;
        this.board = new int[N][N];
    }

    // Function to print the chessboard 
    void printSolution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + (board[i][j] == 1 ? "Q" : ".") + " ");
            }
            System.out.println();
        }
    }

    // Check if it's safe to place a queen at board[row][col]
    boolean isSafe(int row, int col) {
        // Check this row on the left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on the left side
        for (int i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Recursive function to solve N-Queens
    boolean solveNQUtil(int col) {
        if (col == N) { 
            return true; // All queens are placed
        }

        for (int i = 0; i < N; i++) {
            if (isSafe(i, col)) {
                board[i][col] = 1; // Place queen

                if (solveNQUtil(col + 1)) {
                    return true; // Solution found
                }

                board[i][col] = 0; // Backtrack if no solution
            }
        }
        return false; // No position found for this column
    }

    // Solves the N-Queens problem
    void solveNQ() {
        if (!solveNQUtil(0)) {
            System.out.print("Solution does not exist");
        } else {
            printSolution();
        }
    }

    public static void main(String args[]) {
        NQueens Queen = new NQueens(4);
        Queen.solveNQ();
    }
}
