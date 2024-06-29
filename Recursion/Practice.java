// //Write a program to print n numberrs in increasing order
// public class Practice{
//     public static void main(String[] args) {
//         int n = 5;
//         prntIncreasing(n);
//     }
//     public static void prntIncreasing(int n){
//         if(n == 1){
//             System.out.print(n+" ");
//             return ;
//         }
//         prntIncreasing(n-1);
//         System.out.print(n+" ");
//     }
// }


//Write a program to print n numbers in decreasing order
// public class Practice{
//     public static void main(String[] args) {
//         int n = 5;
//         prntIncreasing(n);
//     }
//     public static void prntIncreasing(int n){
//         if(n == 1){
//             System.out.print(n+" ");
//             return ;
//         }
//         System.out.print(n+" ");
//         prntIncreasing(n-1);
//     }
// }


// //Write a program to print factorial of a number
// public class Practice{
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(Factorial(n));
//     }
//    public static int Factorial(int n){
//     if(n == 0){
//         return 1;
//     }
//     int fnm1 = Factorial(n-1);
//     int fn = n*fnm1;
//     return fn;
//    }
// }


//Write a program to print sum of n natural numbers
//Write a program to print n numbers in decreasing order
// public class Practice{
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(sum(n));
//     }
//     public static int sum(int n){
//         if(n == 1){
//             return 1;
//         }
//         int snm1 = sum(n-1);
//         int son = n+snm1;
//         return son;
//     }
// }




// //Write a program to print nth Fibonacci number
// public class Practice{
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fib(n));
//     }
//    public static int fib(int n){
//     if(n == 0 || n== 1){
//         return n;
//     }
//     int fnm1 = fib(n-1);
//     int fnm2 = fib(n-2);
//     return fnm1 + fnm2;
//    }
// }




// //Write a program to check if a given array is sorted or not
// public class Practice{
//     public static void main(String[] args) {
//         int arr[] = {2,4,6,6,10};
//         System.out.println(isSorted(arr, 0));
//     }
//     public static boolean isSorted(int arr[], int i){
//         if(i == arr.length-1){
//             return true;
//         }
//         if(arr[i] > arr[i+1]){
//             return false;
//         }
//         return isSorted(arr, i+1);
//     }
    
// }





// //Write a program to check first occurence of an element
// public class Practice{
//     public static void main(String[] args) {
//         int arr[] = {2,4,6,6,10};
//         System.out.println(firstOccurence(arr, 10, 0));
//     }
//     public static int firstOccurence(int arr[], int key, int i){
//         if(i == arr.length){
//             return -1;
//         }
//         if(arr[i] == key){
//             return i;
//         }
//         return firstOccurence(arr,key, i+1);
//     }
    
// }





// //Write a program to check last occurence of an element
// public class Practice{
//     public static void main(String[] args) {
//         int arr[] = {2,4,6,6,10};
//         System.out.println(isSorted(arr, 6, 0));
//     }
//    public static int isSorted(int arr[], int key, int i){
//     if(i == arr.length){
//         return -1;
//     }
//     int isFound = isSorted(arr, key, i+1);
//     if(isFound == -1 && arr[i] == key){
//         return i;
//     }
//     return isFound;
//    }
// }



//Write a program to print power function - brute
// public class Practice{
//     public static void main(String[] args) {
//         int x = 2, n = 10;
//         System.out.println(powerB(2, 10));
//     }
//    public static int powerB(int x, int n){
//     if(n == 0){
//         return 1;
//     }
//     int xnm1 = powerB(x, n-1);
//     int xn = x*xnm1;
//     return xn;
//    }
// }




//Write a program to print power function - Optimized
// public class Practice{
//     public static void main(String[] args) {
//         int x = 2, n = 10;
//         System.out.println(powerB(2, 10));
//     }
//    public static int powerB(int x, int n){
//     if(n == 0){
//         return 1;
//     }
//     int halfPowerSq = powerB(x, n/2) * powerB(x, n/2);
//     if(n % 2 != 0){
//         halfPowerSq = x * halfPowerSq;
//     }
//     return halfPowerSq;
//    }
// }



// Tiling Problem
// public class Practice{
//     public static void main(String[] args) {
//         System.out.println(tilingProblem(2));
//     }
//     public static int tilingProblem(int n){
//         if(n == 0 || n == 1){
//             return 1;
//         }
//         int fnm1 = tilingProblem(n-1);
//         int fnm2 = tilingProblem(n-2);
//         int totalWays = fnm1 + fnm2;
//         return totalWays;
//     }

// }



// //Friends Pairing Problem
// public class Practice{
//     public static void main(String[] args) {
//         System.out.println(friendsPairing(3));
//     }
//     public static int friendsPairing(int n){
//         if(n == 1 || n == 2){
//             return n;
//         }
//         int fnm1 = friendsPairing(n-1);
//         int fnm2 = friendsPairing(n-2);
//         int pairWays = (n-1)* fnm2;
//         int totWays = fnm1 + pairWays;
//         return totWays;    
//     }
// }



//Tower of Hanoi
// public class Practice{
//     public static void main(String[] args) {
//         toh(3, 1, 3, 2);
//     }
//     public static void toh(int n, int a, int c, int b){
//         if( n == 0){
//             return;
//         }
//         toh(n-1, a, b, c);
//         System.out.println("Moving"+ n + "th disk from" + a + "to" + c);
//         toh(n-1, b, c, a);
//     }
// }


// //Binary Strings Problem
// public class Practice{
//     public static void main(String[] args) {
//         printBStrings(3, 0,"");
//     }
//     public static void printBStrings(int n, int lastPlace, String str){
//         if( n == 0){
//             System.out.println(str);
//             return ;
//         }
//         printBStrings(n-1, 0, str+("o"));
//         if(lastPlace == 0){
//             printBStrings(n-1, 1, str+(1));
//         }
//     }
// }


//Remove duplicates from a string
public class Practice{
    public static void main(String[] args) {
        String str = "shazanyousf";
        rDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void rDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char curr_char = str.charAt(idx);
        if(map[curr_char-'a'] == true){
            rDuplicates(str, idx+1, newStr, map);
        }
        else{
            rDuplicates(str, idx+1, newStr.append(curr_char), map);
        }
    }
}