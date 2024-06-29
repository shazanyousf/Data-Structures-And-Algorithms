import java.util.*;
public class abc{

    public static boolean search(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at (" + i + "," + j + ") ");
                    return true;
                }
            }
        }
        return false;
    }

    public static void smallest(int matrix[][]){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            System.out.println("Invalid Matrix");
        }
        int smallest = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("the smallest number in the matrix is : " + smallest);
    }


    public static void largest(int matrix[][]){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            System.out.println("Invalid Matrix");
        }
        int largest = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("the smallest number in the matrix is : " + largest);
    }


    public static void main(String [] args){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //Output
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 8);
        smallest(matrix);
        largest(matrix);
    }
}
