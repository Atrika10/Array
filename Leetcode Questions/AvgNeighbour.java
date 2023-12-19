// This is leetcode POTD(19-12-2023)
public class AvgNeighbour {
    // this is the value we will add to find neighbour's index
    private static final int[][] directions = {
        {-1, -1}, {-1, 0}, {-1, 1},
        {0, -1}, {0, 0}, {0, 1},
        {1, -1}, {1, 0}, {1, 1}
    };

    // Time Complexity => O(n*m*9) => O(mn) where m => row & n => column
    // space Complexity =>  O(mn) where m => row & n => column ; storing the final answer
    public static int[][] imageSmoother(int[][] img) {
        int m = img.length;   // row
        int n = img[0].length; // column
        // declaring a new array where we will store the answer
        int[][] result = new int[m][n];

        // calculating the value of each cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0; // to store the total value of neighbours
                int count = 0; // count neighbours

                // Iterate over all nine indices.
                for (int[] direction : directions) {
                    // If the indices form a valid neighbor
                    int i_ = i + direction[0];
                    int j_ = j + direction[1];

                    // Checking Boundary conditions
                    if (0 <= i_ && i_ < m && 0 <= j_ && j_ < n) {
                        sum += img[i_][j_];
                        count += 1;
                    }
                }

                result[i][j] = sum / count;     // average calculations
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int img[][] = {{100,200,100},
                        {200,50, 200},
                        {100, 200, 100}};

        int ans[][] = imageSmoother(img);

        // print answer
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] +" ");
            }
            System.out.println();
        }
    }
}
