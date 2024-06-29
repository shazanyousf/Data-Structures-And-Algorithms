// import java.util.*;
// public class AcitivitySelection{
//     public static void main(String[] args) {
//         int start [] = {1, 3, 0, 5, 8, 5};
//         int end [] = {2, 4, 6, 7, 9, 9};  // End time basics are sorted
//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();
//         maxAct = 1;
//         ans.add(0);
//         int lastEnd = end[0];
//         for(int i = 0; i<end.length; i++){
//             if(start[i] >= lastEnd){
//                 maxAct++;
//                 ans.add(i);
//                 lastEnd = end[i];
//             }
//         }
//         System.out.println("Maximum Acitivities = " + maxAct);
//         for(int i = 0; i<ans.size(); i++){
//             System.out.print("A" + ans.get(i) + " ");
//         }
//         System.out.println();
//     }
// }




// If End time basics are not sorted
import java.util.*;
public class AcitivitySelection{
    public static void main(String[] args) {
        int start [] = {1, 3, 0, 5, 8, 5};
        int end [] = {2, 4, 6, 7, 9, 9}; 
        //Sorting
        int acitivities [][] = new int[start.length][3];
        for(int i = 0; i<start.length; i++){
            acitivities[i][0] = i;
            acitivities[i][1] = start[i];
            acitivities[i][2] = end[i];
        }
        //Lambda Function short form
        Arrays.sort(acitivities, Comparator.comparingDouble(o->o[2]));//End time basics sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        //1st acitivity
        maxAct = 1;
        ans.add(acitivities[0][0]);
        int lastEnd = (acitivities[0][2]);
        for(int i = 1; i<end.length; i++){
            if((acitivities[i][1]) >= lastEnd){
                //Activity Select
                maxAct++;
                ans.add(acitivities[i][0]);;
                lastEnd = (acitivities[i][2]);;
            }
        }
        System.out.println("Maximum Acitivities = " + maxAct);
        for(int i = 0; i<ans.size(); i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}