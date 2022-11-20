public class CellsWithOddValInMatrix {
    public int oddCells(int m, int n, int[][] indices){
        // initialize matrix
        int[][] matrix = new int[m][n];
        int totalOdds = 0;

        // increment
        for (int[] coord: indices) {
            int v = coord[0]; // vertical
            int h = coord[1]; // horizontal
            // increment horizontally
            for (int i = 0; i < matrix[v].length; i++) {
                int x = matrix[v][i];
                if (x % 2 == 0) {
                    totalOdds++;
                } else {
                    totalOdds--;
                }
                matrix[v][i]++;
            }
            // increment vertically
            for (int i = 0; i < matrix.length; i++) {
                int y = matrix[i][h];
                if (y % 2 == 0) {
                    totalOdds++;
                } else {
                    totalOdds--;
                }
                matrix[i][h]++;
            }
        }
        return totalOdds;
    }
}
