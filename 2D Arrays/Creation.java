// Creation of 2D array
import java.util.*;
public class Creation{
    public static boolean Search(int matrix[][], int key){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("Found at cell" +" " + i + "," + j);
                    return true;
                }
            }
        }
        System.out.println("Key Not Found");
        return false;
    }


    public static void printSmallestNumber(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Invalid matrix");
            return;
        }

        int smallest = matrix[0][0];

        // Iterate through the matrix to find the smallest number
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }

        System.out.println("The smallest number in the matrix is: " + smallest);
    }
    
    public static void main(String[] args) {
        int matrix [][] = new int [3] [3];
        
        int n = matrix.length, m = matrix[0].length;
        Scanner Sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix [i][j] = Sc.nextInt();
            }
        }
        //output
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
        Search(matrix,6);
        printSmallestNumber(matrix);
    }
}