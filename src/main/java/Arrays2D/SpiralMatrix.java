package Arrays2D;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                          {10,11,12,5},
                          {9,8,7,6}};
        printSpiralMatrix(matrix, matrix.length, matrix[0].length);
    }

    private static void printSpiralMatrix(int[][] matrix, int rows, int colums) {
        int top =0, left =0;
        int right =colums-1, bottom = rows-1;

        while(top <= bottom && left <= right){
            for (int i = left; i<= right; ++i){
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            for(int i = top; i<= bottom; ++i){
                System.out.print(matrix[i][right]+" ");
            }
            right--;

            if(top <= bottom){
                for(int i=right; i>= left; --i){
                    System.out.print(matrix[bottom][i]+" ");
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom; i>= top; i--){
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }
        }
    }
}
