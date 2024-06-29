public class Ratinmaze {
    public static void main(String[] args) {
        int [][] matrix = {{1,1,1,1}, 
                          {0,1,0,1}, 
                          {1,1,1,1}, 
                          {1,0,1,1}};
        int n = matrix.length;
        boolean [][] visited = new boolean[n][n];
        findAllPaths(0, 0, n, matrix, visited, "");
    }
    public static void findAllPaths(int i, int j, int n, int matrix[][], boolean [][]visited, String psf){
        if(i<0 || j < 0 || i >= n || j>=n){
            return;                                         //Base Case
        }
        if(matrix[i][j] == 0 || visited[i][j] == true){
            return;
        }
        if(i == n-1 && j == n-1){
            System.out.println("Reached to destination with path "+ psf);
            return;
        }
        visited[i][j] = true;
        findAllPaths(i-1, j, n, matrix, visited, psf + "U");//Up 
        findAllPaths(i+1, j, n, matrix, visited, psf + "D");//Down
        findAllPaths(i, j-1, n, matrix, visited, psf + "L");//Left
        findAllPaths(i, j+1, n, matrix, visited, psf + "R");//Right

        visited[i][j] = false;// You can visit this cell as part of some other path
    
    }
}
