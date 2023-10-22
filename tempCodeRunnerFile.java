public class tempCodeRunnerFile {
    public static void main(String[] args) {
        // Define two two-dimensional arrays
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        // Check if the arrays have the same dimensions
        if (array1.length != array2.length || array1[0].length != array2[0].length) {
            System.out.println("Arrays have different dimensions. Cannot compute the sum.");
            return;
        }

        // Initialize a result array with the same dimensions
        int[][] result = new int[array1.length][array1[0].length];

        // Calculate the sum of the arrays
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }

        // Display the result
        System.out.println("Sum of the two arrays:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}