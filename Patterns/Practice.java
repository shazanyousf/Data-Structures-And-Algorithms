// //solid rectangle
// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         System.out.println("Enter no of lines");
//         int l = Sc.nextInt();
//         System.out.println("Enter no of stars");
//         int s = Sc.nextInt();
//         for(int i = 1; i<=l; i++){
//             for(int j = 1; j<=s; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
    
// }




//Hollow Rectangle

// import java.util.Scanner;
// public class Practice {
//     public static void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         System.out.println("Enter no of lines");
//         int l = Sc.nextInt();
//         System.out.println("Enter no of stars");
//         int s = Sc.nextInt();

//         for(int i = 1; i<=l; i++){
//             for(int j = 1; j<=s; j++){
//                 if(i==1 || i ==l || j==1|| j==l){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// //Half Pyramid

// public class Practice{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//          }
//         }
//     }


//Inverted half Pyramid 1

// public class Practice{
//     public static void main(String[] args) {
//         int n = 6;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// Half Pyramid With Numbers One

// public class Practice{
//     public static void main(String[] args) {
//         int n = 5;
        
//         for(int i = n; i>=1; i--){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// //Half Pyramid With Numbers Two

// public class Practice{
//     public static void main(String[] args) {
//         int n = 5;
        
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }





// //Floyd's Triangle


// public class Practice{
//     public static void main(String[] args) {
//         int n = 5;
//         int number = 1;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(number+ " ");
//                 number++;
                
//             }
//             System.out.println();
//          }
//         }
//     }



//0-1 Triangle Pattern

// public class Practice{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 0; i<=n; i++){
//             for(int j = 0; j<=i; j++){
//                 if(j%2==0){
//                     System.out.print(0);
//                 }
//                 else{
//                     System.out.print(1);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//Butterfly Pattern

// import java.util.Scanner;
// public class Practice{
//     public static void main(String[] args) {
//         int n = 4;
        
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             int spaces = 2*(n-i);
//                 for(int j = 1; j<=spaces; j++){
//                     System.out.print("-");
//                 }
//                 for(int j = 1; j<=i;j++){
//                     System.out.print("*");

//                 }
            
//             System.out.println();
//         }

//         for(int i = n; i>=1; i--){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             int spaces = 2*(n-i);
//                 for(int j = 1; j<=spaces; j++){
//                     System.out.print("-");
//                 }
//                 for(int j = 1; j<=i;j++){
//                     System.out.print("*");

//                 }
            
//             System.out.println();
//         }
//     }
// }




// //Solid Rhombus
// public class Practice{
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i = 1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//Hollow Rhombus



// public class Practice{
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i = 1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n; j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }
//                 else{
//                 System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//Diamond Pattern

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args) {
//         int n = 8;
//         for(int i = 1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = n; i>=1; i--){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
       
//         }
//     }



//Number Pyramid

// public class Practice{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//          }
//          for(int j = i; j>=1; j--){
//                System.out.print(j);
//             }
//             for(int j = 2; j<=i; j++){
//                 System.out.print(j);
//             }
//          System.out.println();
//         }
//     }
// }




//Number Pyramid
public class Practice{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
         }
         for(int j = 1; j<=i; j++){
               System.out.print(i+" ");
            }
           
         System.out.println();
        }
    }
}