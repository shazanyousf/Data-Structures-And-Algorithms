public class Grid {
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
    public static int gridWays(int i, int j, int n, int m){
        if(i == n-1 && j == m-1){
            return 1;         // Base Case
        }
        else if(i == n || j == n){
            return 0;       //Boundary Case condition
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }
}
